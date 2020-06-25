package com.rolon.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.rolon.rest.model.User;

@Path("/")
public class HelloWorldService {

    @GET
    @Path("/{name}")
    public Response sayHello(@PathParam("name") String msg) {
        String output = "Hello, " + msg + "!";
        return Response.status(200).entity(output).build();
    }
    
    @POST
    @Path("/newuser")
    @Consumes("application/json")
    @Produces("application/json")
    public Response createUser(User user) {
    	
    	System.out.println(user);
    	Gson gson = new Gson();
    	String output = gson.toJson(user);
        return Response.status(200).entity(output).build();
    }
    
}