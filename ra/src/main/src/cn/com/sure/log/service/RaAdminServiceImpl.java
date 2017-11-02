/**
 * 
 */
package cn.com.sure.log.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.sure.admin.entry.RaAdmin;
import cn.com.sure.log.dao.RaAdminDAO;

/**
 * @author Limin
 *
 */
@Transactional(propagation = Propagation.REQUIRED)
@Service("AdminService")
public class RaAdminServiceImpl implements RaAdminService{
	
	private static final Log LOG = LogFactory.getLog(RaAdminServiceImpl.class);
	
	@Autowired
	RaAdminDAO adminDAO;

	/* (non-Javadoc)
	 * @see cn.com.sure.commom.service.AdminService#fingByAdmId(int)
	 */
	@Override
	public RaAdmin fingByAdmId(int adminAuthNum) {
		LOG.debug("fingByAdmId - start");
		RaAdmin admin = adminDAO.fingByAdmId(adminAuthNum);
		LOG.debug("fingByAdmId - end");
		return admin;
	}

}
