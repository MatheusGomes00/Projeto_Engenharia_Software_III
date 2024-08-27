package com.tg.vitrineVirtual.model.entities;

import com.tg.vitrineVirtual.model.enums.TipoUsuario;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
public class Cliente extends Usuario{
    private String cpf;


    public Cliente(Long id, String nome, String telefone, String senha, Endereco endereco, String cpf) {
        super(id, nome, telefone, senha, TipoUsuario.CLIENTE, endereco);
        this.cpf = cpf;
    }

    public Cliente() {
        super();
        this.setTipoUsuario(TipoUsuario.CLIENTE);
    }
    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
