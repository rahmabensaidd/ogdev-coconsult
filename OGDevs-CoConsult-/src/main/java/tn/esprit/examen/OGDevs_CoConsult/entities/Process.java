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
public class Process implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String procName;
    private LocalDate creationDate;
    private LocalDate modifDate;
    @OneToMany (mappedBy = "process")
    Set<Operation>operations;
    @OneToOne
    Conversation conversation;
    @OneToMany(mappedBy = "process")
    Set<Objective> objectives;

    @ManyToOne
    Projet projet;
}