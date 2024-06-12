package service;

import model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ContractRepository;

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
