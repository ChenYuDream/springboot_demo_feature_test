package org.jypj.dev.repository;

import org.jypj.dev.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author ChenYu
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    /**
     * 按名称查询
     *
     * @param firstName
     * @return
     */
    Customer findByFirstName(String firstName);

    /**
     * 按lastname查询
     *
     * @param lastName
     * @return
     */
    List<Customer> findByLastName(String lastName);

}