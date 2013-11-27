package at.kast.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import at.kast.library.domain.Person;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
	Person findByName(String name);
}
