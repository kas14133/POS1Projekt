package at.kast.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import at.kast.library.domain.Buch;


@Repository
public interface BuchRepository extends CrudRepository<Buch, Long> {
	Buch findByName(String name);
}
