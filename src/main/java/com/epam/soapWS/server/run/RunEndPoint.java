package com.epam.soapWS.server.run;


import com.epam.soapWS.server.endpoint.UserEndpoint;
import com.epam.soapWS.server.service.UserService;

import javax.xml.ws.Endpoint;

public class RunEndPoint {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8088/users", new UserEndpoint());
    }
}
