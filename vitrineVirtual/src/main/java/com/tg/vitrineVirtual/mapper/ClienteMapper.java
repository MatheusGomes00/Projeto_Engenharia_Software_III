package com.tg.vitrineVirtual.mapper;

import com.tg.vitrineVirtual.dto.ClienteDTO;
import com.tg.vitrineVirtual.dto.EnderecoDTO;
import com.tg.vitrineVirtual.model.entities.Cliente;
import com.tg.vitrineVirtual.model.entities.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteDTO clienteToClienteDTO(Cliente cliente);

    Cliente clienteDTOToCliente(ClienteDTO clienteDTO);

    EnderecoDTO enderecoToEnderecoDTO(Endereco endereco);

    Endereco enderecoDTOToEndereco(EnderecoDTO enderecoDTO);
}

