package tn.esprit.examen.OGDevs_CoConsult.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.OGDevs_CoConsult.entities.Indicator;

import java.util.UUID;

public interface IndicatorRepository extends JpaRepository<Indicator, UUID> {
}
