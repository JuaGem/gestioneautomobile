package it.prova.gestioneauto.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import it.prova.gestioneauto.model.Automobile;

public interface AutomobileRepository extends PagingAndSortingRepository<Automobile, Long>, JpaSpecificationExecutor<Automobile>{

}
