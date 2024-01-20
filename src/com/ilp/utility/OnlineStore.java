package com.ilp.utility;

import com.ilp.entity.*;
import com.ilp.interfaces.*;
import com.ilp.services.InMemoryUserRepository;



public class OnlineStore {
    public static void main(String[] args) {
        UserRepository userRepository = new InMemoryUserRepository();

        User newUser = new User("john_doe", "password123");
        userRepository.registerUser(newUser);

        User adminUser = new AdminUser("admin_user", "admin_password");
        userRepository.registerUser(adminUser);

    
        PasswordAuthentication passwordAuth = new UsernamePasswordAuthentication();
        userRepository.loginUserWithPassword(newUser, "password123", passwordAuth);

       
        userRepository.loginUserWithPassword(adminUser, "admin_password", passwordAuth);

    }
}
