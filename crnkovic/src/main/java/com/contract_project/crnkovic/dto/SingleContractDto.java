package com.contract_project.crnkovic.dto;

import lombok.Data;

import java.util.List;

@Data
public class SingleContractDto extends ContractDto{
    List<ContractItemDto> items;
}
