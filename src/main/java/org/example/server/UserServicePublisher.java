package org.example.server;

import jakarta.xml.ws.Endpoint;

import java.util.logging.Level;
import java.util.logging.Logger;


public class UserServicePublisher {

    private static final Logger LOGGER =
            Logger.getLogger(UserServicePublisher.class.getName());

    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.create(new UserServiceImpl());
        endpoint.publish("http://localhost:8080/ws/user");

        LOGGER.log(Level.INFO, "Service is ready for requests...");
    }
}