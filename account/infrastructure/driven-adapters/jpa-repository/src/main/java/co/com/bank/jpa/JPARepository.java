package co.com.bank.jpa;

import co.com.bank.jpa.model.AccountRepositoryJPA;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface JPARepository extends CrudRepository<AccountRepositoryJPA, Long>,
        QueryByExampleExecutor<AccountRepositoryJPA> {

        @Query("SELECT a FROM AccountRepositoryJPA a WHERE a.customer.id = :customerId")
        List<AccountRepositoryJPA> findByIdCustomer(@Param("customerId") Long customerId);
}
