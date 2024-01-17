package com.example.next.heaven.heaven.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.next.heaven.heaven.repository.UsuarioRepository;

@Controller
public class VipController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/login/precos/vip")
    public String getVip() {
        return "vip";
    }


}
