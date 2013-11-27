package at.kast.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import at.kast.library.domain.Angestellter;



@Repository
public interface AngestellterRepository extends CrudRepository<Angestellter, Long> {
	Angestellter findByName(String name);
}