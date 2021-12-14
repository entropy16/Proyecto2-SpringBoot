package co.edu.utp.isc.gia.proyecto2.controller;

import co.edu.utp.isc.gia.proyecto2.dto.UsuarioDto;
import co.edu.utp.isc.gia.proyecto2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("crearUsuario")
    public UsuarioDto crearUsuario(@RequestBody UsuarioDto usuarioDto){
        return usuarioService.crearUsuario(usuarioDto);
    }

}
