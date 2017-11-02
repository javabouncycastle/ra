/**
 * 
 */
package cn.com.sure.syscode.service;

import java.util.List;

import cn.com.sure.ra.RaApplicationexception;
import cn.com.sure.syscode.entry.RaSysCodeType;

/**
 * @author Limin
 *
 */
public interface RaSysCodeTypeService {

	/**
	 * @param sysCodeType
	 * @return 
	 */
	int insert(RaSysCodeType sysCodeType)throws RaApplicationexception;

	/**
	 * @param sysCodeType
	 * @return 
	 */
	int update(RaSysCodeType sysCodeType);

	/**
	 * @param id
	 * @return 
	 */
	int delete(Long id);

	/**
	 * @param sysCodeType
	 * @return
	 */
	List<RaSysCodeType> selectAll(RaSysCodeType sysCodeType);

	/**
	 * @param sysCodeType
	 * @return
	 */
	List<RaSysCodeType> searchByCondition(RaSysCodeType sysCodeType);

	/**
	 * @param id
	 * @return
	 */
	RaSysCodeType selectById(Long id);
	
}
