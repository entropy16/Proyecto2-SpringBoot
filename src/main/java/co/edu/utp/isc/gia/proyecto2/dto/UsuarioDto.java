package co.edu.utp.isc.gia.proyecto2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto implements Serializable {
    private Long id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private String codPostal;
    private Date fechaNacimiento;
    private String eps;
    private String estadoCivil;
}
