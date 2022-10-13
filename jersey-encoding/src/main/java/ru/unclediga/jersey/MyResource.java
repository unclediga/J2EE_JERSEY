package ru.unclediga.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;



/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

    @POST
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response login(LoginRequest loginRequest) {
            return Response
                    .ok()
                    .type(MediaType.APPLICATION_JSON_TYPE)
                    .header("ticket", "Логин:" + loginRequest.getLogin() + " пароль:" + loginRequest.getPassword())
                    .entity(new LoginResponse(123, "Гоша", "Логин:" + loginRequest.getLogin() + " пароль:" + loginRequest.getPassword()))
                    .build();
    } 
}