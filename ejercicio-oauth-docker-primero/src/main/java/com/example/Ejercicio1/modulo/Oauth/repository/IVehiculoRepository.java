package com.example.Ejercicio1.modulo.Oauth.repository;

import com.example.Ejercicio1.modulo.Oauth.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long> {
}
