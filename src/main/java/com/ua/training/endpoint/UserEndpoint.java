package com.ua.training.endpoint;

import com.ua.training.GetUserRequest;
import com.ua.training.GetUserResponse;
import com.ua.training.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class UserEndpoint {


    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @WebMethod
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
}
