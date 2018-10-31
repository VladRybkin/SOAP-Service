package com.ua.training.run;


import com.ua.training.endpoint.UserEndpoint;
import com.ua.training.service.UserService;

import javax.xml.ws.Endpoint;

public class RunEndPoint {
    public static void main(String[] args) {


       Endpoint.publish("http://localhost:8088/users", new UserEndpoint());
    }
}
