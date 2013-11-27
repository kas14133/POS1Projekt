package at.kast.library.repositoryjpa;

import java.util.List;


import at.kast.library.domain.Verleih;

public class VerleihJpaRepository extends AbstractJpaRepository<Verleih>{

	@Override
	public List<Verleih> findAll() {
		// TODO Auto-generated method stub
		return entityManager().createQuery("SELECT v FROM Verleih v", Verleih.class).getResultList();
	}

	@Override
	public Verleih findById(Long id) {
		// TODO Auto-generated method stub
		return entityManager().find(Verleih.class, id);
	}

}
