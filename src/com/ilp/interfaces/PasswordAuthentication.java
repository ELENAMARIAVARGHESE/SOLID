package com.ilp.interfaces;

import com.ilp.entity.User;

public interface PasswordAuthentication {
	boolean authenticateWithPassword(User user, String password);

}
