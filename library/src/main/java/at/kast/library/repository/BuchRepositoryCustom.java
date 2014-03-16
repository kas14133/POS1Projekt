package at.kast.library.repository;

import java.util.List;

import at.kast.library.domain.Buch;

public interface BuchRepositoryCustom {

    List<Buch> findWithQueryDsl(String building);

    List<Buch> findWithJqlQuery(String building);

    List<Buch> findWithCriteriaApi(String building);
}
