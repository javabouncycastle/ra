package cn.com.sure.syscode.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cn.com.sure.ca.CaApplicationexception;
import cn.com.sure.syscode.entry.SysCode;

public interface SysCodeService {
	
	
	/**
	 * @param sysCode
	 * @param request
	 * @return
	 */
	int insert(SysCode sysCode, HttpServletRequest request)throws  CaApplicationexception ;


	/**
	 * @param sysCode
	 * @return
	 */
	List<SysCode> selectAll();
	
	/**
	 * @param sysCode
	 * @return
	 */
	List<SysCode> searchByCondition(SysCode sysCode);

	/**
	 * @param string
	 * @return
	 */
	SysCode selectById(String string);

	/**
	 * @param sysCode
	 * @return
	 */
	List<SysCode> selectByParatype(SysCode sysCode);


	/**
	 * @param sysCode
	 * @return
	 */
	int update(SysCode sysCode);


	/**
	 * @param id
	 * @return
	 */
	int remove(String id);


	/**
	 * @param id
	 */
	void suspend(String id);


	/**
	 * @param id
	 */
	void activate(String id);



	/**
	 * @param keyPairAlgorithm
	 */
	void deleteByParaCode(String keyPairAlgorithm);



}
