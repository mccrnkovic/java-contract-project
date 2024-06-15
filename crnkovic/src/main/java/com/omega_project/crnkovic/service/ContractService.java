package com.omega_project.crnkovic.service;

import com.omega_project.crnkovic.dto.ContractDto;
import com.omega_project.crnkovic.dto.ContractItemDto;
import com.omega_project.crnkovic.mapper.ContractItemMapper;
import com.omega_project.crnkovic.mapper.ContractMapper;
import com.omega_project.crnkovic.model.ContractItem;
import com.omega_project.crnkovic.repository.ContractItemRepository;
import com.omega_project.crnkovic.repository.ContractRepository;
import com.omega_project.crnkovic.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContractService {
    private ContractRepository contractRepository;
    private ContractItemRepository contractItemRepository;

    @Autowired
    public ContractService(ContractRepository contractRepository, ContractItemRepository contractItemRepository) {
        this.contractRepository = contractRepository;
        this.contractItemRepository = contractItemRepository;
    }

    public List<ContractDto> getAllContracts() {
        List<Contract> contracts = contractRepository.findAll();
        List<ContractDto> contractDtos = contracts.stream()
                .map(contract -> ContractMapper.MAPPER.toDto(contract))
                .collect(Collectors.toList());

        return contractDtos;
    }

    public List<ContractItemDto> getItemsByContractId(Long contractId) {
        List<ContractItem> contractItems = contractItemRepository.findAllByContractId(contractId);
        List<ContractItemDto> contractItemDtos = contractItems.stream()
                .map(ContractItemMapper.MAPPER::toDto)
                .collect(Collectors.toList());

        return contractItemDtos;
    }
}
