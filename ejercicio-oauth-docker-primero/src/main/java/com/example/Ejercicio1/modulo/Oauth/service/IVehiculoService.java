package com.example.Ejercicio1.modulo.Oauth.service;

import com.example.Ejercicio1.modulo.Oauth.model.Vehiculo;

import java.util.List;

public interface IVehiculoService {
    public List<Vehiculo> getAll();
    public Vehiculo findById(Long id);
    public void deleteById(Long id);
    public Vehiculo save(Vehiculo vehiculo);
    public Vehiculo update(Vehiculo vehiculo);
}
