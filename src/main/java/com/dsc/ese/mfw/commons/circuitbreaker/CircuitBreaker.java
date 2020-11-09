package com.dsc.ese.mfw.commons.circuitbreaker;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Common circuit breaker.
 *
 */
public interface CircuitBreaker {

	default <T> T run(Supplier<T> toRun) {
		return run(toRun, throwable -> {
			throw new NoFallbackAvailableException("No fallback available.", throwable);
		});
	};

	<T> T run(Supplier<T> toRun, Function<Throwable, T> fallback);

}
