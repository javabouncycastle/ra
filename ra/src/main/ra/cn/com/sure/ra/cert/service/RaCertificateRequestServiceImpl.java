/**
 * 
 */
package cn.com.sure.ra.cert.service;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.sure.ra.cert.dao.RaCertificateRequestDAO;
import cn.com.sure.ra.cert.entry.RaCertificateRequest;

/**
 * @author Limin
 *
 */
@Transactional(propagation = Propagation.REQUIRED)
@Service("RaCertificateRequestService")
public class RaCertificateRequestServiceImpl implements RaCertificateRequestService{
	
	private static final Log LOG = LogFactory.getLog(RaCertificateRequestServiceImpl.class);
	
	Date date = new Date();
	
	@Autowired
	private RaCertificateRequestDAO raCertificateRequestDAO;

	/* (non-Javadoc)
	 * @see cn.com.sure.ra.cert.service.RaCertificateRequestService#insert(cn.com.sure.ra.cert.entry.RaCertificateRequest)
	 */
	@Override
	public int insert(RaCertificateRequest raCertificateRequest) {
		LOG.debug("insert - start");
		raCertificateRequest.setRequestTime(date);
		int i = raCertificateRequestDAO.insert(raCertificateRequest);
		LOG.debug("insert - end");
		return i;
	}
	
	

}
