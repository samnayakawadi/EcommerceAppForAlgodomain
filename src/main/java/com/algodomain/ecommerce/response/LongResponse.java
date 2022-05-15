package com.algodomain.ecommerce.response;

public class LongResponse {
	private Boolean status;
	private String msg;
	private Long id;
	
	public LongResponse(Boolean status, String msg, Long id) {
		super();
		this.status = status;
		this.msg = msg;
		this.id = id;
	}

	public LongResponse(Boolean status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
