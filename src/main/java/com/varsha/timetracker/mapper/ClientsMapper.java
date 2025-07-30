package com.varsha.timetracker.mapper;

import com.varsha.timetracker.dto.ClientsDto;
import com.varsha.timetracker.entity.Clients;

public class ClientsMapper {
    public static ClientsDto mapToClientsDto(Clients clients){
        return new ClientsDto(
                clients.getId(),
                clients.getFirstName(),
                clients.getLastName(),
                clients.getPhoneNumber()
        );
    }
    public static Clients mapToEmployee(ClientsDto clientsDto){
        return new Clients(
                clientsDto.getId(),
                clientsDto.getFirstName(),
                clientsDto.getLastName(),
                clientsDto.getPhoneNumber()
        );
    }
}
