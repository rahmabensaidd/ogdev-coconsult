package tn.esprit.examen.OGDevs_CoConsult.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Version  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long numeroVersion;
    private LocalDate dateCreation;
    private String contenu;
    private String modifiePar;
    private String modificationDetails;
    @ManyToOne
    private Document document;
    @Enumerated(EnumType.STRING)
    private StatutDocument statut;
}

