package com.contract_project.crnkovic.dto;

import com.contract_project.crnkovic.model.ContractStatus;
import lombok.Data;

@Data
public class ContractItemDto {
    private Long id;
    private String name;
    private String supplier;
    private ContractStatus status;
}
