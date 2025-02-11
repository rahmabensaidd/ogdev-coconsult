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
public class Indicator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIndicateur;
    private String libelle;
    private Integer frequence;
    private String Actif;

    @ManyToOne
    Objective objective;

    @OneToMany(mappedBy = "indicator")
    Set<Non_Conformity> nonConformities;
}
