package com.rafhael.barabas.msrlogapi.domain.services;

import com.rafhael.barabas.msrlogapi.api.exception.BusinessException;
import com.rafhael.barabas.msrlogapi.domain.model.Client;
import com.rafhael.barabas.msrlogapi.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> findAll() {
        return repository.findAll();
    }

    public Client findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Client id: " + id + " not found."));
    }

    public List<Client> findByName(String name) {
        return repository.findByName(name);
    }

    @Transactional
    public Client save(Client client) {
        validateEmail(client);
        return repository.save(client);
    }

    public Client updateClient(Client client) {
        return repository.findById(client.getId())
                .map(c -> save(client))
                .orElseThrow(() -> new EntityNotFoundException("Client id: " + client.getId() + " not found."));
    }

    public void delete(Long id) {
        Client client = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Client id: " + id + " not found."));
        repository.delete(client);
    }

    public void validateEmail(Client client) {
        boolean alreadyExists = repository.findByEmail(client.getEmail())
                .stream()
                .anyMatch(c -> !c.equals(client));
        if (alreadyExists) {
            throw new BusinessException("E-mail already in use");
        }
    }
}
