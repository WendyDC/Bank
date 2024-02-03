package co.com.bank.jpa;

import co.com.bank.jpa.helper.AdapterOperations;
import co.com.bank.jpa.model.AccountRepositoryJPA;
import co.com.bank.jpa.model.AccountRepositoryJPAMapper;
import co.com.bank.model.account.Account;
import co.com.bank.model.account.gateways.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Account, AccountRepositoryJPA, Long, JPARepository>
 implements AccountRepository
{
    @Autowired
    AccountRepositoryJPAMapper repositoryJPAMapper;

    public JPARepositoryAdapter(JPARepository repository, AccountRepositoryJPAMapper repositoryJPAMapper) {
        super(repository, repositoryJPAMapper);
    }


    @Override
    public List<Account> findByIdCustomer(Long idCustomer) {
        List<AccountRepositoryJPA> accountList = repository.findByIdCustomer(idCustomer);
        return accountList.stream().map(c -> repositoryJPAMapper.toEntity(c))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
