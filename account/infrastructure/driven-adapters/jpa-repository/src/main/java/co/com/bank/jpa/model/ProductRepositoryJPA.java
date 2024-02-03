package co.com.bank.jpa.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "product")
@Builder(toBuilder = true)
public class ProductRepositoryJPA {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "description")
        private String description;

        @Column(name = "type")
        private String type;
}
