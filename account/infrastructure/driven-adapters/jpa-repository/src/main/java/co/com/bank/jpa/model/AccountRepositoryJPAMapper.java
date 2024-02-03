package co.com.bank.jpa.model;

import co.com.bank.jpa.helper.SimpleMapper;
import co.com.bank.model.account.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountRepositoryJPAMapper extends SimpleMapper<Account, AccountRepositoryJPA> {
}
