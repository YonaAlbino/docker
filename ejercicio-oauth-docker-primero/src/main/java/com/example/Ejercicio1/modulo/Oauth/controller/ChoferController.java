package com.example.Ejercicio1.modulo.Oauth.controller;

import com.example.Ejercicio1.modulo.Oauth.model.Chofer;
import com.example.Ejercicio1.modulo.Oauth.service.IChoferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chofer")
@PreAuthorize("isAuthenticated()")
public class ChoferController {

    @Autowired
    private IChoferService choferService;

    @GetMapping
    public ResponseEntity<List<Chofer>> getAll(){
       return  ResponseEntity.ok(choferService.getAll());
    }

    @PostMapping
    public ResponseEntity<Chofer> save(@RequestBody Chofer chofer){
        return ResponseEntity.ok(choferService.save(chofer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        choferService.deleteById(id);
        return ResponseEntity.ok("Chofer eliminado");
    }

}
