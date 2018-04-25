package com.github.davidcarboni.microservice;

import com.github.davidcarboni.restolino.framework.NotFound;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NotFoundExample implements NotFound {

    @Override
    public String handle(HttpServletRequest req, HttpServletResponse res) throws IOException {
        return "This message will be returned as Json for unmapped requests.";
    }
}
