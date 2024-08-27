package com.tg.vitrineVirtual.dto;

public class CadastroRequest {
    private ClienteDTO cliente;
    private EnderecoDTO enderecoDTO;

    public CadastroRequest() {
    }

    public CadastroRequest(ClienteDTO cliente, EnderecoDTO enderecoDTO) {
        this.cliente = cliente;
        this.enderecoDTO = enderecoDTO;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public EnderecoDTO getEnderecoDTO() {
        return enderecoDTO;
    }

    public void setEnderecoDTO(EnderecoDTO enderecoDTO) {
        this.enderecoDTO = enderecoDTO;
    }
}
