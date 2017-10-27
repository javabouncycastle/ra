/**
 * 
 */
package cn.com.sure.ca.template.dao;

import java.util.List;

import cn.com.sure.ca.template.entry.CertTemplate;

/**
 * @author Limin
 *
 */
public interface CertTemplateDAO {

	/**
	 * @return 
	 * 
	 */
	public List<CertTemplate> selectAll();

	/**
	 * @param certTemplate
	 * @return
	 */
	public int insert(CertTemplate certTemplate);

	/**
	 * @param certTemplate
	 * @return
	 */
	public int update(CertTemplate certTemplate);


	/**
	 * @param id
	 * @return
	 */
	public int remove(String id);

	/**
	 * @param id
	 * @return
	 */
	public CertTemplate findById(String id);

	/**
	 * @param certTemplate
	 * @return
	 */
	public int updateValid(CertTemplate certTemplate);


}
