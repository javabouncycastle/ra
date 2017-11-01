/**
 * 
 */
package cn.com.sure.ca.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


/**
 * @author Limin
 *
 */
public class CaSocketThread extends Thread{
	

	private CaSocketService socketService;
	
	private Socket socket;
	

	public CaSocketThread(Socket socket,CaSocketService socketService) {
		this.socket=socket;
		this.socketService=socketService;
	}
	
	
	public void run(){
		
		try {
			 
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			dis = new DataInputStream(socket.getInputStream());  
	         
			byte[] reqlenbyte = new byte[4];//请求的byte的长度
			int reqlen = 0;
			byte[] buffer = new byte[1024];//缓存数据，每次读取byte的一部分
			int bufbuflength = 0;
			
			int bufferlength = dis.read(reqlenbyte);
			
			if(bufferlength == 4){
				reqlen =byteToInt(reqlenbyte);
			}
			
			byte[] reqinfo = new byte[reqlen];				
			System.out.println("begin receive need:" + reqlen);								
			
			while(reqlen > 0){
				bufferlength = dis.read(buffer);
				if(bufferlength > 0){						
					//源数组,源数组要复制的起始位置,目的数组,目的数组放置的起始位置,复制的长度
					System.arraycopy(buffer, 0, reqinfo, bufbuflength, bufferlength);
					bufbuflength = bufbuflength + bufferlength;
					reqlen = reqlen - bufferlength;							
				}
			}
			
			byte[] responseByte=null;
 	        
 	        try {
 	        	//调用socketService实现业务逻辑
				
			} catch (Exception e) {
				
			}
	        //返回 
	        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			byte[] byt = responseByte;
	        
	        dos.write(byt);
	        dos.flush();
	        
	        
	        dos.close();
	        dis.close();
		    socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static int byteToInt(byte[] byaValue) {         
		int nValue = 0; 
		for (int i = 0; i < byaValue.length; i++){          
			nValue += (byaValue[i] & 0xFF) << (8 * (3 - i)); 
		}
		return nValue;
	}
}
