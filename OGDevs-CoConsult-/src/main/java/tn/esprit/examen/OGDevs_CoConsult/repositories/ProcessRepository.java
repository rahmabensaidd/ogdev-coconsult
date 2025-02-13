package tn.esprit.examen.OGDevs_CoConsult.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.OGDevs_CoConsult.entities.Process;

import java.util.UUID;

public interface ProcessRepository extends JpaRepository<Process, UUID>{

}

