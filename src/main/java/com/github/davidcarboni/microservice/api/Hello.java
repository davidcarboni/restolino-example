package com.github.davidcarboni.microservice.api;

import com.github.davidcarboni.restolino.framework.Api;

import javax.ws.rs.GET;

/**
 * The simplest possible {@link Api}.
 * <p>
 * This will be available on '/hello'.
 *
 * @return A unicode String.
 */
@Api
public class Hello {

    @GET
    public String hello() {
        return "Hello, 世界!";
    }
}
