package co.com.bank.jpa.model;

import co.com.bank.jpa.helper.SimpleMapper;
import co.com.bank.model.customer.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerRepositoryJPAMapper extends SimpleMapper<Customer, CustomerRepositoryJPA> {
}
