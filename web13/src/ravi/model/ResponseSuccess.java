package ravi.model;

public class ResponseSuccess {
	
	private boolean success;
	private String accountIdentifier;
	public ResponseSuccess(){
		super();
	}
	public ResponseSuccess(boolean success,String accountIdentifier)
	{
		this.success=success;
		this.accountIdentifier=accountIdentifier;
	}
	public boolean getSuccess()
	{
		return success;
	}
	public String getAccountIdentifier() {
		return accountIdentifier;
	}
	public void setAccountIdentifier(String accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public void swetAccountIdentifier(String accountIdentifier){
		this.accountIdentifier=accountIdentifier;
	}
}
