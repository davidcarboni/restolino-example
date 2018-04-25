package com.github.davidcarboni.microservice;

import com.github.davidcarboni.restolino.framework.Home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Example of using the {@link Home} interface to handle 'GET /'
 */
public class HomeExample implements Home {

    @Override
    public String get(HttpServletRequest req, HttpServletResponse res) throws IOException {
        return "This type of API is specifically for 'GET /'";
    }
}
