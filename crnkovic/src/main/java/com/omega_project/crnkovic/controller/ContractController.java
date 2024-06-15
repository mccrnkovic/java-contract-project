package com.omega_project.crnkovic.controller;


import com.omega_project.crnkovic.dto.ContractDto;
import com.omega_project.crnkovic.dto.ContractItemDto;
import com.omega_project.crnkovic.model.ContractItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.omega_project.crnkovic.service.ContractService;

import java.util.List;

@RestController
public class ContractController {

    private ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/getAllContracts")
    public ResponseEntity getAllContracts(){
        List<ContractDto> result = contractService.getAllContracts();
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping("/getItemsByContractId")
    public ResponseEntity getItemsByContractId(@RequestParam Long contractId) {
        List<ContractItemDto> result = contractService.getItemsByContractId(contractId);
        return new ResponseEntity(result, HttpStatus.OK);
    }


}
