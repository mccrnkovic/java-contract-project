package com.omega_project.crnkovic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String customer;
    private String number;
    private Date paymentDate;
    private Date deliveryDueDate;
    private String status;
}
