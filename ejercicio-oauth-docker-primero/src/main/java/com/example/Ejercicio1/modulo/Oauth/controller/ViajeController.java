package com.example.Ejercicio1.modulo.Oauth.controller;

import com.example.Ejercicio1.modulo.Oauth.model.Viaje;
import com.example.Ejercicio1.modulo.Oauth.service.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viaje")
@PreAuthorize("isAuthenticated()")
public class ViajeController {

    @Autowired
    private IViajeService viajeService;

    @GetMapping
    public ResponseEntity<List<Viaje>> getAll(){
        return ResponseEntity.ok(viajeService.getAll());
    }

    @PostMapping
    public ResponseEntity<Viaje> save(@RequestBody Viaje viaje){
        return ResponseEntity.ok(viajeService.save(viaje));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        viajeService.deleteById(id);
        return ResponseEntity.ok("Viaje eliminado");
    }
}
