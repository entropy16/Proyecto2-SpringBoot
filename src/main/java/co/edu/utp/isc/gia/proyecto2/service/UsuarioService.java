package co.edu.utp.isc.gia.proyecto2.service;

import co.edu.utp.isc.gia.proyecto2.dto.UsuarioDto;
import co.edu.utp.isc.gia.proyecto2.dto.UsuarioDtoEnvio;
import co.edu.utp.isc.gia.proyecto2.exceptions.NoExistUserException;

public interface UsuarioService {
    UsuarioDto crearUsuario(UsuarioDto usuarioDto);

    UsuarioDtoEnvio usuarioEnvio(Long id) throws NoExistUserException;

    void borrarUsuario(Long id) throws NoExistUserException;

    UsuarioDto actualizarUsuario(Long id, UsuarioDto usuarioDto) throws NoExistUserException;
}
