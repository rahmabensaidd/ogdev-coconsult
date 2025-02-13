package tn.esprit.examen.OGDevs_CoConsult.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class ProductSpecification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProductSpecification;
    @ElementCollection
    private List<String> specifications = new ArrayList<>();
   @OneToMany(mappedBy = "productSpecification")
    Set<PrototypeCompliance>prototypeCompliances;
}
