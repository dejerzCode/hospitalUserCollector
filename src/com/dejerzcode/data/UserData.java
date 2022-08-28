package com.dejerzcode.data;

import com.dejerzcode.entities.User;

import java.util.ArrayList;

public class UserData implements IUserData {

    ArrayList<User> usersList = new ArrayList<User>();

    @Override
    public ArrayList<User> getAllUsers() {
        return usersList;
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    public void addToList(User newUser){
        usersList.add(newUser);
    }
}
