package com.react.react.Apicontroller;

import com.react.react.ApiService.RegisterService;
import com.react.react.AppEntity.Register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;




@CrossOrigin
@RestController
// @RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("/getregister")
    public List<Register> getAllRegisters() {
        return registerService.getAllRegisters();
    }

    @GetMapping("/{id}")
    public Optional<Register> getRegisterById(@PathVariable int id) {
        return registerService.getRegisterById(id);
    }

    @PostMapping("/register")
    public Register saveRegister(@RequestBody Register register) {
        return registerService.saveRegister(register);
    }

    @DeleteMapping("/{id}")
    public void deleteRegister(@PathVariable int id) {
        registerService.deleteRegister(id);
    }

    @PutMapping
    public Register updateRegister(@RequestBody Register register) {
        return registerService.updateRegister(register);
    }
}
