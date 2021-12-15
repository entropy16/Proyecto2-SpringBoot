package co.edu.utp.isc.gia.proyecto2.service;

import co.edu.utp.isc.gia.proyecto2.dto.UsuarioDto;
import co.edu.utp.isc.gia.proyecto2.dto.UsuarioDtoEnvio;
import co.edu.utp.isc.gia.proyecto2.exceptions.NoExistUserException;

import java.util.List;

public interface UsuarioService {
    UsuarioDto crearUsuario(UsuarioDto usuarioDto);

    List<UsuarioDtoEnvio> usuarioEnvio(String cedula) throws NoExistUserException;

    void borrarUsuario(Long id) throws NoExistUserException;

    UsuarioDto actualizarUsuario(Long id, UsuarioDto usuarioDto) throws NoExistUserException;
}
