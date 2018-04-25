package com.github.davidcarboni.microservice.api;

import com.github.davidcarboni.restolino.framework.Api;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;

/**
 * Example of a GET that returns a {@link Message} with the value of the 'message' query parameter,
 * or a helpful message.
 */
@Api
public class Parameter {

    /**
     * A "data record" defining the structure of the Json message.
     * <p>
     * NB this doesn't need to be an inner class. It can be any type that's serialisable by Gson.
     */
    class Message {
        String message;
    }


    @GET
    public Message parameter(HttpServletRequest req) {
        String message = req.getParameter("message");
        if (StringUtils.isBlank(message)) message = "Please provide a 'message' query string parameter.";
        Message response = new Message();
        response.message = message;
        return response;
    }
}
