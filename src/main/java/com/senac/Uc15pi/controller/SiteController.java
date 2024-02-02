package com.senac.Uc15pi.controller;

import com.senac.Uc15pi.data.Terapeuta;
import com.senac.Uc15pi.data.Usuario;
import com.senac.Uc15pi.service.TerapeutaService;
import com.senac.Uc15pi.service.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Kevin
 */
@Controller
public class SiteController {
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    TerapeutaService terapeutaService;

    @RequestMapping("/")
    public ModelAndView login(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("menu");
        return new ModelAndView("login");
    }

    @PostMapping("/login")
    public String realizarLogin(HttpServletRequest request, Usuario usuarioRequest) {
        HttpSession sessao = request.getSession();
        Usuario usuario = usuarioService.getUsuarioLogin(usuarioRequest.getLogin());
        if(sessao != null && usuario != null && usuarioRequest.getLogin().equals(usuario.getLogin()) && usuarioRequest.getSenha().equals(usuario.getSenha()))
            sessao.setAttribute("usuario", usuario.getLogin());
        return "redirect:/";
    }

    @RequestMapping("/cadastrar")
    public String cadastro(Model model) {
        model.addAttribute("terapeuta", new Terapeuta());
        model.addAttribute("usuario", new Usuario());
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String realizarCadastro(@ModelAttribute Terapeuta terapeuta, @ModelAttribute Usuario usuario) {
        if(terapeuta != null && usuario != null) {
            terapeutaService.criarTerapeuta(terapeuta);
            usuario.setTerapeuta(terapeuta);
            usuarioService.criarUsuario(usuario);
        }
        return "redirect:/";
    }

    @RequestMapping("/logoff")
    public ModelAndView fazLogoff(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(sessao != null) sessao.removeAttribute("usuario");
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("/menu")
    public ModelAndView menu(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("menu");
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("/cadastro_paciente")
    public ModelAndView cadastroPaciente(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("cadastroPaciente");
        return new ModelAndView("redirect:/");
    }

    @PostMapping("/cadastro_paciente")
    public ModelAndView cadastrarPaciente(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("redirect:/menu");
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("/cadastro_consulta")
    public ModelAndView cadastroConsulta(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("cadastroConsulta");
        return new ModelAndView("redirect:/");
    }

    @PostMapping("/cadastro_consulta")
    public ModelAndView cadastrarConsulta(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("redirect:/menu");
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("/listagem_pacientes")
    public ModelAndView listagemPaciente(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("listagemPaciente");
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("/listagem_consultas")
    public ModelAndView listagemConsulta(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("listagemConsulta");
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("/cadastro_ficha")
    public ModelAndView cadastroFicha(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("cadastroFicha");
        return new ModelAndView("redirect:/");
    }

    @PostMapping("/cadastro_ficha")
    public ModelAndView cadastrarFicha(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("redirect:/listagem_pacientes");
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("/fichas_paciente")
    public ModelAndView fichasPaciente(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("fichasPaciente");
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("/dados_ficha")
    public ModelAndView dadosFicha(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        if(validar(sessao)) return new ModelAndView("dadosFicha");
        return new ModelAndView("redirect:/");
    }

    private boolean validar(HttpSession sessao) {
        return sessao != null && sessao.getAttribute("usuario") != null && sessao.getAttribute("usuario").equals(usuarioService.getUsuarioLogin((String)sessao.getAttribute("usuario")).getLogin());
    }
}
