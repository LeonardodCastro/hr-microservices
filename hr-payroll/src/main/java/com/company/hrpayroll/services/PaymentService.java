package com.company.hrpayroll.services;

import com.company.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days){
        return new Payment("Bob",200.0,days );
    }
}
