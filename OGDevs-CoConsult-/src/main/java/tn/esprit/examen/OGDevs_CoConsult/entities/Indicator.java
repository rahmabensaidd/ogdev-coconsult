package tn.esprit.examen.OGDevs_CoConsult.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Indicator implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idIndicateur;
    private String libelle;
    private Integer frequence;
    private String Actif;

    @ManyToOne
    Objective objective;

    @OneToMany(mappedBy = "indicator")
    Set<Non_Conformity> nonConformities;
    @ManyToOne
    private Rapport rapport;
}
