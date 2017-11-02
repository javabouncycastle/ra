package cn.com.sure.ra;

public class RaApplicationexception extends Exception{

	/**
	 * application�쳣
	 */
	private static final long serialVersionUID = -1441961842085031455L;
	Exception underlyingException;
    int errorCode = -1;
    

    
    public RaApplicationexception(String message){
    	super(message);
    }
    
    public RaApplicationexception(String message, Exception e){
    	
    	super(message);
        underlyingException = e;
    }
    
    public RaApplicationexception(int errorCode){
        super("Error - "+errorCode);
		this.errorCode = errorCode;
	}
    
    public RaApplicationexception(int errorCode,String message){
        super(message);
		this.errorCode = errorCode;
	}
    
    public RaApplicationexception(int errorCode,String message, Exception e)
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
	
	  public static void throwException(int errCode,Object[] args) throws RaApplicationexception{
	    	String message = ResourceBundleErrorMessage.getInstance().getMessage(errCode, args);
	    	throw new RaApplicationexception(errCode,message);
	    }

	 
}
