package com.omega_project.crnkovic.mapper;

import com.omega_project.crnkovic.dto.ContractDto;
import com.omega_project.crnkovic.dto.SingleContractDto;
import com.omega_project.crnkovic.model.Contract;
import com.omega_project.crnkovic.model.ContractStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(uses = ContractItemMapper.class)
public interface ContractMapper {

    ContractMapper MAPPER = Mappers.getMapper(ContractMapper.class);

    @Mapping(target = "isActive", source = "status", qualifiedByName = "isStatusActive")
    ContractDto toDto(Contract contract);
    SingleContractDto toSingleContractDto(Contract contract);
    Contract toModel(ContractDto contractDto);

    @Named("isStatusActive")
    static Boolean isStatusActive(ContractStatus status) {
        return status.getIsActive();
    }
}
