package com.example.Ejercicio1.modulo.Oauth.repository;

import com.example.Ejercicio1.modulo.Oauth.model.Chofer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChoferRepository extends JpaRepository<Chofer, Long> {
}
