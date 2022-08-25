package ru.unclediga.examples.jersey.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/json")
public class JsonResource {

    @GET
    public String info(@Context HttpServletRequest ctx) {
        return "Hello from ctx-path: "
                + ctx.getContextPath()
                + " -> s-path: " + ctx.getServletPath();
    }

    @GET
    @Path("obj")
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    public MyData infoJ(@Context HttpServletRequest ctx) {
        return new MyData("Hello from ctx-path: "
                + ctx.getContextPath()
                + " -> s-path: " + ctx.getServletPath());
    }

    @GET
    @Path("string")
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    public String infoT(@Context HttpServletRequest ctx) {
        return "Hello from ctx-path: "
                + ctx.getContextPath()
                + " -> s-path: " + ctx.getServletPath();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    public String mirror(String content) {
        return "Got  " + content;
    }
}
