package com.github.davidcarboni.microservice;

import com.github.davidcarboni.restolino.framework.Api;
import com.github.davidcarboni.restolino.framework.Home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Api
public class Microservice implements Home {

    @java.lang.Override
    public String get(HttpServletRequest req, HttpServletResponse res) throws IOException {
        return "Hello, world!";
    }
}
