package com.contract_project.crnkovic.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
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
    @Column(nullable = false, columnDefinition = "char(20) default 'CREATED'")
    @Enumerated(EnumType.STRING)
    private ContractStatus status;
    @OneToMany(mappedBy = "contract", fetch = FetchType.LAZY)
    private List<ContractItem> items;
}
