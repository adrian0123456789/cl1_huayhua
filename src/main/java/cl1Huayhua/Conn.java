package cl1Huayhua;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cl1Huayhua.Conn;

public class Conn {
	private static Conn instancia = new Conn();
	private EntityManagerFactory factory;
	
	public Conn() {
		this.factory = Persistence.createEntityManagerFactory("cl1Huayhua");
	}
	
	public static  Conn getInstancia() {
		return instancia;
	}
	
	public EntityManagerFactory getFactory() {
		return factory;
	}
}
