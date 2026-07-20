package com.senai.revisao2.controllers;
import com.senai.revisao2.dtos.*;
import com.senai.revisao2.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UsuarioController {

    //--Injeção de dependencia do service
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public String realizarLogin(String email, String senha, Model model, RedirectAttributes redirectAttributes){

        //--Criação de objeto dto para enviara dados para o service
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setEmail(email);


        //--Realiza login no banco de dados
        UsuarioDto usuarioDtoRetorno = service.realizarLogin(usuarioDto);

        //--Verifica se retonar dados do usuário significa que deu certo
        if (usuarioDtoRetorno.getNome() != null) {

            redirectAttributes.addFlashAttribute("usuario", " Bem-vindo " + usuarioDtoRetorno.getNome() );

            return "redirect:/home";
        }

        //-- retorna erro no login
        model.addAttribute("erro","E-mail ou senha invalidos.");
        return "login";

    }

    @PostMapping("/usuarioinserir")
    public String inserirUsuario(
            @Valid @ModelAttribute("usuario") UsuarioDto usuarioDto,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "usuarioinserir";
        }

        service.usuarioInserir(usuarioDto);

        redirectAttributes.addFlashAttribute("mensagem", "Usuario cadastrado com sucesso.");

        return "redirect:/usuariolista";
    }
}
