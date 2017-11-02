/**
 * 
 */
package cn.com.sure.syscode.dao;

import java.util.List;

import cn.com.sure.syscode.entry.RaSysCodeType;

/**
 * @author Limin
 *
 */
public interface RaSysCodeTypeDAO {

	/**
	 * @param paraType
	 * @return 
	 */
	public RaSysCodeType findByType(String paraType);

	/**
	 * @param sysCodeType
	 * @return 
	 */
	public int insert(RaSysCodeType sysCodeType);

	/**
	 * @param sysCodeType
	 * @return 
	 */
	public int update(RaSysCodeType sysCodeType);

	/**
	 * @param sysCodeType
	 */
	public List<RaSysCodeType> selectAll(RaSysCodeType sysCodeType);

	/**
	 * @param id
	 * @return 
	 */
	public int delete(Long id);

	/**
	 * @param sysCodeType
	 * @return
	 */
	public List<RaSysCodeType> searchByCondition(RaSysCodeType sysCodeType);

	/**
	 * @param id
	 * @return
	 */
	public RaSysCodeType selectById(Long id);
}
