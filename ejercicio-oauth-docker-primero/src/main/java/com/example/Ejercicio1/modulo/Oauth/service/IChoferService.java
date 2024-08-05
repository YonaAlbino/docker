package com.example.Ejercicio1.modulo.Oauth.service;

import com.example.Ejercicio1.modulo.Oauth.model.Chofer;
import com.example.Ejercicio1.modulo.Oauth.repository.IChoferRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IChoferService {

    public List<Chofer> getAll();
    public Chofer findById(Long id);
    public void deleteById(Long id);
    public Chofer save(Chofer chofer);
    public Chofer update(Chofer chofer);
}
