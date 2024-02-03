package co.com.bank.model.account;
import co.com.bank.model.customer.Customer;
import co.com.bank.model.product.Product;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Account {
        private long id;
        private long amount;
        private String status;
        private Customer customer;
        private Product product;
}
