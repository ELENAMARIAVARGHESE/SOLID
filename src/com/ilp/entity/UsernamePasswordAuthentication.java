package com.ilp.entity;

import com.ilp.interfaces.PasswordAuthentication;

//Implementation of password-based authentication
public class UsernamePasswordAuthentication implements PasswordAuthentication {
 @Override
 public boolean authenticateWithPassword(User user, String password) {
     return user != null && user.getPassword().equals(password);
 }
}
