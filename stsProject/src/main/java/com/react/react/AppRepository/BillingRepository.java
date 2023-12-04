package com.react.react.AppRepository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;


import com.react.react.AppEntity.Billing;
@EnableAutoConfiguration
@EntityScan(basePackages = "com.react.react.AppEntity")
public interface BillingRepository extends JpaRepository<Billing, Long> {

}
