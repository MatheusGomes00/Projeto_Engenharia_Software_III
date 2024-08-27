package com.tg.vitrineVirtual.dto;

import com.tg.vitrineVirtual.model.enums.TipoUsuario;



public class UsuarioDTO {
    private Long id;
    private String nome;
    private String telefone;
    private String senha;
    private TipoUsuario tipoUsuario;
    private EnderecoDTO endereco;


    public UsuarioDTO() {
    }

    public UsuarioDTO(Long id, String nome, String telefone, String senha, TipoUsuario tipoUsuario, EnderecoDTO endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.endereco = endereco;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }
}
