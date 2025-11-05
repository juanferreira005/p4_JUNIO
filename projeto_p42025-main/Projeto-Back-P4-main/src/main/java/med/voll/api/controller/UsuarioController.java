package med.voll.api.controller;

import med.voll.api.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    repository.save(usuario);
    return null
}


