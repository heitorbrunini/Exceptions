package exceptions;

public class DomainError extends Exception{
	private static final long serialVersionUID = 1L;
	
	public DomainError(String msg){
		super(msg);
	}

}
