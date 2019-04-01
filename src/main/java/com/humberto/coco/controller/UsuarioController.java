package com.humberto.coco.controller;

import com.humberto.coco.model.Usuario;
import com.humberto.coco.service.UsuarioService;
import com.humberto.coco.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * User: Daniel Humberto Ramírez Juárez
 * Date: 25/03/19 12:27
 */
@RestController
@RequestMapping("Users")
public class UsuarioController {

    @Autowired
    UsuarioServiceImpl usuarioService;

    @RequestMapping(value = {"/",""},method = RequestMethod.GET)
    public List<Usuario> listarUsuarios(){
        return usuarioService.getAll();
    }

}
