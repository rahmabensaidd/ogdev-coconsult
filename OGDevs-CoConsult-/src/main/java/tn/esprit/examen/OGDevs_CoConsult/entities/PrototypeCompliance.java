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
public class PrototypeCompliance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID prototypeCompliance_id;
    private String name;
    private boolean approoved;

    @OneToMany(mappedBy = "prototypeCompliance")
    Set<Prototype>prototypes;
    @OneToMany(mappedBy = "prototypeCompliance")
    Set<Feedback>feedbacks;
    @ManyToOne
    ProductSpecification productSpecification;
}
