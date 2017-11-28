/**
 * 
 */
package cn.com.sure.ra.cert.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.com.sure.ctml.entry.RaCertTemplate;
import cn.com.sure.ctml.service.RaCertTemplateService;
import cn.com.sure.ra.cert.entry.RaCertificateRequest;
import cn.com.sure.ra.cert.service.RaCertificateRequestService;

/**
 * @author Limin
 *
 */
@Controller
@RequestMapping(value="raCertRequest")
public class RaCertificateRequestController {
	
	private static final Log LOG = LogFactory.getLog(RaCertificateRequestController.class);
	
	@Autowired
	private RaCertTemplateService raCertTemplateService;
	
	@Autowired
	private RaCertificateRequestService raCertificateRequestService;
	
	
	/**
	 * 跳转到新增页面
	 * @return
	 */
	@RequestMapping(value="forwardInsert")
	public ModelAndView forwardInsert(){
		LOG.debug("forwardInsert - start");
		
		//1.查询证书模板
		List<RaCertTemplate> raCertTemplates = raCertTemplateService.selectAll();
		
		LOG.debug("forwardInsert - end");
		return new ModelAndView("raCertRequest/certRequestAdd").addObject("raCertTemplates",raCertTemplates);
	}
	
	@RequestMapping(value = "insert")
	public ModelAndView insert(RaCertificateRequest raCertificateRequest,
			Model model, RedirectAttributes attr,HttpServletRequest request){
		LOG.debug("insert - start");
		int i = raCertificateRequestService.insert(raCertificateRequest);
		System.out.println(raCertificateRequest.getId());
		LOG.debug("insert - end");
		return new ModelAndView().addObject("", "");
	}

}
