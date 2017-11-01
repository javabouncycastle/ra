/**
 * 
 */
package cn.com.sure.ca.socket;

import java.net.ServerSocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.context.support.XmlWebApplicationContext;



/**
 * @author Limin
 *
 */
public class CaStartSocket implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	private CaSocketService socketService;
	
	private ServerSocket serverSocket;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		
	   if (event.getSource() instanceof XmlWebApplicationContext) {
           if (((XmlWebApplicationContext) event.getSource()).getDisplayName().equals("Root WebApplicationContext")) {
        	   
        	   new Thread(new CaStartSocketThread(socketService,serverSocket)).start();
        
           }
       }
	}

}
