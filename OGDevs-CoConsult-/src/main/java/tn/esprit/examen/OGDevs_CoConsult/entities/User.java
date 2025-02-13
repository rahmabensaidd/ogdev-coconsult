package tn.esprit.examen.OGDevs_CoConsult.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.examen.OGDevs_CoConsult.entities.Document;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String username;
    private String email;
    private String password;
    private String phone;

    @OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL)
    private Set<Document> documents;

    @ManyToOne
    Meeting meeting;

    @OneToMany(mappedBy = "client")
    Set<Ticket>clientTickets;

    @ManyToMany(mappedBy = "trainedEmployees")
    Set<Training>trainings;

    @ManyToMany
    Set<Interview>interviews;

     @OneToOne
     Role role;

}
