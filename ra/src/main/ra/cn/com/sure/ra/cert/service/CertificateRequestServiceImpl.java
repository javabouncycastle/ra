/**
 * 
 */
package cn.com.sure.ra.cert.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.com.sure.ra.cert.dao.CertificateRequestDAO;

/**
 * @author Limin
 *
 */
public class CertificateRequestServiceImpl implements CertificateRequestService{
	
	private static final Log LOG = LogFactory.getLog(CertificateRequestServiceImpl.class);
	
	@Autowired
	private CertificateRequestDAO certificateRequestDAO;
	

	/* (non-Javadoc)
	 * @see cn.com.sure.ra.cert.service.CertificateRequestService#insert(cn.com.sure.ra.cert.service.CertificateRequestService)
	 */
	@Override
	public int insert(CertificateRequestService certificateRequestService) {
		LOG.debug("insert");
		int i = certificateRequestDAO.insert(certificateRequestService);
		LOG.debug("insert");
		return i;
	}

}
