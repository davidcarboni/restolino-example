package com.github.davidcarboni.microservice.api;

import com.github.davidcarboni.restolino.framework.Api;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.jetty.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;

/**
 * Example of request and response processing. This sets a response code,
 * based on whether or not a 'message' parameter was provided.
 */
@Api
public class ResponseCode {

    @GET
    public void responseCode(HttpServletRequest req, HttpServletResponse res) {
        if (StringUtils.isBlank(req.getParameter("message"))) {
            res.setStatus(HttpStatus.BAD_REQUEST_400);
        } else {
            res.setStatus(HttpStatus.ACCEPTED_202);
        }
    }
}
