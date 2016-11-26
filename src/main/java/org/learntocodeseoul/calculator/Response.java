package org.learntocodeseoul.calculator;

public class Response {

	private String status;
	private long result;

	public Response() {
	}

	public Response(String status, long result) {
		this.status = status;
		this.result = result;
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
}
