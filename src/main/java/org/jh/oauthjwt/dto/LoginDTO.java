package org.jh.oauthjwt.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginDTO {

    private String username;
    private String email;
    private String password;
}
