package com.senai.revisao2.controllers;

import com.senai.revisao2.dtos.ReservaDto;
import com.senai.revisao2.services.ReservaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ReservaController {

    private final ReservaService service;

    public ReservaController(ReservaService service) {
        this.service = service;
    }

    @PostMapping("/reservainserir")
    public String inserirReserva(
            @ModelAttribute("reserva") ReservaDto reservaDto,
            RedirectAttributes redirectAttributes) {

        service.reservaInserir(reservaDto);

        redirectAttributes.addFlashAttribute("mensagem", "Reserva cadastrada com sucesso.");

        return "redirect:/reservalista";
    }

    @PostMapping("/reservas/cancelar/{id}")
    public String cancelarReserva(@PathVariable Long id, RedirectAttributes redirectAttributes) {

        service.reservaCancelar(id);

        redirectAttributes.addFlashAttribute("mensagem", "Reserva cancelada com sucesso.");

        return "redirect:/reservalista";
    }
}
