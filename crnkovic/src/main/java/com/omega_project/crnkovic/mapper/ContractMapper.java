package com.omega_project.crnkovic.mapper;

import com.omega_project.crnkovic.dto.ContractDto;
import com.omega_project.crnkovic.model.Contract;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface ContractMapper {

    public ContractDto toDto(Contract contract);
    public Contract toModel(ContractDto contractDto);
}
