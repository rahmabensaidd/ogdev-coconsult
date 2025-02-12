package tn.esprit.examen.OGDevs_CoConsult.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.OGDevs_CoConsult.entities.Rapport;

public interface RapportRepository extends JpaRepository<Rapport, Long> {
}
