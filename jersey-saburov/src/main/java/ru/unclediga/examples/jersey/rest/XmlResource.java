package ru.unclediga.examples.jersey.rest;

import ru.unclediga.examples.jersey.domain.MyData;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/xml")
@Produces(MediaType.APPLICATION_XML)
public class XmlResource {

    @GET
    public String info(@Context HttpServletRequest ctx) {
        return "Hello from ctx-path: "
                + ctx.getContextPath()
                + " -> s-path: " + ctx.getServletPath();
    }

    @GET
    @Path("obj")
    public MyData infoJ(@Context HttpServletRequest ctx) {
        return new MyData("my content!");
    }

    @GET
    @Path("string")
    public String infoT(@Context HttpServletRequest ctx) {
        return "Hello from ctx-path: "
                + ctx.getContextPath()
                + " -> s-path: " + ctx.getServletPath();
    }

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public MyData mirror(MyData content) {
        return content;
    }

}
