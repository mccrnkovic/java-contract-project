package com.omega_project.crnkovic.controller;


import com.omega_project.crnkovic.dto.ContractDto;
import com.omega_project.crnkovic.dto.ContractItemDto;
import com.omega_project.crnkovic.dto.SingleContractDto;
import com.omega_project.crnkovic.model.Contract;
import com.omega_project.crnkovic.model.ContractItem;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.PropertyValueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.omega_project.crnkovic.service.ContractService;

import java.util.List;

@Slf4j
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

    @PostMapping("/getAllContracts")
    public ResponseEntity getAllContractsByFilter(@RequestBody ContractDto contractDto){
        List<ContractDto> result = contractService.getAllContractsByFilter(contractDto);
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping("/getContractById")
    public ResponseEntity getContractById(@RequestParam Long contractId){
        SingleContractDto result = contractService.getContractById(contractId);
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PostMapping("/insertContract")
    public ResponseEntity insertContract(@RequestBody ContractDto singleContractDto) {
        try {
            Contract contract = contractService.insertContract(singleContractDto);
            return new ResponseEntity(contract, HttpStatus.OK);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getItemsByContractId")
    public ResponseEntity getItemsByContractId(@RequestParam Long contractId) {
        List<ContractItemDto> result = contractService.getItemsByContractId(contractId);
        return new ResponseEntity(result, HttpStatus.OK);
    }


}
