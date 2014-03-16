package at.kast.library.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.mysema.query.jpa.impl.JPAQuery;


import at.kast.library.domain.Buch;
import at.kast.library.repository.BuchRepositoryCustom;

public class BuchRepositoryImpl implements BuchRepositoryCustom{

	 @PersistenceContext
	    EntityManager entityManager;

	    @Override
	    public List<Buch> findWithQueryDsl(String building) {
	        JPAQuery query = new JPAQuery(entityManager);
	        QBuch buch = QBuch.buch;

	        query.from(buch).
	                where(buch.building.eq(building)).
	                orderBy(buch.name.asc());

	        return query.list(buch);
	    }

	    @Override
	    public List<Buch> findWithJqlQuery(String building) {
	        return entityManager.
	                createQuery("from Buch where building = :building", Buch.class).
	                setParameter("building", building).
	                getResultList();
	    }

	    @Override
	    public List<Buch> findWithCriteriaApi(String building) {
	        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
	        CriteriaQuery<Buch> query = builder.createQuery(Buch.class);
	        Root<Buch> buch = query.from(Buch.class);
	        Predicate buildingPredicate = builder.equal(buch.get("building"), building);
	        query.where(buildingPredicate);

	        return entityManager.
	                createQuery(query.select(buch)).
	                getResultList();
	    }
}
