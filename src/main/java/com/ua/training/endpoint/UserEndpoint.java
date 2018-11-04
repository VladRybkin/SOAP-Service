package com.ua.training.endpoint;


import com.ua.training.model.request.GetUserResponse;
import com.ua.training.model.entity.User;
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

    @WebMethod
    public void putUserRequest(User user) {
       userService.addUser(user.getName(), user);

    }
    @WebMethod
    public void deleteUser(String key) {
        GetUserResponse response = new GetUserResponse();
         userService.deleteUser(key);

    }
}
