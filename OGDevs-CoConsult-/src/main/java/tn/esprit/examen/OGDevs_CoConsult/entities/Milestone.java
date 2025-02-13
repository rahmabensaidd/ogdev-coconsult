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
public class Milestone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idMilestone;
    private String milestone_name;
    private int  duration_hours;
      @OneToOne (mappedBy = "milestone")
       Phase phase ;
}
