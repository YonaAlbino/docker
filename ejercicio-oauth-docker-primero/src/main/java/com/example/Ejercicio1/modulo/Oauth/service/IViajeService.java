package com.example.Ejercicio1.modulo.Oauth.service;

import com.example.Ejercicio1.modulo.Oauth.model.Viaje;

import java.util.List;

public interface IViajeService {
    public List<Viaje> getAll();
    public Viaje findById(Long id);
    public void deleteById(Long id);
    public Viaje save(Viaje viaje);
    public Viaje update(Viaje viaje);
}
