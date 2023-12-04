package com.react.react.ApiService;

import com.react.react.AppEntity.Register;
import com.react.react.AppRepository.register_repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterService {

    
    @Autowired
    private  register_repository registerRepository;
    public List<Register> getAllRegisters() {
        return registerRepository.findAll();
    }

    public Optional<Register> getRegisterById(int id) {
        return registerRepository.findById(id);
    }

    public Register saveRegister(Register register) {
        return registerRepository.save(register);
    }

    public void deleteRegister(int id) {
        registerRepository.deleteById(id);
    }

    public Register updateRegister(Register register) {
        return registerRepository.save(register);
    }
}
