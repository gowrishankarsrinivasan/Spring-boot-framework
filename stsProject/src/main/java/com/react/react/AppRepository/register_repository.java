package com.react.react.AppRepository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;

import com.react.react.AppEntity.Register;
@EnableAutoConfiguration
@EntityScan(basePackages = "com.react.react.register_entity")
public interface register_repository extends JpaRepository<Register,Integer> {
    
}
