package com.omega_project.crnkovic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ContractItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String supplier;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "char(20) default 'CREATED'")
    private ContractStatus status;
    @ManyToOne(fetch = FetchType.LAZY)
    private Contract contract;
}
