/**
 * 
 */
package cn.com.sure.log.dao;

import cn.com.sure.admin.entry.RaAdmin;

/**
 * @author Limin
 *
 */
public interface RaAdminDAO {

	/**
	 * @param adminAuthNum
	 * @return
	 */
	RaAdmin fingByAdmId(int adminAuthNum);

}
