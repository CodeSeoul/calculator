package org.learntocodeseoul.calculator;

public class Response {

	private String status;
	private long result;
	private String errorMessage;

	public Response() {
	}

	public Response(String status, long result){
		this.status = status;
		this.result = result;
	}

	public Response(String status, long result, String errorMessage) {
		this(status, result);
		this.errorMessage = errorMessage;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getResult() {
		return result;
	}

	public void setResult(long result) {
		this.result = result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
