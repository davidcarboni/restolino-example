package com.github.davidcarboni.microservice.bonus;

import com.github.davidcarboni.restolino.framework.Api;
import com.github.davidcarboni.restolino.routes.DefaultIndexRedirect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import java.io.IOException;

/**
 * Demonstrates the redirect capability.
 * <p>
 * This would normally be configured as the default (/) route.
 * This class calls that functionality and exposes it on '/index', redirecting you to '/index.html'.
 */
@Api
public class Redirect {

    DefaultIndexRedirect redirect = new DefaultIndexRedirect("/index.html");

    @GET
    public Object selfDocumentation(HttpServletRequest req, HttpServletResponse res) throws IOException {
        return redirect.get(req, res);
    }
}
