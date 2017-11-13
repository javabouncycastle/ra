/**
 * 
 */
package cn.com.sure.ra.cert.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.com.sure.ctml.service.RaCertTemplateServiceImpl;
import cn.com.sure.log.entry.RaAuditOpLog;
import cn.com.sure.ra.cert.service.CertificateRequestService;



/**
 * @author Limin
 *
 */
public class CertificateRequestController {
	
	private static final Log LOG = LogFactory.getLog(RaCertTemplateServiceImpl.class);
	
	@Autowired
	private CertificateRequestService certificateRequestService;
	
	@Autowired
	private RaAuditOpLog auditOpLog;
	
	
	/**
	 * 
	 * @param certificateRequest
	 * @param model
	 * @param attr
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "insert")
	public String insert(CertificateRequest certificateRequest,
			Model model, RedirectAttributes attr,HttpServletRequest request){
		LOG.debug("insert - start");
		int i = certificateRequestService.insert(certificateRequestService);
		LOG.debug("insert - end");
		return null;
		
	}

}
