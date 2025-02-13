package tn.esprit.examen.OGDevs_CoConsult.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Prototype {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID prototype_id;

    private String prototype_type;

   @ManyToOne
    Project project ;
   @ManyToOne
    PrototypeCompliance prototypeCompliance;
}
