package co.com.bank.usecase.account;

import co.com.bank.model.account.Account;
import co.com.bank.model.account.gateways.AccountRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class AccountUseCase {

        private final AccountRepository accountRepository;

        public List<Account> findByIdCustomer(Long idCustomer){
                return accountRepository.findByIdCustomer(idCustomer);
        }
}
