package com.bkf.exceptions;

import com.bkf.common.ErrorCode;

public class UserException extends Exception {

	ErrorCode errorCode;
	String errorMsg;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	
	public UserException(){
		
	}
	
	public UserException(ErrorCode errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	

}
