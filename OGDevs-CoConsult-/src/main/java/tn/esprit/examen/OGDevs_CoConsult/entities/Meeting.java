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
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID meetingid;
    private String meetingStatus;
    private LocalDate meetingDate;
    @OneToMany (mappedBy = "meeting")
    Set<User>users;

}
