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
import com.rolon.rest.service.UserService;

@Path("/")
public class HelloWorldService {
	private UserService userService;

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
    	userService.getInsance().saveUser(user);
    	Gson gson = new Gson();
    	String output = gson.toJson(user);
        return Response.status(200).entity(output).build();
    }
    
    @GET
    @Path("/getusers")
    @Produces("application/json")
    public Response getUsers() {
    	Gson gson = new Gson();
    	String output = gson.toJson(userService.getInsance().getUsers());
    	System.out.println(userService.getInsance().getUsers());
        return Response.status(200).entity(output).build();
    }
    
}