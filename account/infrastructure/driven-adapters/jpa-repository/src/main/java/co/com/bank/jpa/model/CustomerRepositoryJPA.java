package co.com.bank.jpa.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
@Builder(toBuilder = true)
public class CustomerRepositoryJPA {

        @Id
	    private Long id;

        @Column(name = "identification")
	    private String identification;

        @Column(name = "name")
        private String name;

        @Column(name = "gender")
        private String gender;

        @Column(name = "age")
        private Long age;

        @Column(name = "phone")
        private String phone;
}
