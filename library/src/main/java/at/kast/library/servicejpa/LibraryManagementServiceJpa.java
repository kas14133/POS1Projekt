package at.kast.library.servicejpa;

import java.util.Date;

import at.kast.library.domain.Person;
import at.kast.library.repositoryjpa.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibraryManagementServiceJpa implements ServiceJpa {

    @Autowired
    private PersonJpaRepository personJpaRepository;

    @Autowired
    private VerleihJpaRepository verleihJpaRepository;

    public void createNewTeacher(String name, int alter, String addresse, String email) {
        // start transaction
        // write audit log
        Person person = new Person(name,alter,addresse,email);
        personJpaRepository.persist(person);
        // end (commit) transaction
    }

    public void setPersonJpaRepository(PersonJpaRepository personJpaRepository) {
        this.personJpaRepository = personJpaRepository;
    }

    public void setVerleihJpaRepository(VerleihJpaRepository verleihJpaRepository) {
        this.verleihJpaRepository = verleihJpaRepository;
    }
}
