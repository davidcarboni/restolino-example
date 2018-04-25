package com.github.davidcarboni.microservice;

import com.github.davidcarboni.restolino.framework.Filter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Demonstrates the use of the {@link Filter} interface.
 */
public class FilterExample implements Filter {

    private static final Logger log = LoggerFactory.getLogger(FilterExample.class);

    @Override
    public boolean filter(HttpServletRequest req, HttpServletResponse res) {
        log.info("Filtering incoming " + req.getMethod() + " request to " + req.getRequestURI());
        // Returning true indicates that request processing should continue.
        // Returning false would halt request processing at this point.
        return true;
    }
}
