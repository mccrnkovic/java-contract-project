package com.omega_project.crnkovic.mapper;

import com.omega_project.crnkovic.dto.ContractItemDto;
import com.omega_project.crnkovic.model.ContractItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContractItemMapper {
    ContractItemMapper MAPPER = Mappers.getMapper(ContractItemMapper.class);
    ContractItemDto toDto(ContractItem contractItem);
    ContractItem toModel(ContractItemDto contractItemDto);
}
