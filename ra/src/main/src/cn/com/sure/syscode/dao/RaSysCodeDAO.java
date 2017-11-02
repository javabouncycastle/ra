package cn.com.sure.syscode.dao;

import java.util.List;

import cn.com.sure.syscode.entry.RaSysCode;

public interface RaSysCodeDAO {

	public int insert(RaSysCode sysCode);

	public RaSysCode findByName(RaSysCode sysCode);

	public List<RaSysCode> selectAll(RaSysCode sysCode);

	public int delete(Long id);

	public RaSysCode findById(Long id);

	public void updateValid(RaSysCode sysCode);

	public int update(RaSysCode sysCode);
	
	public List<RaSysCode> findByType(RaSysCode sysCode);

	/**
	 * @param sysCode
	 * @return 
	 */
	public List<RaSysCode> serachByContion(RaSysCode sysCode);

	/**
	 * @param algorithmName
	 * @return
	 */
	public int countNum(String algorithmName);

	/**
	 * @param sysCode
	 * @return
	 */
	public List<RaSysCode> selectMin(RaSysCode sysCode);

	/**
	 * @param sysCode
	 * @return
	 */
	public List<RaSysCode> selectBuffer(RaSysCode sysCode);

	/**
	 * @param sysCode
	 * @return
	 */
	public List<RaSysCode> selectBufSize(RaSysCode sysCode);


}
