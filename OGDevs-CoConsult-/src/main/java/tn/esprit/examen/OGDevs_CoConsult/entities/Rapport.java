package tn.esprit.examen.OGDevs_CoConsult.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.*;
import lombok.experimental.FieldDefaults;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Rapport  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String title;
    private String content;
    private LocalDate dateCreation;
    private String createdBy;
    private String impactLevel; // Faible, Moyen, Élevé

    @Enumerated(EnumType.STRING)
    private StatutDocument statut;

    @OneToMany(mappedBy = "rapport")
    private List<Indicator> indicators;

    private Double performanceScore; // Score global des indicateurs
    private Double tauxConformite; // % de conformité aux normes ISO
    private String tendances; // Analyse de tendances en texte
}
