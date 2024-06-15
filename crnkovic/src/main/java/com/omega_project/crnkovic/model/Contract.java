package com.omega_project.crnkovic.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.util.Date;

@Data
@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String customer;
    @Column(nullable = false)
    private String contractNumber;
    @Column(nullable = false)
    private Date paymentDate;
    @Column(nullable = false)
    private Date deliveryDueDate;
    @Column(nullable = false, columnDefinition = "text default 'CREATED'")
    @Enumerated(EnumType.STRING)
    private ContractStatus status;
}
