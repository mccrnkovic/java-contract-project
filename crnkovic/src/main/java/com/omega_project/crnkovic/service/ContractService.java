package com.omega_project.crnkovic.service;

import com.omega_project.crnkovic.repository.ContractRepository;
import com.omega_project.crnkovic.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {
    private ContractRepository contractRepository;

    @Autowired
    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<Contract> findAll() {
        List<Contract> result = contractRepository.findAll();
        return result;
    }
}
