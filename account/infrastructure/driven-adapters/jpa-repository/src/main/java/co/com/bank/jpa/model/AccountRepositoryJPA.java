package co.com.bank.jpa.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "account")
@Builder(toBuilder = true)
public class AccountRepositoryJPA {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name = "amount")
        private long amount;

        @Column(name = "status")
        private String status;

        @ManyToOne
        @JoinColumn(name = "id_customer")
        private CustomerRepositoryJPA customer;

        @ManyToOne
        @JoinColumn(name = "id_product")
        private ProductRepositoryJPA product;
}
