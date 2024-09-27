package com.bizna.biznakonnect.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    // Note: We don't include password in DTO for security reasons
}
