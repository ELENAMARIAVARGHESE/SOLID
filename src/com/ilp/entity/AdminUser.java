package com.ilp.entity;

import com.ilp.interfaces.ResetPassword;

public class AdminUser extends User {
 public AdminUser(String username, String password) {
     super(username, password);
 }

 public void adminFunction() {
     System.out.println("Performing admin-specific function.");
 }
 public void adminResetPassword(ResetPassword user, String newPassword) {
     System.out.println("Performing admin-specific function.");
     user.resetUserPassword(newPassword);
 }
}
