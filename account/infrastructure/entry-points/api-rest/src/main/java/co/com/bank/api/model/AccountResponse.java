package co.com.bank.api.model;

import lombok.*;
import org.springframework.validation.annotation.Validated;

@Validated
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class AccountResponse {
        private long id;
        private long amount;
        private String status;
        private long idProduct;
        private String desProduct;
        private String typeProduct;
}
