package cn.com.sure.ca;

public class CaApplicationexception extends Exception{

	/**
	 * application�쳣
	 */
	private static final long serialVersionUID = -1441961842085031455L;
	Exception underlyingException;
    int errorCode = -1;
    

    
    public CaApplicationexception(String message){
    	super(message);
    }
    
    public CaApplicationexception(String message, Exception e){
    	
    	super(message);
        underlyingException = e;
    }
    
    public CaApplicationexception(int errorCode){
        super("Error - "+errorCode);
		this.errorCode = errorCode;
	}
    
    public CaApplicationexception(int errorCode,String message){
        super(message);
		this.errorCode = errorCode;
	}
    
    public CaApplicationexception(int errorCode,String message, Exception e)
    {
        super(message);
		this.errorCode = errorCode;
        underlyingException = e;
    }
    
    public Exception getUnderlyingException()
    {
        return underlyingException;
    }

    public Throwable getCause()
    {
        return underlyingException;
    }

	public int getErrorCode() {
		return errorCode;
	}
	
	  public static void throwException(int errCode,Object[] args) throws CaApplicationexception{
	    	String message = ResourceBundleErrorMessage.getInstance().getMessage(errCode, args);
	    	throw new CaApplicationexception(errCode,message);
	    }

	 
}
