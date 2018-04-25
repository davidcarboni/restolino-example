package com.github.davidcarboni.microservice.api;

import com.github.davidcarboni.microservice.ServerErrorExample;
import com.github.davidcarboni.restolino.framework.Api;

import javax.ws.rs.GET;

/**
 * Throws an error, to demonstrate {@link ServerErrorExample}.
 */
@Api
public class Error {


    @GET
    public void error() {
        throw new RuntimeException("This exception should be gracefully handled " +
                "and returned to the client by the ServerErrorExample class.");
    }
}
