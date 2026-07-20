package com.senai.revisao2.controllers;

import com.senai.revisao2.entities.RecursoEntity;
import com.senai.revisao2.entities.ReservaEntity;
import com.senai.revisao2.dtos.UsuarioDto;
import com.senai.revisao2.services.RecursoService;
import com.senai.revisao2.services.ReservaService;
import com.senai.revisao2.services.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class PageController {

    private final UsuarioService service;
    private final RecursoService recursoService;
    private final ReservaService reservaService;

    public PageController(UsuarioService service) {
            this.service = service;
            this.recursoService = recursoService;
            this.reservaService = reservaService;
        }

        @GetMapping("/")
        public String getIndex(){
            return "redirect:/login";
        }

        @GetMapping("/login")
        public String getLogin(){
            return "login";
        }

        @GetMapping("/home")
        public String getHome(){
            return "home";
        }

        @GetMapping("/usuariolista")
        public String getUsuarioLista(Model model){

            List<UsuarioDto> usuarioDtoLita = service.obterListaUsuarios();
            model.addAttribute("usuarios",usuarioDtoLita);
            return "usuariolista";

        }

        @GetMapping("/usuarioinserir")
        public String getUsuarioInserir(Model model){
            UsuarioDto dto = new UsuarioDto();
            model.addAttribute("usuario",dto);
            return "usuarioinserir";
        }

        @GetMapping("/recursolista")
        public String getRecursoLista(Model model){

            List<RecursoEntity> recursoLista = recursoService.obterListaRecursos();
            model.addAttribute("recursos",recursoLista);
            return "recursolista";

        }

        @GetMapping("/recursoinserir")
        public String getRecursoInserir(Model model){
            RecursoEntity recurso = new RecursoEntity();
            model.addAttribute("recurso",recurso);
            return "recursoinserir";
        }

        @GetMapping("/reservalista")
        public String getReservaLista(Model model){

            List<ReservaEntity> reservaLista = reservaService.obterListaReservas();
            model.addAttribute("reservas",reservaLista);
            return "reservalista";

        }

        @GetMapping("/reservainserir")
        public String getReservaInserir(Model model){
            ReservaEntity reserva = new ReservaEntity();
            model.addAttribute("reserva",reserva);
            model.addAttribute("usuarios",service.obterListaUsuariosEntity());
            model.addAttribute("recursos",recursoService.obterListaRecursos());
            return "reservainserir";
        }

        @GetMapping("/reservacancelar/{id}")
        public String getReservaCancelar(@PathVariable Long id, Model model){
            ReservaEntity reserva = reservaService.obterReservaPorId(id);
            model.addAttribute("reserva",reserva);
            return "reservacancelar";
        }
    }
