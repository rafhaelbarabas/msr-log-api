package com.rafhael.barabas.msrlogapi.controllers;

import com.rafhael.barabas.msrlogapi.domain.model.Client;
import com.rafhael.barabas.msrlogapi.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){
        List<Client> clients = service.findAll();
        return ResponseEntity.ok(clients);
    }
}
