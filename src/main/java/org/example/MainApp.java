package org.example;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;
import java.util.logging.Logger;

public class MainApp {

    private static final Logger LOGGER = Logger.getLogger(MainApp.class.getName());

    // we start at port 8080
    public static final String BASE_URI = "http://localhost:8080/";

    // Starts Grizzly HTTP server
    public static HttpServer startServer() {
        // scan packages
        final ResourceConfig config = new ResourceConfig();
        config.packages(true, "org.example");
//        config.register(Login.class);

        LOGGER.info("Starting Server........");
        final HttpServer httpServer =
                GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), config);

        return httpServer;
    }

    public static void main(String[] args) {
        startServer();
    }
}