package org.learntocodeseoul.calculator;

public class Response {

	private String status;
	private int result;

	public Response() {
	}

	public Response(String status, int result) {
		this.status = status;
		this.result = result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
