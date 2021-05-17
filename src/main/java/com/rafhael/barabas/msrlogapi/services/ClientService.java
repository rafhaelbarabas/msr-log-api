package com.rafhael.barabas.msrlogapi.services;

import com.rafhael.barabas.msrlogapi.domain.model.Client;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClientService {

    public List<Client> findAll() {
        Client client1 = Client.builder()
                .id(1L)
                .name("Rafhael")
                .email("rafhael.barabas@compasso.com.br")
                .phoneNumber("(48) 99635-3749")
                .build();

        Client client2 = Client.builder()
                .id(2L)
                .name("Arielle")
                .email("arielle.santana@riodeserto.com.br")
                .phoneNumber("(48) 99635-3749")
                .build();

        return Arrays.asList(client1, client2);
    }
}
