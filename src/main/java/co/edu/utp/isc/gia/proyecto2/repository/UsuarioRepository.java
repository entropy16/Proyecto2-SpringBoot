package co.edu.utp.isc.gia.proyecto2.repository;

import co.edu.utp.isc.gia.proyecto2.entities.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<UsuarioEntity, Long> {

    List<UsuarioEntity> findByCedula(String cedula);
}  
