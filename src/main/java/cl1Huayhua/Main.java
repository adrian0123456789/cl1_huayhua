package cl1Huayhua;

import javax.persistence.EntityManager;

import cl1Huayhua.Conn;
import cl1Huayhua.Doctore;

public class Main {

	public static void main (String[] args) {
		EntityManager em = Conn.getInstancia().getFactory().createEntityManager();
		
		Doctore doctor = new Doctore();
		doctor.setNomDoctor("Luis Vargas");
		
		em.getTransaction().begin();
		em.persist(doctor);
		em.getTransaction().commit();
		
		System.out.println("Se registro nuevo doctor");
	}
}
