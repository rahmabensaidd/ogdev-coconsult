package tn.esprit.examen.OGDevs_CoConsult.entities;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Operation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String operationName;
    private String operationDescription;
    @ManyToOne
    Process process;
    @OneToMany(mappedBy = "operation")
    Set<Task>tasks;
    @ManyToMany
    Set<Poste>postes;

    /*
    @OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    Subscription subscription;
    @OneToMany (mappedBy = "skier")
    Set<Registration> registrations;
    @ManyToMany (mappedBy ="skiers")
    Set<Piste>pistes;*/
}