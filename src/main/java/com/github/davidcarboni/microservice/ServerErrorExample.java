package com.github.davidcarboni.microservice;

import com.github.davidcarboni.restolino.api.RequestHandler;
import com.github.davidcarboni.restolino.framework.ServerError;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServerErrorExample implements ServerError {

    class Error {
        String message;
        String handlerName;
        String exceptionClass;
        String exceptionMessage;

        Error(RequestHandler requestHandler, Throwable t) {
            message = "This message will be returned as Json for a request that generates an exception.";
            handlerName = requestHandler.handlerMethod.getName();
            exceptionClass = t.getClass().getSimpleName();
            exceptionMessage = t.getMessage();
        }
    }

    @Override
    public Error handle(HttpServletRequest req, HttpServletResponse res, RequestHandler requestHandler, Throwable t) throws IOException {
        return new Error(requestHandler, t);
    }
}
