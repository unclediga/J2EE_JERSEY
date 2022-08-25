package ru.unclediga.examples.jersey.rest;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("/json")
public class JsonResource {
    @GET
    public String info(@Context HttpServletRequest ctx) {
        return "Hello from ctx-path: "
                + ctx.getContextPath()
                + " -> s-path: " + ctx.getServletPath();
    }
}
