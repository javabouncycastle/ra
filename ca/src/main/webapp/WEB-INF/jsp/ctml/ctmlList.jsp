<%@ page contentType="text/html;charset=utf8" pageEncoding="utf8" %>
<%@ taglib prefix="c" uri="/WEB-INF/c-1_0-rt.tld"%>
<!DOCTYPE html>
<%@ include file="../left.jsp" %>
<%@ include file="../footer.jsp" %>
<body>

        <div class="templatemo-content">
	          <ol class="breadcrumb">
	            <li><a href="<%=request.getContextPath()%>/main">主页面</a></li>
	            <li class="active">证书模板列表</li>
	            <li><a href="../../sign-in.html">Sign In Form</a></li>
	             <li><a href="javascript:add()">增加证书模板 /</a><a href="javascript:searchByCondition()"> 查询</a></li>
	          </ol>
        <div class="row">
            <div class="col-md-12">
            	 <c:if test="${success != null && success != ''}">
	                   <div class="alert alert-success alert-dismissible" role="alert">
	                      <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
	                      <strong>${msg}</strong> 
	                    </div>
	             </c:if> 
              <div class="table-responsive">
                <h4 class="margin-bottom-15">证书模板列表</h4>
                <table class="table table-bordered table-striped table-hover data-table">
		                  <thead>
		                    <tr bgcolor="CFCFCF">
		                      <th width="8%">主键</th>
		                      <th width="10%">模板名称</th>
		                      <th width="10%">密钥类型</th>
		                      <th width="10%">证书类型</th>
		                      <th width="10%">有效天数</th>
		                      <th width="10%">是否有效</th>
		                      <th width="10%">备注</th>
		                      <th width="16%">操作</th>
		                    </tr>
		                  </thead>
                    <tbody id="id_tbody_upd_list"> 
                    <c:forEach var="row" items="${certTemplates}">
                    	<!--  修改数据字典-->
	                    <tr id="upd_list_row_id_${row.id}" >
		                    <td>
		                    	<a href="javascript:edit('${row.id}','${row.ctmlName}','${row.kpgAlgorithm}','${row.isSingle }','${row.validity}','${row.isValid}')" class="btn btn-link">${row.id}</a>
		                    </td>
		                    <td>${row.ctmlName}</td>
		                    <td>${row.kpgAlgorithm.paraType}</td>
		                    <td>${row.isSingle}</td>
		                    <td>${row.validity}</td>
		                 	<td>${row.isValid=='0'?'否':'是'}</td>
		                    <td>${row.notes}</td>
		                    <td> <a href="javascript:remove('${row.id}')"  class="btn btn-link">删除</a>
		                    <c:if test="${row.isValid==1}">
					      		<a href="javascript:suspend('${row.id}')"  class="btn btn-link">停用</a> 
						    </c:if>
						      <c:if test="${row.isValid==0}">
						            <a href="javascript:activate('${row.id}')"  class="btn btn-link">启用</a>
						      </c:if> 
							</td>      		
	                    </tr>
                	</c:forEach>
               </table>
            </div>
          </div>
        </div>
       </div>
       
       
      <!-- 弹出窗口 ,修改数据字典内容-->
 	<div class="modal fade" id="modal_update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
              <h4 class="modal-title" >数据字典修改</h4>
            </div>
       
			<form action="update.do" method="post" >
           		 <div class="modal-header">
            		<div class="form">
            			<table id="id_cert_detail"  class="table table-striped table-hover table-bordered">
				             <c:if test="${success != null && message != ''}">               
					               <div class="alert alert-danger alert-dismissible" role="alert">
					                <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span>
					                 <span class="sr-only">Close</span></button>
					                 <strong>${msg}</strong> 
					               </div>  
					           </c:if> 
				                <div class="row">
				                  <div class="col-md-6 margin-bottom-15">
				                    <label for="id" class="control-label">主键</label>
				                    <input type="number" min="0" class="form-control" name="id" id="id" readonly="readonly"  required="required">                  
				                  </div>
                  
				                  <div class="col-md-6 margin-bottom-15">
				                    <label for="paraValue" class="control-label">参数名称</label>
				                    <input type="text" class="form-control" id="paraCode" name="paraCode" required="required"/>                 
				                  </div>
				                </div>
				                
				                <div class="row">
				                  <div class="col-md-6 margin-bottom-15">
				                    <label for="notes" class="control-label">参数值</label>
				                    <input type="text" class="form-control" id="paraValue" name="paraValue" required="required"/>     
				                  </div>
				                  <div class="col-md-6 margin-bottom-15">
				                    <label for="notes" class="control-label">所属类型</label>
				                    <select class="form-control margin-bottom-15" name="paraType.id" id="paratypeInfo" required="required">
				                    	<option value="">--请选择--</option>
				                    	<c:forEach var="frs" items="${sysCodeTypes}">
				                    		<option value="${frs.id}">${frs.paraType}</option>
				                    	</c:forEach>
				                    </select>    
				                  </div>
				                </div>
                  
				                <div class="row">
				                  <div class="col-md-6 margin-bottom-15">
				                    <label for="isValid" class="control-label">是否有效</label>
				                     <select class="form-control margin-bottom-15" name="isValid" id="isValid"  >
									      <option value="1"  >是</option>
									      <option value="0"  >否</option>
				                  	   </select>                 
				                  </div>
				                </div>	
				                  <div class="row">
				                  <div class="col-md-12 margin-bottom-15">
				                    <label for="notes" class="control-label">备注 </label>
				                    <textarea class="form-control" rows="3" id="notes" name="notes"></textarea>
				                  </div>
				                </div>
            				</table>
            			</div>          
			            <div class="modal-footer">
			            	<button type="submit" class="btn btn-primary">保存</button>
			             <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
			            </div>
          			</div>
         		</form>
            </div>         
           </div>          
          </div>
       
       
   </body>     
 <script type="text/javascript">
  $(document).ready(function(){
	
	$('.data-table').dataTable({
		"bJQueryUI": true,
		"sPaginationType": "full_numbers",
		"sDom": '<""l>t<"F"fp>'
	});
 });
 
function remove(id){
   if (confirm("您确实要刪除该记录吗？")){
     self.location.replace("remove.do?&id="+id);
   }
}   

function suspend(id){
     self.location.replace("suspend.do?&id="+id);
}

function activate(id){
     self.location.replace("activate.do?&id="+id);
}

//修改的初始化页面            
function edit(id,paraCode,paraValue,paraType,isValid,notes){
			$("#modal_update input[name='id']").val(id);
			$("#modal_update input[name='paraCode']").val(paraCode);
			$("#modal_update input[name='paraValue']").val(paraValue);
			$("#modal_update select[name='paraType.id']").val(paraType);
			$("#modal_update input[name='isValue']").val(isValid);	
			$("#modal_update [id='notes']").val(notes);
			$("#modal_update").modal('show');
}

function add(){
	self.location.replace("forWardInsert.do");
}

function searchByCondition(){
	if($("#searchCondition").is(":hidden")){
		$("#searchCondition").show();
	}else{
		$("#searchCondition").hide();
	}
}
</script>

<c:if test="${success != null && success != ''}">     
<script type="text/javascript">
 document.getElementById("upd_list_row_id_${success}").className="success";
</script>
</c:if> 
 
<c:if test="${message != null && message != ''}">     
	<script type="text/javascript">
	 	$("#modal_insert").modal('show');
	</script>
</c:if> 
