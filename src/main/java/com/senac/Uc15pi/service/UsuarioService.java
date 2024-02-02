package com.senac.Uc15pi.service;

import com.senac.Uc15pi.data.Usuario;
import com.senac.Uc15pi.data.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kevin
 */
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {
        usuario.setId(null);

        usuario = usuarioRepository.save(usuario);

        return usuario;
    }

    public Usuario getUsuarioLogin(String login) {
        return usuarioRepository.findByLogin(login);
    }
}
