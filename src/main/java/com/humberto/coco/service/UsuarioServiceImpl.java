package com.humberto.coco.service;

import com.humberto.coco.model.Usuario;
import com.humberto.coco.model.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * User: Daniel Humberto Ramírez Juárez
 * Date: 25/03/19 12:28
 */
@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

}
