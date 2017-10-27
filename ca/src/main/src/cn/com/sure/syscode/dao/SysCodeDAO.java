package cn.com.sure.syscode.dao;

import java.util.List;

import cn.com.sure.syscode.entry.SysCode;

public interface SysCodeDAO {

	public int insert(SysCode sysCode);

	public SysCode findByName(SysCode sysCode);

	public List<SysCode> selectAll();

	public int delete(String id);

	public SysCode findById(String id);

	public void updateValid(SysCode sysCode);

	public int update(SysCode sysCode);
	
	public List<SysCode> findByType(SysCode sysCode);

	/**
	 * @param sysCode
	 * @return 
	 */
	public List<SysCode> serachByContion(SysCode sysCode);


}
