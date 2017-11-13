/**
 * 
 */
package cn.com.sure.log.web;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.com.sure.common.BaseController;
import cn.com.sure.log.entry.RaAuditOpLog;
import cn.com.sure.log.service.RaAuditOpLogService;
import cn.com.sure.ra.RaErrorMessageConstants;
import cn.com.sure.syscode.web.RaSysCodeController;

/**
 * @author Limin
 *
 */
@Controller
@RequestMapping(value="auditOpLog")
public class RaAuditOpLogController extends BaseController {
	
	private static final Log LOG = LogFactory.getLog(RaSysCodeController.class);
	
	@Autowired
	private RaAuditOpLogService auditOpLogService;
	
	/**
	 * 查询所有日志
	 * @return
	 */
	@RequestMapping(value="selectAll")
	public ModelAndView selectAll(){
		LOG.debug("selectAll - start");
		List<RaAuditOpLog> auditOpLogs = auditOpLogService.selectAll();
		LOG.debug("selectAll - end");
		return new ModelAndView("auditOpLog/auditOpLogList").addObject("auditOpLogs", auditOpLogs);
		
	}
	
	/**
	 * 按条件查询
	 * @param auditOpLog
	 * @param model
	 * @param attr
	 * @param request
	 * @return
	 */
	@RequestMapping(value="searchByCondition")
	public ModelAndView searchByCondition(RaAuditOpLog auditOpLog,
			Model model, RedirectAttributes attr,HttpServletRequest request){
		LOG.debug("searchByCondition - start");
		List<RaAuditOpLog> auditOpLogs = auditOpLogService.searchByCondition(auditOpLog);
		LOG.debug("searchByCondition - end");
		return new ModelAndView("auditOpLog/auditOpLogList").addObject("auditOpLogs", auditOpLogs).addObject("auditOpLog",auditOpLog);
	}
	
	@RequestMapping(value="exportExcel")
	public String exportExcel(HttpServletResponse response,RaAuditOpLog auditOpLog) throws Exception{
		LOG.debug("exportExcel - start");
		 response.setContentType("application/binary;charset=UTF-8");
		 try {
			ServletOutputStream out=response.getOutputStream();
			String fileName=new String(("日志表"+ new SimpleDateFormat("yyyy-MM-dd").format(new Date())).getBytes(),"UTF-8");
			response.setHeader("Content-disposition", "attachment; filename=" + fileName + ".xls");
			String[] titles = { "", "", "", "","","","","","","" }; 
			auditOpLogService.exportExcel(titles, out,auditOpLog);
		 return "redirect:/auditOpLog/selectAll.do.do";
		} catch (IOException e) {
			e.printStackTrace();
			return String.valueOf(RaErrorMessageConstants.exportError);
		}
		
	}
	

}
