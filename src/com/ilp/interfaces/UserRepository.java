package com.ilp.interfaces;

import com.ilp.entity.User;

public interface UserRepository {
    void registerUser(User user);

    boolean loginUserWithPassword(User user, String password, PasswordAuthentication authenticationService);

    boolean loginUserWithBiometrics(User user, String biometricData, BiometricAuthentication authenticationService);
}
