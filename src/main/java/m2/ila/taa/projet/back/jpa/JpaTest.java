package m2.ila.taa.projet.back.jpa;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import m2.ila.taa.projet.back.model.Activite;
import m2.ila.taa.projet.back.model.Departement;
import m2.ila.taa.projet.back.model.Lieu;
import m2.ila.taa.projet.back.model.Region;
import m2.ila.taa.projet.back.model.User;


	public class JpaTest {

		private EntityManager manager;

	    public JpaTest(EntityManager manager) {
	        this.manager = manager;
	    }

		/**
		 * @param args
		 */
		public static void main(String[] args) {

			EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
			//EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
			EntityManager manager = factory.createEntityManager();

			JpaTest test = new JpaTest(manager);
			
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			try {
				test.createData();
				
				//test.createPersons();
				//test.createLieux();
				//test.createSports();
				//test.createRegions();
				//test.createDepartements();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			tx.commit();

			//test.listPersons();
			//test.listLieux();
			//test.listSports();
			//test.listRegions();
			//test.listDepartements();
			
			manager.close();
			EntityManagerHelper.closeEntityManagerFactory();
		}
		
	    private void createData() {
	    	//int numOfRegions = manager.createQuery("Select r From Region r", Region.class).getResultList().size();
	        //if (numOfRegions == 0) {
	        	
	        	Region r1 = new Region();
	        	r1.setNom("Region1");
	        	Region r2 = new Region();
	        	r2.setNom("Region2");

	        	
	        	Departement d1 = new Departement();
	        	d1.setNom("DepartementA");
	        	Departement d2 = new Departement();
	        	d2.setNom("DepartementB");
	        	Departement d3 = new Departement();
	        	d3.setNom("DepartementD");
	    	
	    	User u1 = new User();
	    	u1.setNom("Nom1");
	    	u1.setPrenom("Prenom1");
	    	u1.setLogin("login1");
	    	u1.setMotDePasse("motdepasse1");
	    	User u2 = new User();
	    	u2.setNom("Nom2");
	    	u2.setPrenom("Prenom2");
	    	u2.setLogin("login2");
	    	u2.setMotDePasse("motdepasse2");
	    	
	    	manager.persist(u1);
	    	manager.persist(u2);
//	        	
	        	Lieu l1 = new Lieu();
	        	l1.setNom("Lieu1");
	        	Lieu l2 = new Lieu();
	        	l2.setNom("Lieu2");
	        	Lieu l3 = new Lieu();
	        	l3.setNom("Lieu3");
	        	Lieu l4 = new Lieu();
	        	l4.setNom("Lieu4");
	        	Lieu l5 = new Lieu();
	        	l5.setNom("Lieu5");
	        	
	        	Activite a1 = new Activite();
	        	a1.setDesignation("Activite1");
	        	Activite a2 = new Activite();
	        	a2.setDesignation("Activite2");
	        	Activite a3 = new Activite();
	        	a3.setDesignation("Activite3");
	        	
	        	manager.persist(l1);
	        	manager.persist(l2);
	        	manager.persist(l3);
	        	manager.persist(l4);
	        	manager.persist(l5);
	        	
	        	manager.persist(a1);
	        	manager.persist(a2);
	        	manager.persist(a3);
	        	
	        	manager.persist(r1);
	        	manager.persist(r2);
	        	
	        	manager.persist(d1);
	        	manager.persist(d2);
	        	manager.persist(d3);
	        	
	        
	        	
	        	//l1.addSport(s1);
	        	//l1.addSport(s2);
	        	
	        	a1.addLieu(l1);
	        	a2.addLieu(l1);
	        	a3.addLieu(l1);
	        	a2.addLieu(l2);
	        	
	        	d1.setRegion(r1);
	        	d2.setRegion(r1);
	        	d3.setRegion(r2);
	        	
	        	l1.setDepartement(d1);
	        	l2.setDepartement(d1);
	        	l3.setDepartement(d2);
	        	l4.setDepartement(d3);
	        	l5.setDepartement(d3);
	        	
	        	u1.addActivite(a1);
	        	u1.addActivite(a2);
	        	u2.addActivite(a1);
	        	u2.addActivite(a3);
	        	
	        	u1.addLieu(l1);
	        	u1.addLieu(l2);
	        	u1.addLieu(l3);
	        	u1.addLieu(l4);
	        	u2.addLieu(l3);
	        	u2.addLieu(l4);
	        	u2.addLieu(l5);
	        	
	        	//r1.addDepartement(d1);
	        	//r1.addDepartement(d2);
	        	//r2.addDepartement(d3);
	        	//manager.merge(r1);
	        	//manager.merge(r2);
	        	
	        	//l1.addSport(s2);
	        	/*manager.merge(l1);
	        	*/
//	        	d1.setRegion(r3);
//	        	d2.setRegion(r3);
//	        	d3.setRegion(r3);
//	        	r3.addDepartement(d1);
//	        	r3.addDepartement(d2);
//	        	r3.addDepartement(d3);
//	        	
//	        	l1.setDepartement(d1);
//	        	l2.setDepartement(d1);
//	        	l3.setDepartement(d3);
//	        	d1.addLieu(l1);
//	        	d1.addLieu(l2);
//	        	d3.addLieu(l3);
//	        	
//	        	//manager.persist(s1);
//	        	manager.persist(s2);
//	        	manager.persist(s3);
//	        	
//	        	manager.persist(r1);
//	        	manager.persist(r2);
//	        	manager.persist(r3);
	        	
	        //} 
	    }


		private void createPersons() {
	        int numOfPersons = manager.createQuery("Select a From Person a", User.class).getResultList().size();

	        if (numOfPersons == 0) {
//	        	User p1 = new User();
//	        	p1.setName("Nom1");
//	        	p1.setFirstname("Prénom1");
//	        	manager.persist(p1);
//	        	Person p2 = new Person();
//	        	p2.setName("Nom2");
//	        	p2.setFirstname("Prénom2");
//	        	manager.persist(p2);
//	        	Person p3 = new Person();
//	        	p3.setName("Nom3");
//	        	p3.setFirstname("Prénom3");
//	        	manager.persist(p3);
	        }
	    }

	    private void listPersons() {
//	        List<Person> resultList = manager.createQuery("Select a From Person a", Person.class).getResultList();
//	        System.out.println("num of persons:" + resultList.size());
//	        for (Person next : resultList) {
//	        	System.out.println("next employee: " + next);
//	        }
	    }
	    
		private void createLieux() {
	        int numOfLieux = manager.createQuery("Select a From Lieu a", Lieu.class).getResultList().size();
	        if (numOfLieux == 0) {
	        	Lieu l1 = new Lieu();
	        	l1.setNom("Lieu1");
	        	manager.persist(l1);
	        	Lieu l2 = new Lieu();
	        	l2.setNom("Lieu2");
	        	manager.persist(l2);
	        	Lieu l3 = new Lieu();
	        	l3.setNom("Lieu3");
	        	manager.persist(l3);
	        }
	    }

	    private void listLieux() {
	        List<Lieu> resultList = manager.createQuery("Select a From Lieu a", Lieu.class).getResultList();
	        System.out.println("num of lieux:" + resultList.size());
	        for (Lieu next : resultList) {	            System.out.println("next lieu: " + next);
	        }
	    }
	    
		private void createSports() {
//	        int numOfSports = manager.createQuery("Select a From Sport a", Sport.class).getResultList().size();
//	        if (numOfSports == 0) {
//	        	Sport s1 = new Sport();
//	        	s1.setNom("Sport1");
//	        	manager.persist(s1);
//	        	Sport s2 = new Sport();
//	        	s2.setNom("Sport2");
//	        	manager.persist(s2);
//	        	Sport s3 = new Sport();
//	        	s3.setNom("Sport3");
//	        	manager.persist(s3);
//	        }
	    }
		
	    private void listSports() {
//	        List<Sport> resultList = manager.createQuery("Select a From Sport a", Sport.class).getResultList();
//	        System.out.println("num of sports:" + resultList.size());
//	        for (Sport next : resultList) {	            System.out.println("next sport: " + next);
//	        }
	    }
	    
	    private void createRegions() {
	    	int numOfRegions = manager.createQuery("Select r From Region r", Region.class).getResultList().size();
	        if (numOfRegions == 0) {
	        	Region r1 = new Region();
	        	r1.setNom("Region1");
	        	Region r2 = new Region();
	        	r2.setNom("Region2");
	        	Region r3 = new Region();
	        	r3.setNom("Region3");
	        	
	        	manager.persist(r1);
	        	manager.persist(r2);
	        	manager.persist(r3);
	        } 
	    }
	    
	    private void listRegions() {
	        List<Region> resultList = manager.createQuery("Select r From Region r", Region.class).getResultList();
	        System.out.println("num of regions:" + resultList.size());
	        for (Region next : resultList) {
	        	System.out.println("next region: " + next);
	        }
	    }
	    
	    private void createDepartements() {
	    	int numOfDepartements = manager.createQuery("Select d From Departement d", Departement.class).getResultList().size();
	        if (numOfDepartements == 0) {
	        	Departement d1 = new Departement();
	        	d1.setNom("Departement1");
	        	manager.persist(d1);
	        	Departement d2 = new Departement();
	        	d2.setNom("Departement2");
	        	manager.persist(d2);
	        	Departement d3 = new Departement();
	        	d3.setNom("Departement3");
	        	manager.persist(d3);
	        } 
	    }
	    
	    private void listDepartements() {
	        List<Departement> resultList = manager.createQuery("Select d From Departement d", Departement.class).getResultList();
	        System.out.println("num of departements:" + resultList.size());
	        for (Departement next : resultList) {
	        	System.out.println("next region: " + next);
	        }
	    }
	    
	}
