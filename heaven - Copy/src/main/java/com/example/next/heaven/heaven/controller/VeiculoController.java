package com.example.next.heaven.heaven.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.next.heaven.heaven.model.Veiculo;
import com.example.next.heaven.heaven.repository.VeiculoRepository;


@Controller
public class VeiculoController {

    @Autowired
    VeiculoRepository veiculoRepository;
    List<Veiculo> veiculos = new ArrayList<>();

    @GetMapping("/veiculos")
    public String getVeiculo(Model model) throws SQLException {
        veiculos = veiculoRepository.getVeiculo();
        model.addAttribute("veiculos", veiculos);
        return "carro";
    }



}
