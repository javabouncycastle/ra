package cn.com.sure.syscode.dao;

import java.util.List;

import cn.com.sure.syscode.entry.SysCode;

public interface SysCodeDAO {


	/**
	 * @param sysCode
	 * @return 
	 */
	public List<SysCode> serachByContion(SysCode sysCode);

	/**
	 * @param sysCode
	 * @return
	 */
	public SysCode findByName(SysCode sysCode);

	/**
	 * @param sysCode
	 * @return
	 */
	public int insert(SysCode sysCode);

	/**
	 * @param sysCode
	 * @return
	 */
	public int update(SysCode sysCode);

	/**
	 * @param id
	 * @return
	 */
	public int delete(String id);

	/**
	 * @param id
	 * @return
	 */
	public SysCode findById(String id);

	/**
	 * @param sysCode
	 */
	public void updateValid(SysCode sysCode);

	/**
	 * @return
	 */
	public List<SysCode> selectAll();

	/**
	 * @param sysCode
	 * @return
	 */
	public List<SysCode> findByType(SysCode sysCode);

	/**
	 * @param keyPairAlgorithm
	 */
	public void deleteByParaCode(String keyPairAlgorithm);


}
