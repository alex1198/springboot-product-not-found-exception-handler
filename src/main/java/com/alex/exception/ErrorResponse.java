package com.alex.exception;

import java.time.LocalDateTime;

public class ErrorResponse {

	private LocalDateTime timestamp;
	private String message;
	private int status;
	
	public ErrorResponse()
	{
		
	}

	/**
	 * @param timestamp
	 * @param message
	 * @param status
	 */
	public ErrorResponse(LocalDateTime timestamp, String message, int status) {
		this.timestamp = timestamp;
		this.message = message;
		this.status = status;
	}

	/**
	 * @return the timestamp
	 */
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
