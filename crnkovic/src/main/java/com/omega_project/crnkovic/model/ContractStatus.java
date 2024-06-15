package com.omega_project.crnkovic.model;

public enum ContractStatus {
    DELIVERED(false),
    ORDERED(new ContractStatus[]{DELIVERED}, true),
    CREATED(new ContractStatus[]{ORDERED}, true);
    ContractStatus[] allowedTransitions;
    Boolean isActive;

    ContractStatus(ContractStatus[] allowedTransitions, Boolean isActive) {
        this.allowedTransitions = allowedTransitions;
        this.isActive = isActive;
    }

    ContractStatus(Boolean isActive) {
        this.isActive = isActive;
    }

}
