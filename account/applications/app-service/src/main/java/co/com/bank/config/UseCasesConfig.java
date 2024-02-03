package co.com.bank.config;

import co.com.bank.model.account.gateways.AccountRepository;
import co.com.bank.usecase.account.AccountUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.bank.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {

        @Bean
        public AccountUseCase accountUseCase(AccountRepository accountRepository) {
                return new AccountUseCase(accountRepository);
        }



}
