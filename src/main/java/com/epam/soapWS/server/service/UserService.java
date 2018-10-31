package com.epam.soapWS.server.service;

import com.epam.soapWS.server.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User peter = new User();
        peter.setName("Peter");
        peter.setId(1);
        peter.setSalary(12000);

        User sam = new User();
        sam.setName("Sam");
        sam.setId(2);
        sam.setSalary(32000);
        User ryan = new User();
        ryan.setName("Ryan");
        ryan.setId(3);
        ryan.setSalary(16000);

        users.put(peter.getName(), peter);
        users.put(sam.getName(), sam);
        users.put(ryan.getName(), ryan);
    }


    public User getUsers(String name) {
        return users.get(name);
    }
}
