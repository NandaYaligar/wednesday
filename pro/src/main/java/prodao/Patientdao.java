package prodao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import prodto.Patientdto;

public class Patientdao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insert(Patientdto patientdto) {
		entityTransaction.begin();
		entityManager.persist(patientdto);
		entityTransaction.commit();
		
	}
	
	public void update(int id, String blood_grp) {
		Patientdto patientdto=entityManager.find(Patientdto.class,id);
		patientdto.setBlood_grp(blood_grp);
		
		entityTransaction.begin();
		entityManager.merge(patientdto);
		entityTransaction.commit();
	}
	
	public void remove(int id) {
		Patientdto patientdto=entityManager.find(Patientdto.class,id);
		entityTransaction.begin();
		entityManager.remove(patientdto);
		entityTransaction.commit();
	}
	}


