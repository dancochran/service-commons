package com.dsc.ese.mfw.commons.circuitbreaker;

/**
 * A builder for circuit breaker configurations.
 *
 */
public interface ConfigBuilder<CONF> {

	CONF build();

}
