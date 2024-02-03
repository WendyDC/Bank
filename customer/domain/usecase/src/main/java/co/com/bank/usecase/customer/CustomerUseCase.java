package co.com.bank.usecase.customer;

import co.com.bank.model.customer.Customer;
import co.com.bank.model.customer.exception.CustomerNotFound;
import co.com.bank.model.customer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerUseCase {

        private final CustomerRepository customerRepository;

        public Customer findById(Long id){
                Customer customer = customerRepository.findById(id);
                if(customer==null){
                        throw new CustomerNotFound();
                }
                return customer;
        }
}
