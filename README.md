# Customer Service Application
## Introduction
> This project is a customer service application designed to manage customer information efficiently (only demo create customer). 
The application follows a layered architecture approach to ensure modularity, maintainability, and scalability.

## Architecture Overview

![image](https://github.com/HaThiPhuongLinh/Week08_Software-Architecture-and-Design/assets/109422010/4df794cf-e977-46b2-86b4-35e1adf2e2fe)

- **Presentation Layer**: This layer handles user interaction and interfaces with the application. It includes components such as user interfaces, controllers, and view models.
- **Business Logic Layer**: Also known as the service layer, this layer contains the business logic of the application. It orchestrates data manipulation and enforces business rules.
- **Persistence Layer**: This layer abstracts away the details of interacting with the underlying data storage mechanisms. It includes components responsible for managing database connections, transactions, and executing data access operations.
- **Database Layer**: This layer represents the actual data storage mechanism, such as relational databases, NoSQL databases, or external APIs. It stores and retrieves data according to the application's requirements.

## Utils Used
I use DataFaker to generate fake customer data and utilize randomization to generate random bank account numbers.

```js
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
```

```js
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
```

## Result
![image](https://github.com/HaThiPhuongLinh/Week08_Software-Architecture-and-Design/assets/109422010/e11ffdbc-b42f-4bc7-bfce-c5d5a9bb3fd8)

