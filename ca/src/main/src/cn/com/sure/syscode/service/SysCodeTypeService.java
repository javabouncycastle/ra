/**
 * 
 */
package cn.com.sure.syscode.service;

import java.util.List;

import cn.com.sure.ca.CaApplicationexception;
import cn.com.sure.syscode.entry.SysCodeType;

/**
 * @author Limin
 *
 */
public interface SysCodeTypeService {

	/**
	 * @param sysCodeType
	 * @return 
	 */
	int insert(SysCodeType sysCodeType)throws CaApplicationexception;

	/**
	 * @param sysCodeType
	 * @return 
	 */
	int update(SysCodeType sysCodeType);

	/**
	 * @param id
	 * @return 
	 */
	int delete(String id);

	/**
	 * @param sysCodeType
	 * @return
	 */
	List<SysCodeType> selectAll(SysCodeType sysCodeType);

	/**
	 * @param sysCodeType
	 * @return
	 */
	List<SysCodeType> searchByCondition(SysCodeType sysCodeType);

	/**
	 * @param string
	 * @return
	 */
	SysCodeType selectById(String string);

	/**
	 * @param keyPairAlgorithm
	 * @return 
	 */
	SysCodeType findIdByParaType(String keyPairAlgorithm);
	
}
