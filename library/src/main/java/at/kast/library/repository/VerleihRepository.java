package at.kast.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import at.kast.library.domain.Verleih;

@Repository
public interface VerleihRepository extends CrudRepository<Verleih, Long> {
	Verleih findByName(String name);
}
