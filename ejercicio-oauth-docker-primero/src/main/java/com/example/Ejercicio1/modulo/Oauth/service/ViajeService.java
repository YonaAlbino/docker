package com.example.Ejercicio1.modulo.Oauth.service;

import com.example.Ejercicio1.modulo.Oauth.model.Viaje;
import com.example.Ejercicio1.modulo.Oauth.repository.IViajeReposstiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeService implements IViajeService{

    @Autowired
    private IViajeReposstiory viajeRepo;

    @Override
    public List<Viaje> getAll() {
        return viajeRepo.findAll();
    }

    @Override
    public Viaje findById(Long id) {
        return viajeRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        viajeRepo.deleteById(id);
    }

    @Override
    public Viaje save(Viaje viaje) {
        return viajeRepo.save(viaje);
    }

    @Override
    public Viaje update(Viaje viaje) {
        return this.save(viaje);
    }
}
