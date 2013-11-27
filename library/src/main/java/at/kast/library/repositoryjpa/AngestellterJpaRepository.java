package at.kast.library.repositoryjpa;

import java.util.List;

import at.kast.library.domain.Angestellter;
import at.kast.library.domain.Person;

public class AngestellterJpaRepository extends AbstractJpaRepository<Angestellter>{

	@Override
	public List<Angestellter> findAll() {
		// TODO Auto-generated method stub
		return entityManager().createQuery("SELECT a FROM Angestellter a", Angestellter.class).getResultList();
	}

	@Override
	public Angestellter findById(Long id) {
		// TODO Auto-generated method stub
		return entityManager().find(Angestellter.class, id);
	}

}
