package co.com.bank.model.account.gateways;

import co.com.bank.model.account.Account;

import java.util.List;

public interface AccountRepository {
        List<Account> findByIdCustomer(Long idCustomer);
}
