package co.com.bank.jpa.model;

import co.com.bank.jpa.helper.SimpleMapper;
import co.com.bank.model.account.Account;
import co.com.bank.model.product.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductRepositoryJPAMapper extends SimpleMapper<Product, ProductRepositoryJPA> {
}
