package com.galata.apis.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * created by girija-4135 on 20/03/21
 */
@Path("example")
public class Example {
    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getNotes() {
        return Response.ok("hellooo from GIRIJA").build();
    }
}
