package com.ilp.services;

import java.util.HashMap;
import java.util.Map;

import com.ilp.entity.AdminUser;
import com.ilp.entity.User;
import com.ilp.interfaces.BiometricAuthentication;
import com.ilp.interfaces.PasswordAuthentication;
import com.ilp.interfaces.UserRepository;

public class InMemoryUserRepository implements UserRepository {
    private Map<String, User> users;


    public InMemoryUserRepository() {
        this.users = new HashMap<>();
    }
    public void registerUser(User user) {
        users.put(user.getUsername(), user);
        System.out.println("User registered successfully!");
    }

    public boolean loginUserWithPassword(User user, String password, PasswordAuthentication authenticationService) {
        if (authenticationService.authenticateWithPassword(user, password)) {
            System.out.println("Login successful!");

            if (user instanceof AdminUser) {
                ((AdminUser) user).adminFunction();
            }

            return true;
        } else {
            System.out.println("Login failed. Please check your credentials.");
            return false;
        }
    }

    public boolean loginUserWithBiometrics(User user, String biometricData, BiometricAuthentication authenticationService) {
        if (authenticationService.authenticateWithBiometrics(user, biometricData)) {
            System.out.println("Biometric login successful!");

            if (user instanceof AdminUser) {
                ((AdminUser) user).adminFunction();
            }

            return true;
        } else {
            System.out.println("Biometric login failed. Please check your credentials.");
            return false;
        }
    }
}

