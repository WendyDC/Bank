package co.com.bank.jpa;

import co.com.bank.jpa.models.CustomerRepositoryJPA;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<CustomerRepositoryJPA, Long>,
        QueryByExampleExecutor<CustomerRepositoryJPA> {
}
