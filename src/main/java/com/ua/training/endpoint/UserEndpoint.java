package com.ua.training.endpoint;

import com.ua.training.GetUserResponse;
import com.ua.training.service.UserService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://tutorialspoint/schemas")
public class UserEndpoint {

    private UserService userService=new UserService();

    @WebMethod
    public GetUserResponse getUserRequest(String name) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUsers(name));
        return response;
    }
}
