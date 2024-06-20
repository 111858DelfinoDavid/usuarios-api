package ar.edu.utn.frc.tup.lc.iii.controllers;

import ar.edu.utn.frc.tup.lc.iii.dtos.CreateUsuarioDto;
import ar.edu.utn.frc.tup.lc.iii.dtos.UsuarioDto;
import ar.edu.utn.frc.tup.lc.iii.models.Usuario;
import ar.edu.utn.frc.tup.lc.iii.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<UsuarioDto>  createUsuario(@RequestBody CreateUsuarioDto createUsuarioDto){
        Usuario usuarioModelo=modelMapper.map(createUsuarioDto, Usuario.class);
        Usuario usuarioSaved=usuarioService.createUsuario(usuarioModelo);
        UsuarioDto usuarioDto=modelMapper.map(usuarioSaved, UsuarioDto.class);
        return ResponseEntity.ok(usuarioDto);
    }

}
