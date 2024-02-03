package co.com.bank.model.customer;
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
public class Customer {
        private Long id;
        private String identification;
        private String name;
        private String gender;
        private Long age;
        private String phone;
}
