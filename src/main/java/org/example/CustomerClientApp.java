package org.example;

import java.util.ArrayList;
import java.util.List;

public class CustomerClientApp {

    public static void main(String[] args) {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        CustomerDTO customer1 = new CustomerDTO("1", "John", "Smith");
        CustomerDTO customer2 = new CustomerDTO("2", "Kevin", "Biden");

        customerDTOList.add(customer1);
        customerDTOList.add(customer2);

        CustomerResource customerResource = new CustomerResource(customerDTOList);

        System.out.println("All customers: ");
        List<CustomerDTO> allCustomers = customerResource.getAllCustomers();
        printCustomerDetails(allCustomers);

        System.out.println("------------------------------------");

        System.out.println("Deleting customer with id {1}");

    }
}
