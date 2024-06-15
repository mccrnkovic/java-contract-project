package com.omega_project.crnkovic.mapper;

import com.omega_project.crnkovic.dto.ContractDto;
import com.omega_project.crnkovic.model.Contract;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContractMapper {

    ContractMapper MAPPER = Mappers.getMapper(ContractMapper.class);
    ContractDto toDto(Contract contract);
    Contract toModel(ContractDto contractDto);
}
