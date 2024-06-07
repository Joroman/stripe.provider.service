package com.accidpayments.microservices.stripe.provider.service.controller;

import com.accidpayments.microservices.stripe.provider.service.bean.Payment;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProviderController {

    @PostMapping("/payment/stripe")
    public Payment makePayment(@RequestBody Payment request){
        final Payment payment = new Payment(request.getAmount(), request.getCurrency(), request.getDescription());
        return payment;
    }

    @GetMapping("/payment/stripe/{id}")
    public Payment getPaymentById(@PathVariable int id){
        Payment payment = new Payment(200, "EUR", "Electric piano");
        payment.setId(id);
        return payment;
    }
}
