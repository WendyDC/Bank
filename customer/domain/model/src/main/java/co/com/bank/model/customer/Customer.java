package co.com.bank.model.customer;
import lombok.*;
//import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
public class Customer {
	private Long id;
	private String identification;
    private String name;
    private String gender;
    private Long age;   
    private String phone;
}
