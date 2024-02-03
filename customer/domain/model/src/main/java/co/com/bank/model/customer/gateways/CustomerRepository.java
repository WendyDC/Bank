package co.com.bank.model.customer.gateways;

import co.com.bank.model.customer.Customer;

public interface CustomerRepository {
        Customer findById(Long id);
}
