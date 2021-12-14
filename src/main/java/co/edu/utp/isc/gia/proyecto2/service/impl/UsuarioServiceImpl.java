package co.edu.utp.isc.gia.proyecto2.service.impl;

import co.edu.utp.isc.gia.proyecto2.dto.UsuarioDto;
import co.edu.utp.isc.gia.proyecto2.entities.UsuarioEntity;
import co.edu.utp.isc.gia.proyecto2.repository.UsuarioRepository;
import co.edu.utp.isc.gia.proyecto2.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UsuarioDto crearUsuario(UsuarioDto usuarioDto) {
        if(!usuarioDto.equals(null) && usuarioDto != null){
            UsuarioEntity usuarioEntity = modelMapper.map(usuarioDto, UsuarioEntity.class);

            return modelMapper.map(this.usuarioRepository.save(usuarioEntity), UsuarioDto.class);
        } else {
            return null;
        }
    }
}
