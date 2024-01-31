package com.senac.Uc15pi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Kevin
 */
@Controller
public class SiteController {

    @RequestMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String realizarLogin(/*Usuario usuarioRequest*/) {
        return "redirect:/menu";
    }

    @RequestMapping("/cadastrar")
    public String cadastro() {
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String realizarCadastro(/*Usuario usuario*/) {
        return "redirect:/";
    }

    @RequestMapping("/logoff")
    public ModelAndView fazLogoff() {
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("/menu")
    public String menu() {
        return "menu";
    }

    @RequestMapping("/cadastro_paciente")
    public String cadastroPaciente() {
        return "cadastroPaciente";
    }

    @PostMapping("/cadastro_paciente")
    public String cadastrarPaciente() {
        return "redirect:/menu";
    }

    @RequestMapping("/cadastro_consulta")
    public String cadastroConsulta() {
        return "cadastroConsulta";
    }

    @PostMapping("/cadastro_consulta")
    public String cadastrarConsulta() {
        return "redirect:/menu";
    }

    @RequestMapping("/listagem_pacientes")
    public String listagemPaciente() {
        return "listagemPaciente";
    }

    @RequestMapping("/listagem_consultas")
    public String listagemConsulta() {
        return "listagemConsulta";
    }

    @RequestMapping("/cadastro_ficha")
    public String cadastroFicha() {
        return "cadastroFicha";
    }

    @PostMapping("/cadastro_ficha")
    public String cadastrarFicha() {
        return "redirect:/listagem_pacientes";
    }

    @RequestMapping("/fichas_paciente")
    public String fichasPaciente() {
        return "fichasPaciente";
    }

    @RequestMapping("/dados_ficha")
    public String dadosFicha() {
        return "dadosFicha";
    }

//    private boolean validar(HttpSession sessao) {
//        return sessao != null && sessao.getAttribute("usuario") != null && sessao.getAttribute("usuario").equals(getUsuarioByLogin((String)sessao.getAttribute("usuario")).getLogin());
//    }
}
