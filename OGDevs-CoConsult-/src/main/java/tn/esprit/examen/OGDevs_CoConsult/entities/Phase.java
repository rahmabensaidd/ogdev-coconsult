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
public class Phase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idPhase;
    private String phase_name;
    private String description;
    private LocalDate start_Date;
    private LocalDate end_Date;

    @ManyToOne
    Project project;
    @ManyToMany
    Set<Bug>bugs;
    @OneToOne
    Milestone milestone;
}
