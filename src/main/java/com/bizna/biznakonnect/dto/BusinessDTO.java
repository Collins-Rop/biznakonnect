package com.bizna.biznakonnect.dto;

import lombok.Data;

@Data
public class BusinessDTO {
    private Long id;
    private String name;
    private String type;
    private String description;
    private Long ownerId;
    private String address;
    private String phoneNumber;
    private String email;
}
