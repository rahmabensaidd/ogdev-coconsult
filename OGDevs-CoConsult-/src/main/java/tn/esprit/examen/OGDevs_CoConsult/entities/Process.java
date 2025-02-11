package tn.esprit.examen.OGDevs_CoConsult.entities;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Process implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    private String procName;
    private LocalDate creationDate;
    private LocalDate modifDate;
    @OneToMany (mappedBy = "process")
    Set<Operation>operations;
    @OneToOne
    Conversation conversation;


    /*
    @OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    Subscription subscription;
    @OneToMany (mappedBy = "skier")
    Set<Registration> registrations;
    @ManyToMany (mappedBy ="skiers")
    Set<Piste>pistes;*/
}