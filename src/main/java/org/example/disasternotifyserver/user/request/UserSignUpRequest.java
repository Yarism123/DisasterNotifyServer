package org.example.disasternotifyserver.user.request;

import lombok.Data;

@Data
public class UserSignUpRequest {

    private String username;
    private String password;
    private int city_code; //도시
    private int county_code; //시,군
}
