package tn.esprit.examen.OGDevs_CoConsult.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.OGDevs_CoConsult.entities.Report;

import java.util.UUID;

public interface RapportRepository extends JpaRepository<Report, UUID> {
}
