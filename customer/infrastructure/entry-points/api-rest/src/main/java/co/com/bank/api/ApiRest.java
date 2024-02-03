package co.com.bank.api;
import co.com.bank.api.models.CustomerResponse;
import co.com.bank.model.customer.Customer;
import co.com.bank.model.customer.exception.CustomerNotFound;
import co.com.bank.usecase.customer.CustomerUseCase;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/customer", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final CustomerUseCase customerUseCase;

    @GetMapping(value = "/{id}")
    public ResponseEntity<CustomerResponse> getCustomer(@PathVariable("id") Long id) {
        try {
            Customer customer = customerUseCase.findById(id);
            CustomerResponse customerResponse = CustomerResponse.builder().id(customer.getId())
                    .identification(customer.getIdentification()).name(customer.getName()).gender(customer.getGender())
                    .age(customer.getAge()).phone(customer.getPhone()).build();
            return new ResponseEntity<CustomerResponse>(customerResponse,
                    HttpStatus.OK);
        }catch (CustomerNotFound e){
            return new ResponseEntity<CustomerResponse>(HttpStatus.NOT_FOUND);
        }
    }
}
