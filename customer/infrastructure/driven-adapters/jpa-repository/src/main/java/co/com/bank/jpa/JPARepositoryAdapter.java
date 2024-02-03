package co.com.bank.jpa;

import co.com.bank.jpa.helper.AdapterOperations;
import co.com.bank.jpa.models.CustomerRepositoryJPA;
import co.com.bank.jpa.models.CustomerRepositoryJPAMapper;
import co.com.bank.model.customer.Customer;
import co.com.bank.model.customer.gateways.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Customer, CustomerRepositoryJPA, Long, JPARepository>
        implements CustomerRepository{

    @Autowired
    CustomerRepositoryJPAMapper repositoryJPAMapper;

    public JPARepositoryAdapter(JPARepository repository, CustomerRepositoryJPAMapper repositoryJPAMapper) {
        super(repository, repositoryJPAMapper);
    }
}
