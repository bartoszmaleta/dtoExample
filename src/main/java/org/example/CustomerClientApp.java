package org.example;

import java.util.ArrayList;
import java.util.List;

// tutorial: https://www.youtube.com/watch?v=CjV2uUozrNc&ab_channel=JavaGuides

public class CustomerClientApp {

    public static void main(String[] args) {
        List<CustomerDTO> customers = new ArrayList<>();
        CustomerDTO customer1 = new CustomerDTO("1", "John", "Smith");
        CustomerDTO customer2 = new CustomerDTO("2", "Kevin", "Biden");

        customers.add(customer1);
        customers.add(customer2);

        CustomerResource customerResource = new CustomerResource(customers);

        System.out.println("All customers: ");
        List<CustomerDTO> allCustomers = customerResource.getAllCustomers();
        printCustomerDetails(allCustomers);

        System.out.println("------------------------------------");

        System.out.println("Deleting customer with id {1}");
        customerResource.delete(customer1.getId());
        allCustomers = customerResource.getAllCustomers();
        printCustomerDetails(allCustomers);


        System.out.println("------------------------------------");
        System.out.println("Adding customer 3");
        CustomerDTO customer3 = new CustomerDTO("3", "Barack", "Obama");
        customerResource.save(customer3);
        allCustomers = customerResource.getAllCustomers();
        printCustomerDetails(allCustomers);


    }

    private static void printCustomerDetails(List<CustomerDTO> allCustomers) {
        allCustomers.forEach(customer -> System.out.println(customer.getFirstname()));
    }
}
