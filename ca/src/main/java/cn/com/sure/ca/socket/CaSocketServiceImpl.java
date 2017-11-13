/**
 * 
 */
package cn.com.sure.ca.socket;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;

import cn.com.sure.ca.CaApplicationexception;
import cn.com.sure.ca.CaErrorMessageConstants;
import cn.com.sure.ca.template.entry.CaCertTemplate;
import cn.com.sure.ca.template.service.CaCertTemplateService;
import cn.com.sure.common.CaConstants;

/**
 * @author Limin
 *
 */
@Transactional(propagation = Propagation.REQUIRED)
@Service(value="caSocketService")
public class CaSocketServiceImpl implements CaSocketService{
	
	private static final Log LOG = LogFactory.getLog(CaSocketServiceImpl.class);
	
	@Autowired
	private CaCertTemplateService caCertTemplateService;

	/* (non-Javadoc)
	 * @see cn.com.sure.ca.socket.CaSocketService#handleSocket(byte[])
	 */
	@Override
	public byte[] handleSocket(byte[] reqinfo) throws CaApplicationexception {
		LOG.debug("synchronousCtml - start");
		
		//1.对申请信息进行处理
		String requestInfo=new String(reqinfo);
		
		if(requestInfo.equals(CaConstants.SYNCHRONOUS_CTML)){
			
			//1.1 查询所有在用证书模板,并封装成json返回给ra  List中kpgAlgorithm是syscode类型的，传输到ra端之后无法解析，只能解析后再传
			List<CaCertTemplate> caCertTemplates = caCertTemplateService.selectStandby();
			
			CaCertTemplate caCertTemplate = new CaCertTemplate();
			
			if(caCertTemplates==null){
				CaApplicationexception.throwException(CaErrorMessageConstants.ctmlNotExist, null);
			}
			
			
			List <CaCertTemplate> resCaCertTemplates = new ArrayList<>();
			for(int i=0;i<caCertTemplates.size();i++){
				
				caCertTemplate = caCertTemplates.get(i);
				
				//1.1.1获取密钥对算法和证书有效期天数
				caCertTemplate.setResKpgAlgorithm(caCertTemplate.getKpgAlgorithm().getParaValue());
				caCertTemplate.setResValidity(caCertTemplate.getValidity().getParaValue());
				
				resCaCertTemplates.add(caCertTemplate);
			}
			
			String jsonStr=JSON.toJSONString(resCaCertTemplates);
			
			return jsonStr.getBytes();
			
		}
		
		LOG.debug("synchronousCtml - end");
		return null;
	}

}
