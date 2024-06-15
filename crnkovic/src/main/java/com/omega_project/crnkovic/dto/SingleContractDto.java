package com.omega_project.crnkovic.dto;

import com.omega_project.crnkovic.model.ContractStatus;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SingleContractDto extends ContractDto{
    List<ContractItemDto> items;
}
