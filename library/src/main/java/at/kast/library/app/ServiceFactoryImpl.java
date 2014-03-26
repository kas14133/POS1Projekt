package at.kast.library.app;

import java.util.HashMap;

import at.kast.library.repositoryjpa.PersistenceFactory;
import at.kast.library.service.LibraryManagementService;
import at.kast.library.servicejpa.LibraryManagementServiceJpa;
import at.kast.library.servicejpa.ServiceJpa;
import at.kast.library.servicejpa.ServiceJpaFactory;


public class ServiceFactoryImpl implements ServiceJpaFactory {
    
	 private final HashMap<Class<?>, ServiceJpa> services = new HashMap<>();

	 private PersistenceFactory persistenceFactory;

	    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
	        this.persistenceFactory = persistenceFactory;
	    }


		@Override
		public LibraryManagementServiceJpa verleihService() {
			LibraryManagementServiceJpa libraryManagementService = new LibraryManagementServiceJpa();
	        libraryManagementService.setPersonJpaRepository(persistenceFactory.personJpaRepository());
	        libraryManagementService.setVerleihJpaRepository(persistenceFactory.verleihJpaRepository());
	        return libraryManagementService;
		}


}
