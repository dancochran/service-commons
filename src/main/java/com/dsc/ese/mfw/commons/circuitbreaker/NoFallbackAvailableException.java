package com.dsc.ese.mfw.commons.circuitbreaker;

/**
 * A runtime exception for use when no fallback is available for the circuit breaker.
 *
 */
public class NoFallbackAvailableException extends RuntimeException {

	public NoFallbackAvailableException(String message, Throwable cause) {
		super(message, cause);
	}

}
