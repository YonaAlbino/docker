package com.example.Ejercicio1.modulo.Oauth.service;

import com.example.Ejercicio1.modulo.Oauth.model.Chofer;
import com.example.Ejercicio1.modulo.Oauth.repository.IChoferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoferService implements IChoferService {

    @Autowired
    private IChoferRepository choferRepo;

    @Override
    public List<Chofer> getAll() {
        return choferRepo.findAll();
    }

    @Override
    public Chofer findById(Long id) {
        return choferRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        choferRepo.deleteById(id);
    }

    @Override
    public Chofer save(Chofer chofer) {
        return choferRepo.save(chofer);
    }

    @Override
    public Chofer update(Chofer chofer) {
        return this.save(chofer);
    }
}
