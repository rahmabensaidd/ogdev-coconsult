package tn.esprit.examen.OGDevs_CoConsult.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.OGDevs_CoConsult.entities.Version;

import javax.management.relation.Role;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}
