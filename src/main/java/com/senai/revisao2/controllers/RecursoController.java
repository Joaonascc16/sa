package com.senai.revisao2.controllers;

import com.senai.revisao2.dtos.RecursoDto;
import com.senai.revisao2.services.RecursoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RecursoController {

    private final RecursoService service;

    public RecursoController(RecursoService service) {
        this.service = service;
    }

    @PostMapping("/recursoinserir")
    public String inserirRecurso(
            @ModelAttribute("recurso") RecursoDto recursoDto,
            RedirectAttributes redirectAttributes) {

        service.recurso Inserir(recursoDto);

        redirectAttributes.addFlashAttribute("mensagem", "Recurso cadastrado com sucesso.");

        return "redirect:/recursolista";
    }
}
