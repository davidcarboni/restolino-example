package com.github.davidcarboni.microservice.api;

import com.github.davidcarboni.restolino.framework.Api;

import javax.ws.rs.POST;

/**
 * Example of POSTing Json. The expected message is a {@link Message}.
 * <p>
 * This returns either the {@link Message} that was POSTed, or a help message.
 */
@Api
public class Post {

    /**
     * A "data record" defining the structure of the Json message.
     * <p>
     * NB this doesn't need to be an inner class. It can be any type that's serialisable by Gson.
     */
    class Message {
        String message;
    }


    @POST
    public Message message(Message postData) {
        Message response = postData;
        if (response == null) {
            response = new Message();
            response.message = "Please POST a Json object with a 'message' key/value pair.";
        }
        return response;
    }
}
