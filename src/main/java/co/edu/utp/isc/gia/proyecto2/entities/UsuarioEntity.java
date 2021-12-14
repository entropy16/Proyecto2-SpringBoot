package co.edu.utp.isc.gia.proyecto2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USUARIOS")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
