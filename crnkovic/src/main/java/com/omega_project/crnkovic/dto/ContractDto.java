package com.omega_project.crnkovic.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ContractDto {
    private Long id;
    private String customer;
    private String contractNumber;
    private Date paymentDate;
    private Date deliveryDueDate;
    private String status;
}
