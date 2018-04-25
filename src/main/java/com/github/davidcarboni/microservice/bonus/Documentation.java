package com.github.davidcarboni.microservice.bonus;

import com.github.davidcarboni.restolino.api.Router;
import com.github.davidcarboni.restolino.framework.Api;
import com.github.davidcarboni.restolino.routes.DefaultApiDocumentation;

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
public class Documentation extends DefaultApiDocumentation {
    @GET
    public Router selfDocumentation(HttpServletRequest req, HttpServletResponse res) throws IOException {
        return super.get(req, res);
    }
}
