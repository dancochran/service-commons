package com.dsc.ese.mfw.commons.circuitbreaker;

/**
 * Creates circuit breakers based on the underlying implementation.
 *
 */
public abstract class CircuitBreakerFactory<CONF, CONFB extends ConfigBuilder<CONF>>
		extends AbstractCircuitBreakerFactory<CONF, CONFB> {

	public abstract CircuitBreaker create(String id);

}
