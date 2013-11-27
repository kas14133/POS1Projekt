package at.kast.library.app;

import at.kast.library.repositoryjpa.PersistenceFactory;
import at.kast.library.service.LibraryManagementService;
import at.kast.library.service.ServiceFactory;


public class ServiceFactoryImpl implements ServiceFactory {
    private PersistenceFactory persistenceFactory;

    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
        this.persistenceFactory = persistenceFactory;
    }

	@Override
	public LibraryManagementService timetableManagementService() {
		// TODO Auto-generated method stub
		return new LibraryManagementService();
	}
}
