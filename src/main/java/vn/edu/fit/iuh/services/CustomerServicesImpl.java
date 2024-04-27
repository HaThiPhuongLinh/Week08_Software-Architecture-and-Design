package vn.edu.fit.iuh.services;

import vn.edu.fit.iuh.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.fit.iuh.repositories.CustomerRepository;

import java.util.List;

@Service
public class CustomerServicesImpl implements ICustomerServices{
    @Autowired
    public CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getInfo(long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Customer> getAll() {
        return customerRepository.findAll();
    }
}
