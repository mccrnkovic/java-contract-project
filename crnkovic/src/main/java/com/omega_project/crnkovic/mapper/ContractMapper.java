package com.omega_project.crnkovic.mapper;

import com.omega_project.crnkovic.dto.ContractDto;
import com.omega_project.crnkovic.model.Contract;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContractMapper {

    ContractMapper MAPPER = Mappers.getMapper(ContractMapper.class);
    public ContractDto toDto(Contract contract);
    public Contract toModel(ContractDto contractDto);
}
