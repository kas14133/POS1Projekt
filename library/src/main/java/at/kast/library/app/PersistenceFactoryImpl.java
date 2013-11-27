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
	public PersonJpaRepository personRepository() {
		// TODO Auto-generated method stub
        return (PersonJpaRepository)repositories.get(PersonJpaRepository.class);
	}

	@Override
	public AngestellterJpaRepository angestellterRepository() {
		// TODO Auto-generated method stub
        return (AngestellterJpaRepository)repositories.get(AngestellterJpaRepository.class);
	}

	@Override
	public KundeJpaRepository kundeRepository() {
		// TODO Auto-generated method stub
        return (KundeJpaRepository)repositories.get(KundeJpaRepository.class);
	}

	@Override
	public BuchJpaRepository buchRepository() {
		// TODO Auto-generated method stub
        return (BuchJpaRepository)repositories.get(BuchJpaRepository.class);
	}

	@Override
	public VerleihJpaRepository subjectRepository() {
		// TODO Auto-generated method stub
        return (VerleihJpaRepository)repositories.get(VerleihJpaRepository.class);
	}
    }