package tn.esprit.examen.OGDevs_CoConsult.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class ISOClause {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idClause;
    private String name;
    private String description;

    @ManyToOne
    Objective objective;

    @ManyToOne
    ComplianceRecord complianceRecord;

    @ManyToMany
    Set<QMSElement> qmsElements;
}
