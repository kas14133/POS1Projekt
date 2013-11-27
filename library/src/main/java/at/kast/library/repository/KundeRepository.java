package at.kast.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import at.kast.library.domain.Kunde;
import at.kast.library.domain.Verleih;

@Repository
public interface KundeRepository extends CrudRepository<Kunde, Long> {
	Kunde findByName(String name);
}
