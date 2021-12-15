package co.edu.utp.isc.gia.proyecto2.service.impl;

import co.edu.utp.isc.gia.proyecto2.dto.UsuarioDto;
import co.edu.utp.isc.gia.proyecto2.dto.UsuarioDtoEnvio;
import co.edu.utp.isc.gia.proyecto2.entities.UsuarioEntity;
import co.edu.utp.isc.gia.proyecto2.exceptions.NoExistUserException;
import co.edu.utp.isc.gia.proyecto2.repository.UsuarioRepository;
import co.edu.utp.isc.gia.proyecto2.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<UsuarioDtoEnvio> usuarioEnvio(String cedula) throws NoExistUserException {
        List<UsuarioEntity> usuarioEntities = usuarioRepository.findByCedula(cedula);
        if( !usuarioEntities.isEmpty() ) {
            List<UsuarioDtoEnvio> listUsuarioDtoEnvio = new ArrayList<>();
            usuarioEntities.forEach(usuarioEntity -> {
                listUsuarioDtoEnvio.add(modelMapper.map(usuarioEntity, UsuarioDtoEnvio.class));
            });

            return listUsuarioDtoEnvio;
        } else {
            throw new NoExistUserException("No existe el usuario en la base de datos.");
        }
    }

    @Override
    public void borrarUsuario(Long id) throws NoExistUserException {
        if (this.usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
        } else {
            throw new NoExistUserException("No existe el usuario en la base de datos.");
        }
    }

    @Override
    public UsuarioDto actualizarUsuario(Long id, UsuarioDto usuarioDto) throws NoExistUserException{
        if( this.usuarioRepository.existsById(id) ){
            usuarioDto.setId(id);
            UsuarioEntity usuarioEntity = this.usuarioRepository.save(modelMapper.map(usuarioDto, UsuarioEntity.class));
            return modelMapper.map(usuarioEntity, UsuarioDto.class);
        } else {
            throw new NoExistUserException("No existe el usuario en la base de datos.");
        }
    }

}
