package com.contract_project.crnkovic.dto;

import com.contract_project.crnkovic.model.ContractStatus;
import lombok.Data;

import java.util.Date;

@Data
public class ContractDto {
    private Long id;
    private String customer;
    private String contractNumber;
    private Date paymentDate;
    private Date deliveryDueDate;
    private ContractStatus status;
    private Boolean isActive;
}
