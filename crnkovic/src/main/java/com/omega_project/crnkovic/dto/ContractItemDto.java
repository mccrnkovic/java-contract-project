package com.omega_project.crnkovic.dto;

import com.omega_project.crnkovic.model.ContractStatus;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class ContractItemDto {
    private Long id;
    private String name;
    private String supplier;
    private ContractStatus status;
}
