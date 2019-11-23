package com.android.tonystark.cglib.proxy;

public class ProxyException extends RuntimeException {
	
	private static final long serialVersionUID = 702035040596969930L;

	public ProxyException() {
		super();
	}
	
	public ProxyException(String msg) {
		super(msg);
	}

	public ProxyException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProxyException(Throwable cause) {
		super(cause);
	}
}
