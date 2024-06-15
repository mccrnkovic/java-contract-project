package com.omega_project.crnkovic.repository;

import com.omega_project.crnkovic.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract, String> {

}
