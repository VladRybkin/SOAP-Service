package com.ua.training.service;

import com.ua.training.model.Skill;
import com.ua.training.model.User;

import java.util.HashMap;
import java.util.Map;


public class UserService {

    private Map<String, User> users = new HashMap<>();

    public UserService() {
       init();
    }

    private void init(){
        User peter = new User();
        Skill java=new Skill();
        java.setId(1);
        java.setName("java");
        peter.setName("Peter");
        peter.setId(1);
        peter.setSalary(12000);
        peter.setSkill(java);


        User sam = new User();
        sam.setName("Sam");
        sam.setId(2);
        sam.setSalary(32000);
        sam.setSkill(java);

        User ryan = new User();
        ryan.setName("Ryan");
        ryan.setId(3);
        ryan.setSalary(16000);
        ryan.setSkill(java);

        users.put(peter.getName(), peter);
        users.put(sam.getName(), sam);
        users.put(ryan.getName(), ryan);
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public User getUsers(String name) {
        return users.get(name);
    }
    public void addUser(String name, User user) {
        users.put(name, user);
    }
    public void deleteUser(String key) {
         users.remove(key);
    }
}
