package com.varsha.timetracker.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//Use this class to transfer data between client and server
public class ClientsDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Long phoneNumber;
}

