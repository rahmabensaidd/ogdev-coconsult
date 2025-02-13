package tn.esprit.examen.OGDevs_CoConsult.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.OGDevs_CoConsult.entities.Document;

import java.util.UUID;

public interface DocumentRepository extends JpaRepository<Document, UUID>{

}
