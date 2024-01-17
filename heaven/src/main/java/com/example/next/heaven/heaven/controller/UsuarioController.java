package com.example.next.heaven.heaven.controller;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.next.heaven.heaven.model.Usuario;
import com.example.next.heaven.heaven.model.Veiculo;
import com.example.next.heaven.heaven.model.VeiculoUsuario;
import com.example.next.heaven.heaven.repository.UsuarioRepository;
import com.example.next.heaven.heaven.repository.VeiculoRepository;
import com.example.next.heaven.heaven.repository.VeiculoUsuarioRepository;
import com.example.next.heaven.heaven.service.UsuarioVeiculoService;


@Controller
@SessionAttributes("usuarioAtual")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    VeiculoRepository veiculoRepository;
;
    @Autowired
    UsuarioVeiculoService service;

    @Autowired
    VeiculoUsuarioRepository veiculoUsuarioRepository;

    @GetMapping("/login")
    public String getLogin(Model model) {
        return "login";
    }

    @PostMapping("/login/entrar")
    public String validarLogin(@ModelAttribute Usuario usuario, Model model) throws SQLException {
        model.addAttribute("usuarioAtual", usuario);
        if (usuarioRepository.validarLogin(usuario)) {
            return "home";
        }
        return "login";
    }

    @PostMapping("/selected/vip")
    public String validarVip(@ModelAttribute Usuario usuario, Model model) throws SQLException {
        Usuario usuarioAtual = (Usuario) model.getAttribute("usuarioAtual");
        usuarioAtual.setTipoVip(usuario.getTipoVip());
        System.out.println(usuarioAtual.getNomeUsuario());
        usuarioRepository.inserirVip(usuarioAtual);
        System.out.println(usuario.getTipoVip());
        return "login";
    }

    @PostMapping("/selected/vehicle")
    public String selecionarVeiculo(Model model, @ModelAttribute Veiculo veiculo) throws SQLException {
        Veiculo veiculoAtual = veiculoRepository.getVeiculoBy(veiculo.getNomeVeiculo());
        Usuario modelUser = (Usuario) model.getAttribute("usuarioAtual");
        Usuario currentlyUser = usuarioRepository.getUsuarioBy(modelUser.getNomeUsuario());
        java.sql.Date dataAtual = new java.sql.Date(new Date().getTime());
        VeiculoUsuario veiculoUsuario = new VeiculoUsuario(veiculoAtual, currentlyUser, dataAtual);

        if (service.validarVeiculoUsuario(veiculoUsuario)) {

        } else {
            veiculoUsuarioRepository.inserirVeiculoUsuario(veiculoUsuario);
        }
        return "login";

    }

}
