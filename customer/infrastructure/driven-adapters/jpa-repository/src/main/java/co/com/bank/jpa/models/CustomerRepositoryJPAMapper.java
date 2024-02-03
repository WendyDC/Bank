package co.com.bank.jpa.models;

import co.com.bank.model.customer.Customer;
import co.com.bank.jpa.helper.SimpleMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerRepositoryJPAMapper extends SimpleMapper<Customer, CustomerRepositoryJPA> {
}
