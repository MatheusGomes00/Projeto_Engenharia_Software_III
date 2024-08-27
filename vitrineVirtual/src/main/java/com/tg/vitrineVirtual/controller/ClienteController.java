// ClienteController.java
package com.tg.vitrineVirtual.controller;

import com.tg.vitrineVirtual.dto.CadastroRequest;
import com.tg.vitrineVirtual.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cadastro")
    public String mostrarFormularioCadastro(){
        return "cadastro";
    }

    @PostMapping("/salvar")
    public String cadastrarCliente(@RequestBody CadastroRequest request){
        try {
            clienteService.cadastrarCliente(request.getCliente(), request.getEnderecoDTO());
            return "redirect:/clientes/cadastro?success";
        } catch (Exception e) {
            // Aqui você pode adicionar logs e tratar exceções de forma mais específica
            return "Erro ao cadastrar cliente: " + e.getMessage();
        }
    }

//    @GetMapping("/login")
//    public String index(){
//        return "src/main/resources/templates/cadastro.html";
//    }
//
//    @PostMapping("/cadUser")
//    public String cad(@RequestBody UserEntity usuario){
//        UserEntity novoUsuario;
//    }

}
