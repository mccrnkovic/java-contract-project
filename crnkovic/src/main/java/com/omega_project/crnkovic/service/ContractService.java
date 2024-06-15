package com.omega_project.crnkovic.service;

import com.omega_project.crnkovic.dto.ContractDto;
import com.omega_project.crnkovic.mapper.ContractMapper;
import com.omega_project.crnkovic.repository.ContractRepository;
import com.omega_project.crnkovic.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContractService {
    private ContractRepository contractRepository;

    @Autowired
    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<ContractDto> findAll() {
        List<Contract> contracts = contractRepository.findAll();
        List<ContractDto> contractDtos = contracts.stream()
                .map(contract -> ContractMapper.MAPPER.toDto(contract))
                .collect(Collectors.toList());

        return contractDtos;
    }
}
