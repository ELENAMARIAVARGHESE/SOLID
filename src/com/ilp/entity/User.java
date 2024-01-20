package com.ilp.entity;

import com.ilp.interfaces.ResetPassword;

public class User implements ResetPassword{
	 private String username;
	 private String password;

	    public User(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

		@Override
		public void resetUserPassword(String newPassword) {
			this.password=newPassword;
		}

}
