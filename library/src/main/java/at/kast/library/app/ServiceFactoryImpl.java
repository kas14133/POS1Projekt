package at.kast.library.app;

import java.util.HashMap;

import at.kast.library.repositoryjpa.PersistenceFactory;
import at.kast.library.service.LibraryManagementService;
import at.kast.library.service.ServiceFactory;
import at.kast.library.servicejpa.ServiceJpa;


public class ServiceFactoryImpl implements ServiceFactory {
    
	 private final HashMap<Class<?>, ServiceJpa> services = new HashMap<>();

	    private PersistenceFactory persistenceFactory;

	    public ServiceFactoryImpl(PersistenceFactory persistenceFactory) {
	        this.persistenceFactory = persistenceFactory;
	    }

	    @Override
	    public ServiceFactoryImplver timetableManagementService() {
	        TimetableManagementServiceJpa timetableManagementService = new TimetableManagementServiceJpa();
	        timetableManagementService.setTeacherJpaRepository(persistenceFactory.teacherJpaRepository());
	        timetableManagementService.setTeachingUnitJpaRepository(persistenceFactory.teachingUnitJpaRepository());
	        return timetableManagementService;
	    }
}
