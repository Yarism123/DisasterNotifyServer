package com.company.disasternotifyapp.user.request;

import lombok.Data;

@Data
public class UserSignInRequest {
    private String username;
    private String password;
}
