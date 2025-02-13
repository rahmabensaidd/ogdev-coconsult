package tn.esprit.examen.OGDevs_CoConsult.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Non_Conformity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idNon_Conformity;
    private String source ;
    private String description;
    private LocalDate date_creation;
    private LocalDate date_resolution;

    @ManyToOne
    Indicator indicator;
}
