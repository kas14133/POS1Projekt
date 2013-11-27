package at.kast.library.repositoryjpa;

public interface PersistenceFactory {

    PersonJpaRepository personRepository();

    AngestellterJpaRepository angestellterRepository();

    KundeJpaRepository kundeRepository();

    BuchJpaRepository buchRepository();

    VerleihJpaRepository subjectRepository();
}