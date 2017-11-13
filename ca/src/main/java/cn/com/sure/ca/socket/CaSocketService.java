/**
 * 
 */
package cn.com.sure.ca.socket;

import cn.com.sure.ca.CaApplicationexception;


/**
 * @author Limin
 *
 */
public interface CaSocketService {

	/**
	 * @param reqinfo
	 * @return
	 */
	byte[] handleSocket(byte[] reqinfo)throws CaApplicationexception;
	

	

}
