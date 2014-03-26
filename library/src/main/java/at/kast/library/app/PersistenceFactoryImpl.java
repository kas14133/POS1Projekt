package at.kast.library.app;

import java.util.HashMap;

import javax.persistence.EntityManager;


import at.kast.library.repositoryjpa.*;

public class PersistenceFactoryImpl implements PersistenceFactory {

    private final HashMap<Class<?>, JpaRepository> repositories = new HashMap<>();

    public PersistenceFactoryImpl(EntityManager entityManager) {
        PersonJpaRepository personJpaRepository = new PersonJpaRepository();
        personJpaRepository.setEntityManager(entityManager);
        repositories.put(PersonJpaRepository.class, personJpaRepository);

        AngestellterJpaRepository angestellterJpaRepository = new AngestellterJpaRepository();
        angestellterJpaRepository.setEntityManager(entityManager);
        repositories.put(AngestellterJpaRepository.class, angestellterJpaRepository);

        KundeJpaRepository kundeJpaRepository = new KundeJpaRepository();
        kundeJpaRepository.setEntityManager(entityManager);
        repositories.put(KundeJpaRepository.class, kundeJpaRepository);

        BuchJpaRepository buchJpaRepository = new BuchJpaRepository();
        buchJpaRepository.setEntityManager(entityManager);
        repositories.put(BuchJpaRepository.class, buchJpaRepository);

        VerleihJpaRepository verleihJpaRepository = new VerleihJpaRepository();
        verleihJpaRepository.setEntityManager(entityManager);
        repositories.put(VerleihJpaRepository.class, verleihJpaRepository);
    }
	@Override
	public PersonJpaRepository personJpaRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AngestellterJpaRepository angestellterJpaRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KundeJpaRepository kundeJpaRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BuchJpaRepository buchJpaRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VerleihJpaRepository verleihJpaRepository() {
		// TODO Auto-generated method stub
		return null;
	}
    }