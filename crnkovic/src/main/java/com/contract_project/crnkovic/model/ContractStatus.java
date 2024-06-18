package com.contract_project.crnkovic.model;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@Getter
public enum ContractStatus {
    DELIVERED(new ContractStatus[]{}, false),
    ORDERED(new ContractStatus[]{DELIVERED}, true),
    CREATED(new ContractStatus[]{ORDERED}, true);
    ContractStatus[] allowedTransitions;
    Boolean isActive;

    ContractStatus(ContractStatus[] allowedTransitions, Boolean isActive) {
        this.allowedTransitions = allowedTransitions;
        this.isActive = isActive;
    }

    public Boolean isAllowedTransition(ContractStatus contractStatus) {
        Optional<ContractStatus> allowedTransitionOptional = Arrays.stream(this.allowedTransitions)
                .filter(allowed -> allowed == contractStatus).findAny();

        return allowedTransitionOptional.isPresent();
    }

}
