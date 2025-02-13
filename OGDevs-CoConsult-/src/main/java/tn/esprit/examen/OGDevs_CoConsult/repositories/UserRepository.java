package tn.esprit.examen.OGDevs_CoConsult.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.OGDevs_CoConsult.entities.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
