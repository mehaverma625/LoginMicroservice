package org.example;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/book")
public class Login {

    public Login(){

    }

    @GET
    @Path("/login")
    @Produces(MediaType.TEXT_PLAIN)
    public String get(String path){
        List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("mango");

//        return Response.status(Response.Status.OK).entity(list).build();
        return "Hello yuhuuuuuu Server ran";
    }
}
