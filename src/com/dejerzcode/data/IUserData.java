package com.dejerzcode.data;

import com.dejerzcode.entities.User;
import java.util.ArrayList;

public interface IUserData {
    public ArrayList<User> getAllUsers();
    public User getUser(int id);
}
