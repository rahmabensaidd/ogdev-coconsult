package tn.esprit.examen.OGDevs_CoConsult.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Objective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idObjective;
    private String title ;

    @ManyToOne
    Process process;

    @OneToMany(mappedBy = "objective")
    Set<Indicator> indicators;

    @OneToMany(mappedBy = "objective")
    Set<ISOClause> isoClauses;
}
