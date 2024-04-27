package vn.edu.fit.iuh;

import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.fit.iuh.models.Customer;
import vn.edu.fit.iuh.services.CustomerServicesImpl;

import java.util.Random;

@SpringBootApplication
public class SaRecyclingServicesServiceBasedApplication implements CommandLineRunner {

    @Autowired
    private CustomerServicesImpl customerServices;

    public static void main(String[] args) {
        SpringApplication.run(SaRecyclingServicesServiceBasedApplication.class, args);
    }

    public String random_acc_bank() {
        Random rand = new Random();
        String card = "BE";
        for (int i = 0; i < 14; i++) {
            int n = rand.nextInt(10) + 0;
            card += Integer.toString(n);
        }
        for (int i = 0; i < 16; i++) {
            if (i % 4 == 0) System.out.print(" ");
            System.out.print(card.charAt(i));
        }
        return card;
    }

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            customerServices.create(new Customer(
                    faker.name().fullName(),
                    faker.name().firstName() + "@topmail.com",
                    faker.address().fullAddress(),
                    faker.phoneNumber().phoneNumber(),
                    random_acc_bank(),
                    "ACB"
            ));
        }
    }
}
