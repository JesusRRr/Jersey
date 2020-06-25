package com.rolon.rest.app;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class HelloWorldApplication extends ResourceConfig {
	    public HelloWorldApplication() {
	        // Define the package which contains the service classes.
	        packages("com.rolon.rest");
	        register(JacksonFeature.class);
	    }
	    
}

