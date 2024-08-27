package com.tg.vitrineVirtual.service;

import com.tg.vitrineVirtual.dto.ClienteDTO;
import com.tg.vitrineVirtual.dto.EnderecoDTO;
import com.tg.vitrineVirtual.mapper.ClienteMapper;
import com.tg.vitrineVirtual.model.entities.Cliente;
import com.tg.vitrineVirtual.model.entities.Endereco;
import com.tg.vitrineVirtual.model.enums.TipoUsuario;
import com.tg.vitrineVirtual.repository.ClienteRepository;
import com.tg.vitrineVirtual.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    public void cadastrarCliente(ClienteDTO clienteDTO, EnderecoDTO enderecoDTO) {
        // Converter DTOs para entidades
        Endereco endereco = clienteMapper.enderecoDTOToEndereco(enderecoDTO);
        Cliente cliente = clienteMapper.clienteDTOToCliente(clienteDTO);

        // Salvar o endereço
        Endereco enderecoSalvo = enderecoRepository.save(endereco);

        // Associar o endereço salvo ao cliente
        cliente.setEndereco(enderecoSalvo);
        cliente.setTipoUsuario(TipoUsuario.CLIENTE);

        // Salvar o cliente
        clienteRepository.save(cliente);
    }
}
