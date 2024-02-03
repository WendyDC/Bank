package co.com.bank.api.models;

import lombok.*;
import org.springframework.validation.annotation.Validated;

@Validated
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class CustomerResponse {
        private Long id;
        private String identification;
        private String name;
        private String gender;
        private Long age;
        private String phone;
}
