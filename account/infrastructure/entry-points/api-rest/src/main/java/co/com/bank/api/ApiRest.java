package co.com.bank.api;
import co.com.bank.api.model.AccountResponse;
import co.com.bank.model.account.Account;
import co.com.bank.usecase.account.AccountUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/account", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final AccountUseCase useCase;


    @GetMapping(path = "/{idCustomer}")
    public ResponseEntity<List<AccountResponse>> getAccountByCustomer(@PathVariable("idCustomer") Long idCustomer){
        List<Account> accountList = useCase.findByIdCustomer(idCustomer);
        List<AccountResponse> accountResponseList = new ArrayList<>();
        for (Account account:accountList) {
            AccountResponse accountResponse = AccountResponse.builder().id(account.getId())
                    .amount(account.getAmount()).status(account.getStatus()).idProduct(account.getProduct().getId())
                    .desProduct(account.getProduct().getDescription()).typeProduct(account.getProduct().getType()).build();
            accountResponseList.add(accountResponse);
        }
        return new ResponseEntity<List<AccountResponse>>(accountResponseList,
                HttpStatus.OK);
    }
}
