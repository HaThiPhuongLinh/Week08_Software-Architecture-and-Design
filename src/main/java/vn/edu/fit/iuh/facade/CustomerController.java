package vn.edu.fit.iuh.facade;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.fit.iuh.models.Customer;
import vn.edu.fit.iuh.services.ICustomerServices;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final ICustomerServices customerServices;

    public CustomerController(ICustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        Customer cust = customerServices.create(customer);
        return ResponseEntity.ok(cust);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getInfo(@PathVariable long id) {
        Customer cust = customerServices.getInfo(id);
        return ResponseEntity.ok(cust);
    }

}
