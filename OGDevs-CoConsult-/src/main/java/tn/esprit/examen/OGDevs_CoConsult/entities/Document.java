package tn.esprit.examen.OGDevs_CoConsult.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.*;
import lombok.experimental.FieldDefaults;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Document  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private LocalDate dateCreation;

    @Enumerated(EnumType.STRING)
    private TypeDocument typeDocument;

    @Enumerated(EnumType.STRING)
    private StatutDocument statut;

    @ManyToOne

    private User createdBy;

    @OneToMany(mappedBy = "document", cascade = CascadeType.ALL)
    private List<Version> versions;
}
