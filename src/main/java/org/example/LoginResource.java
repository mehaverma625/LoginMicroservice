package org.example;
import Model.User;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Path("/")
public class LoginResource {
    public LoginResource(){

    }

    @GET
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(String path){
        System.out.println(this.hashCode());
        List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("mango");
        return Response.status(Response.Status.OK).entity(list).build();
    }

    @Path("/{name}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("name") String name) {
        return "Jersey: hello " + name;
    }

    @Path("/test")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloByQueryParam(@QueryParam("name") String name) {
        return "Jersey: hello " + name;
    }

    @Path("/saveUser")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveUser(User user){
        return Response.status(Response.Status.OK).entity(user).build();
    }
}
