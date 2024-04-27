package vn.edu.fit.iuh.services;

import vn.edu.fit.iuh.models.Customer;

public interface ICustomerServices {
    public Customer create(Customer customer);
    public Customer getInfo(long id);
    public Iterable<Customer> getAll();
}
