package org.jypj.dev.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.jypj.dev.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CustomerRepositoryTest {

    @Resource
    private CustomerRepository customerRepository;


    @Test
    public void findByFirstName() {
        customerRepository.deleteAll();

        customerRepository.save(Customer.builder().firstName("chen").lastName("yu").build());
        customerRepository.save(Customer.builder().firstName("wang").lastName("pan").build());

        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        List<Customer> customers = customerRepository.findAll();
        customers.forEach(customer -> System.out.println(customer.toString()));
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(customerRepository.findByFirstName("Alice"));
    }

    @Test
    public void findByLastName() {

    }
}