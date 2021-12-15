package co.edu.utp.isc.gia.proyecto2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDtoEnvio implements Serializable {
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private String codPostal;
}

