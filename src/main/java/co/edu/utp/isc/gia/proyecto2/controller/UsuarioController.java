package co.edu.utp.isc.gia.proyecto2.controller;

import co.edu.utp.isc.gia.proyecto2.dto.UsuarioDto;
import co.edu.utp.isc.gia.proyecto2.dto.UsuarioDtoEnvio;
import co.edu.utp.isc.gia.proyecto2.entities.UsuarioEntity;
import co.edu.utp.isc.gia.proyecto2.exceptions.NoExistUserException;
import co.edu.utp.isc.gia.proyecto2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("crearUsuario")
    public UsuarioDto crearUsuario(@RequestBody UsuarioDto usuarioDto){
        return usuarioService.crearUsuario(usuarioDto);
    }

    @GetMapping("usuarioEnvio")
    public List<UsuarioDtoEnvio> recibirUsuarioEnvio(@RequestParam String cedula) throws NoExistUserException {

            return usuarioService.usuarioEnvio(cedula);
    }

    @DeleteMapping("borrarUsuario")
    public void borrarUsuario(@RequestParam Long id) throws NoExistUserException {

            usuarioService.borrarUsuario(id);
    }

    @PutMapping("actualizarUsuario")
    public UsuarioDto actualizarUsuario(@RequestParam Long id, @RequestBody UsuarioDto usuarioDto)
            throws NoExistUserException {

            return usuarioService.actualizarUsuario(id, usuarioDto);
    }

}
