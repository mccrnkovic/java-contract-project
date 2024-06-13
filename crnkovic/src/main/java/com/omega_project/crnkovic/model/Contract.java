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
    private String customer;
    @Column(nullable = false)
    private String contractNumber;
    private Date paymentDate;
    private Date deliveryDueDate;
    @Column(nullable = false)
    private String status;
}
