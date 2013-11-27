package at.kast.library.repositoryjpa;

import java.util.List;

import at.kast.library.domain.Buch;


public class BuchJpaRepository extends AbstractJpaRepository<Buch>{

	@Override
	public List<Buch> findAll() {
		// TODO Auto-generated method stub
		return entityManager().createQuery("SELECT b FROM Buch b", Buch.class).getResultList();
	}

	@Override
	public Buch findById(Long id) {
		// TODO Auto-generated method stub
		return entityManager().find(Buch.class, id);
	}

}
