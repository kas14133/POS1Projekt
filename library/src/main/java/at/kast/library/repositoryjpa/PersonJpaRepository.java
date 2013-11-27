package at.kast.library.repositoryjpa;

import java.util.List;

import at.kast.library.domain.Person;


public class PersonJpaRepository extends AbstractJpaRepository<Person>{

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return entityManager().createQuery("SELECT p FROM Person p", Person.class).getResultList();
	}

	@Override
	public Person findById(Long id) {
		// TODO Auto-generated method stub
		return entityManager().find(Person.class, id);
	}

}
