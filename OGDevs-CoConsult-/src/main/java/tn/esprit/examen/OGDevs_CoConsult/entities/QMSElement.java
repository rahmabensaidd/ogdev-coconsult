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
public class QMSElement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer elementId;
    private String name;
    private String description;

    @ManyToMany(mappedBy = "qmsElements")
    Set<ISOClause> isoClauses;
}
