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
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    private String taskDescription;
    private String taskStatus;
    @OneToMany (mappedBy = "task")
    Set<Data>dataSet;
    @ManyToOne
    Operation operation;


    /*
    @OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    Subscription subscription;
    @OneToMany (mappedBy = "skier")
    Set<Registration> registrations;
    @ManyToMany (mappedBy ="skiers")
    Set<Piste>pistes;*/
}