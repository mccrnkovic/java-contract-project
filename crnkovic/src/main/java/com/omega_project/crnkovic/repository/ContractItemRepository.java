package com.omega_project.crnkovic.repository;

import com.omega_project.crnkovic.model.ContractItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractItemRepository extends JpaRepository<ContractItem, Long> {

    List<ContractItem> findAllByContractId(Long contractId);
}
