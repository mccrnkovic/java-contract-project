package com.omega_project.crnkovic.repository;

import com.omega_project.crnkovic.model.Contract;
import com.omega_project.crnkovic.model.ContractItem;
import com.omega_project.crnkovic.model.ContractStatus;
import jakarta.persistence.criteria.Expression;
import jakarta.persistence.criteria.Path;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.rsocket.RSocketProperties;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public interface ContractRepository extends JpaRepository<Contract, String>, JpaSpecificationExecutor<Contract> {

    static Specification<Contract> byCustomer(String customer) {
        return  ((root, query, criteriaBuilder) -> {
           return customer != null ? criteriaBuilder.like(root.get("customer"), "%" + customer + "%")
                    : criteriaBuilder.conjunction();
        });
    }

    static Specification<Contract> byStatus(ContractStatus status) {
        return  ((root, query, criteriaBuilder) -> {
            return status != null ? criteriaBuilder.equal(root.get("status"), "%" + status.name() + "%")
            : criteriaBuilder.conjunction();
        });
    }

    static Specification<Contract> byActiveStatus(Boolean active) {
        return  ((root, query, criteriaBuilder) -> {
            List<String> activeStatusList = Arrays.stream(ContractStatus.values())
                    .filter(status -> status.getIsActive())
                    .map(status -> status.name())
                    .collect(Collectors.toList());

            List<String> inactiveStatusList = Arrays.stream(ContractStatus.values())
                    .filter(status -> !status.getIsActive())
                    .map(status -> status.name())
                    .collect(Collectors.toList());

            Expression<String> statusExpression = root.get("status");

            return statusExpression.in(active ? activeStatusList : inactiveStatusList);
        });
    }

}
