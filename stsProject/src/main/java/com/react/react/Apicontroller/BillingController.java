package com.react.react.Apicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.react.react.ApiService.BillingService;
import com.react.react.AppEntity.Billing;

@CrossOrigin
@RestController
public class BillingController {
    @Autowired
    private BillingService ser;

    @PostMapping("/postPay")
    private  String SaveDetailsRequest(@RequestBody List<Billing> billingList) {
         ser.saveDetails(billingList);
         return "Saved details in billing list.";
    }
}
