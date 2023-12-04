package com.react.react.ApiService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.react.AppEntity.Billing;
import com.react.react.AppRepository.BillingRepository;

@Service
public class BillingService {

    @Autowired
    private final BillingRepository repo;

    public BillingService(BillingRepository repo) {
        this.repo = repo;
    }

    public String saveDetails(List<Billing> billingList) {
         repo.saveAll(billingList);
         return "Saved details in billing list.";
    }
}
