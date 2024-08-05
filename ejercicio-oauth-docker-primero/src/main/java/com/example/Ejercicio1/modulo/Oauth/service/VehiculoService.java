package com.example.Ejercicio1.modulo.Oauth.service;

import com.example.Ejercicio1.modulo.Oauth.model.Vehiculo;
import com.example.Ejercicio1.modulo.Oauth.repository.IVehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService implements IVehiculoService{

    @Autowired
    private IVehiculoRepository vehiculoRepo;

    @Override
    public List<Vehiculo> getAll() {
        return vehiculoRepo.findAll();
    }

    @Override
    public Vehiculo findById(Long id) {
        return vehiculoRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        vehiculoRepo.deleteById(id);
    }

    @Override
    public Vehiculo save(Vehiculo vehiculo) {
        return vehiculoRepo.save(vehiculo);
    }

    @Override
    public Vehiculo update(Vehiculo vehiculo) {
        return this.save(vehiculo);
    }
}
