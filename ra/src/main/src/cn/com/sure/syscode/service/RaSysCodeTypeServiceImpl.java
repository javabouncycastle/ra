/**
 * 
 */
package cn.com.sure.syscode.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.sure.ra.RaApplicationexception;
import cn.com.sure.ra.RaErrorMessageConstants;
import cn.com.sure.syscode.dao.RaSysCodeTypeDAO;
import cn.com.sure.syscode.entry.RaSysCodeType;

/**
 * @author Limin
 *
 */
@Transactional(propagation = Propagation.REQUIRED)
@Service("SysCodeTypeService")
public class RaSysCodeTypeServiceImpl implements RaSysCodeTypeService {
	
	private static final Log LOG = LogFactory.getLog(RaSysCodeTypeServiceImpl.class);
	
	@Autowired
	private RaSysCodeTypeDAO sysCodeTypeDAO;

	/* (non-Javadoc)
	 * @see cn.com.sure.syscode.service.SysCodeTypeService#insert(cn.com.sure.syscode.entry.SysCodeType)
	 */
	@Override
	public int insert(RaSysCodeType sysCodeType) throws RaApplicationexception {
		LOG.debug("insert - start");
		RaSysCodeType dbSysCodeType = sysCodeTypeDAO.findByType(sysCodeType.getParaType());
		int i = 0;
		if(dbSysCodeType==null){
			i = sysCodeTypeDAO.insert(sysCodeType);
		}if(dbSysCodeType!=null){
			RaApplicationexception.throwException(RaErrorMessageConstants.paraTypeValueExist, new String[]{sysCodeType.getParaType()});
		}
		LOG.debug("insert - start");
		return i;
	}

	/* (non-Javadoc)
	 * @see cn.com.sure.syscode.service.SysCodeTypeService#update(cn.com.sure.syscode.entry.SysCodeType)
	 */
	@Override
	public int update(RaSysCodeType sysCodeType) {
		LOG.debug("update - start");
		int i = sysCodeTypeDAO.update(sysCodeType);
		LOG.debug("update - start");
		return i;
	}

	/* (non-Javadoc)
	 * @see cn.com.sure.syscode.service.SysCodeTypeService#delete(java.lang.Long)
	 */
	@Override
	public int delete(Long id) {
		LOG.debug("delete - start");
		int i = sysCodeTypeDAO.delete(id);
		LOG.debug("delete - start");
		return i;
	}

	/* (non-Javadoc)
	 * @see cn.com.sure.syscode.service.SysCodeTypeService#selectAll(cn.com.sure.syscode.entry.SysCodeType)
	 */
	@Override
	public List<RaSysCodeType> selectAll(RaSysCodeType sysCodeType) {
		LOG.debug("selectAll - start");
		List<RaSysCodeType> sysCodeTypes = sysCodeTypeDAO.selectAll(sysCodeType);
		LOG.debug("selectAll - end");
		return sysCodeTypes;
	}

	/* (non-Javadoc)
	 * @see cn.com.sure.syscode.service.SysCodeTypeService#searchByCondition(cn.com.sure.syscode.entry.SysCodeType)
	 */
	@Override
	public List<RaSysCodeType> searchByCondition(RaSysCodeType sysCodeType) {
		LOG.debug("searchByCondition - start");
		List<RaSysCodeType> sysCodeTypes = sysCodeTypeDAO.searchByCondition(sysCodeType);
		LOG.debug("searchByCondition - end");
		return sysCodeTypes;
	}

	/* (non-Javadoc)
	 * @see cn.com.sure.syscode.service.SysCodeTypeService#selectById(java.lang.Long)
	 */
	@Override
	public RaSysCodeType selectById(Long id) {
		LOG.debug("selectById - start");
		RaSysCodeType sysCodeTypes = sysCodeTypeDAO.selectById(id);
		LOG.debug("selectById - end");
		return sysCodeTypes;
	}

}
