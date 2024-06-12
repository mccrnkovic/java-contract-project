package controller;

import model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ContractService;

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
        List<Contract> result = contractService.findAll();
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
