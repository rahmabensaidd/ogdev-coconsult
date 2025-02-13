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
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEvaluation;

    private LocalDate evalution_date;
    private double performanceScore;
    private String comment ;
    @ManyToOne
 Training training;
}
