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
public class Data implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    //private DataType datatype;
    private String conten;
    private LocalDate regestrationDate;
    @ManyToOne
    Task task;



    /*
    @OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
    Subscription subscription;
    @OneToMany (mappedBy = "skier")
    Set<Registration> registrations;
    @ManyToMany (mappedBy ="skiers")
    Set<Piste>pistes;*/
}