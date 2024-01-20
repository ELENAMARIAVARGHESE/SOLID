package com.ilp.interfaces;

import com.ilp.entity.User;

public interface BiometricAuthentication {
    boolean authenticateWithBiometrics(User user, String biometricData);
}
