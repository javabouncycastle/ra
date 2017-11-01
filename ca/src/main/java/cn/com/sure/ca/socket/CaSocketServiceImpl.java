/**
 * 
 */
package cn.com.sure.ca.socket;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Limin
 *
 */
public class CaSocketServiceImpl implements CaSocketService{
	
	private static final Log LOG = LogFactory.getLog(CaSocketServiceImpl.class);
	
	


	/* (non-Javadoc)
	 * @see cn.com.sure.ca.socket.SocketService#synchronousKpg()
	 */
	@Override
	public byte[] synchronousKpg() {
		LOG.debug("synchronousKpg - start");
		//byte[] synchronousKpg =  
		LOG.debug("synchronousKpg - end");
		return null;
	}

}
