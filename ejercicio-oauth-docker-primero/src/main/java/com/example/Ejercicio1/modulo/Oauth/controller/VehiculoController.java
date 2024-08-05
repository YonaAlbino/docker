package com.example.Ejercicio1.modulo.Oauth.controller;

import com.example.Ejercicio1.modulo.Oauth.model.Vehiculo;
import com.example.Ejercicio1.modulo.Oauth.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")
@PreAuthorize("isAuthenticated()")
public class VehiculoController {

    @Autowired
    private IVehiculoService vehiculoService;

    @GetMapping
    public ResponseEntity<List<Vehiculo>> getAll(){
        return ResponseEntity.ok(vehiculoService.getAll());
    }

    @PostMapping
    public ResponseEntity<Vehiculo> save(@RequestBody Vehiculo vehiculo){
        return ResponseEntity.ok(vehiculoService.save(vehiculo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        vehiculoService.deleteById(id);
        return ResponseEntity.ok("Vehiculo eliminado");
    }


}
