package com.example.Ejercicio1.modulo.Oauth.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "choferes")
public class Chofer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idChofer;
    private  String nombre;
    private String apellido;

    @OneToOne
    @JoinColumn (name = "id_vehiculo",
                referencedColumnName = "idVehiculo")
    private Vehiculo unVehiculo;
}
