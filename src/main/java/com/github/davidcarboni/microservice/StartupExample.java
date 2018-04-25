package com.github.davidcarboni.microservice;


import com.github.davidcarboni.restolino.framework.Startup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demonstrates the use of the {@link Startup} interface.
 */
public class StartupExample implements Startup {

    private static final Logger log = LoggerFactory.getLogger(StartupExample.class);

    @Override
    public void init() {
        log.info("This is invoked when Restolino first starts up.");
    }
}
