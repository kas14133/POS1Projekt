package at.kast.library.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.kast.library.domain.Buch;
import at.kast.library.domain.Person;
import at.kast.library.repositoryjpa.BuchJpaRepository;
import at.kast.library.repositoryjpa.PersonJpaRepository;


@Service
public class LibraryManagementService {
    @Autowired
	private PersonJpaRepository personJpaRepository;

	public void createNewPerson(String name, int alter, String addresse, String email) {
		// start transaction
		// write audit log
		Person person = new Person(name,alter,addresse,email);
		personJpaRepository.persist(person);
		// end (commit) transaction
	}
}
