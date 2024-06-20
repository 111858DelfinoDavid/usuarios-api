package ar.edu.utn.frc.tup.lc.iii.services;

import ar.edu.utn.frc.tup.lc.iii.entities.UsuarioEntity;
import ar.edu.utn.frc.tup.lc.iii.models.Dummy;
import ar.edu.utn.frc.tup.lc.iii.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {
    Usuario createUsuario(Usuario usuario);
    Usuario getUsuarioById(Long id);
    List<Usuario> getUsuarioList();
    Usuario updateUsuario(Usuario usuario);
    void deleteUsuario(Usuario usuario);
}
