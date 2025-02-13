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
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idTicket;
    private String name;
    private String ticketdiscription;
    private LocalDate creationDatete;
// private TicketStatus ticketstatus;
    @ManyToOne
    User client;

}
