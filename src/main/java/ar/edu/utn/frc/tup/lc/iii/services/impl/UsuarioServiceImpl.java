package ar.edu.utn.frc.tup.lc.iii.services.impl;

import ar.edu.utn.frc.tup.lc.iii.entities.UsuarioEntity;
import ar.edu.utn.frc.tup.lc.iii.models.Usuario;
import ar.edu.utn.frc.tup.lc.iii.repositories.UsuarioRepository;
import ar.edu.utn.frc.tup.lc.iii.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Usuario createUsuario(Usuario usuario) {
        Optional<UsuarioEntity> usuarioExistente=usuarioRepository.getByEmail(usuario.getEmail());
        if(usuarioExistente.isPresent()){
            //TODO:manejar la excepción con ExceptionHandler o algo similar
            return null;
        }
        UsuarioEntity usuarioEntity=modelMapper.map(usuario, UsuarioEntity.class);
        usuarioEntity.setCreatedAt(LocalDateTime.now());
        UsuarioEntity usuarioSaved=usuarioRepository.save(usuarioEntity);
        return modelMapper.map(usuarioSaved, Usuario.class);
    }

    @Override
    public Usuario getUsuarioById(Long id) {
        return null;
    }

    @Override
    public List<Usuario> getUsuarioList() {
        return List.of();
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void deleteUsuario(Usuario usuario) {

    }
}
