package at.kast.library.repositoryjpa;

import java.util.List;

import at.kast.library.domain.Kunde;
import at.kast.library.domain.Person;

public class KundeJpaRepository extends AbstractJpaRepository<Kunde>{

	@Override
	public List<Kunde> findAll() {
		// TODO Auto-generated method stub
		return entityManager().createQuery("SELECT k FROM Kunde k", Kunde.class).getResultList();
	}

	@Override
	public Kunde findById(Long id) {
		// TODO Auto-generated method stub
		return entityManager().find(Kunde.class, id);
	}

}
