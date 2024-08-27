package com.tg.vitrineVirtual.dto;

public class ClienteDTO extends UsuarioDTO{

    public ClienteDTO() {
    }

    public ClienteDTO(String cpf) {
        super();
        this.cpf = cpf;
    }

    private String cpf;

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
