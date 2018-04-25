package com.github.davidcarboni.microservice.bonus;

import com.github.davidcarboni.restolino.Configuration;
import com.github.davidcarboni.restolino.framework.Api;
import com.github.davidcarboni.restolino.routes.DefaultRestolinoConfiguration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import java.io.IOException;

/**
 * Demonstrates the self-documenting capability.
 * <p>
 * By default Restolino would configure self-documentation as the default (/) route.
 * This class calls that functionality and exposes it on '/documentation'.
 */
@Api
public class RestolinoConfiguration {

    DefaultRestolinoConfiguration restolinoConfiguration = new DefaultRestolinoConfiguration();

    @GET
    public Configuration restolinoConfiguration(HttpServletRequest req, HttpServletResponse res) throws IOException {
        return restolinoConfiguration.get(req, res);
    }
}
