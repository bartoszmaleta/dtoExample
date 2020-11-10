package org.example;

import java.util.List;

public class CustomerResource {
    private List<CustomerDTO> customers;

    public CustomerResource(List<CustomerDTO> customers) {
        this.customers = customers;
    }

    public List<CustomerDTO> getAllCustomers() {
        return customers;
    }

    public CustomerResource setCustomers(List<CustomerDTO> customers) {
        this.customers = customers;
        return this;
    }

    public void save(CustomerDTO customer) {
        customers.add(customer);
    }

    public void delete(final String customerId) {
        customers.removeIf(customer -> customer.getId().equals(customerId));
    }
}
