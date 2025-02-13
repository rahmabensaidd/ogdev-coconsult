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
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID trainingId;
    private String trainingName;
    private LocalDate scheduledDate;
    // private TicketStatus ticketstatus;
    private  int duration;
    private int completionRate;
    @ManyToMany
    Set<User> trainedEmployees;
    @OneToMany (mappedBy = "training")
    Set<Evaluation> evaluations;


}
