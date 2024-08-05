package com.example.Ejercicio1.modulo.Oauth.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "viajes")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idViaje;
    private String destino;
    private String costo;

    @OneToOne
    @JoinColumn(name = "id_chofer",
                referencedColumnName = "idChofer")
    private Chofer unChofer;

}
