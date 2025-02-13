package tn.esprit.examen.OGDevs_CoConsult.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.OGDevs_CoConsult.entities.Version;

import java.util.UUID;

public interface VersionRepository extends JpaRepository<Version, UUID> {
}
