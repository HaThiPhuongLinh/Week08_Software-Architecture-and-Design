package vn.edu.fit.iuh.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cust_id;
    @Column(length = 200, nullable = false)
    private String cust_name;
    @Column(length = 150, nullable = false, unique = true)
    private String email;
    private String address;
    private String phone;
    private String bank_acc_number;
    private String bank_name;

    public Customer(String cust_name, String email, String address, String phone, String bank_acc_number, String bank_name) {
        this.cust_name = cust_name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.bank_acc_number = bank_acc_number;
        this.bank_name = bank_name;
    }

}
