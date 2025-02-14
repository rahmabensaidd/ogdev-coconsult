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
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProjet;
    private String name;
    private String description;
    private LocalDate start_Date;
    private LocalDate expected_endDate;

    @ManyToMany
    Set<Process> processes;
    @OneToMany(mappedBy = "project")
    Set<Phase>phases;

    @OneToMany(mappedBy = "project")
    Set<Prototype>prototypes;

    @ManyToMany (mappedBy = "projects")
    Set<Resource>resources;
    @ManyToMany
    Set<User>users;


}
