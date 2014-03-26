package at.kast.library.repositoryjpa;

public interface PersistenceFactory {

    PersonJpaRepository personJpaRepository();

    AngestellterJpaRepository angestellterJpaRepository();

    KundeJpaRepository kundeJpaRepository();

    BuchJpaRepository buchJpaRepository();

    VerleihJpaRepository verleihJpaRepository();
}