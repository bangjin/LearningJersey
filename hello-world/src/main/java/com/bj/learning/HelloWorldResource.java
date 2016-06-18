package com.bj.learning;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * Created by wbj on 16-6-19.
 */
@Path("/hello/{name}")
public class HelloWorldResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("name") String name) {
        return "hello, " + name;
    }
}
