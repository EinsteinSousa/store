package com.einsteinsousa.store;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class OrderService {
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    private PaymentService paymentService;
    
    public OrderService(PaymentService paymentService) {
         this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(100.0); 
    }

}
