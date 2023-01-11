package com.dias.randomlykafka.service;

import com.dias.randomlykafka.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerService {

    public void doSomething(Customer customer) {
      log.info(customer.toString());
    }
}
