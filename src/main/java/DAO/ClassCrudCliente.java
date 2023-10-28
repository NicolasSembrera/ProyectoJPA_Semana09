package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Interfaces.Iclienteable;
import model.TblCliente;

public class ClassCrudCliente implements Iclienteable{

	public void RegistrarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		EntityManagerFactory emaf = Persistence.createEntityManagerFactory("ProyectoLPSabado");
		EntityManager ema = emaf.createEntityManager();
		
		ema.getTransaction().begin();
		//registramos
		ema.persist(cliente);
		//Confirmamos
		ema.getTransaction().commit();
		//Cerramos
		ema.close();
		
	}

	public void ActualizarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}

	public void EliminarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}

	public List<TblCliente> ListadoCliente() {
		EntityManagerFactory emaf = Persistence.createEntityManagerFactory("ProyectoLPSabado");
		EntityManager ema = emaf.createEntityManager();
		
		//Iniciamos transacción
		ema.getTransaction().begin();
		
		//Hacemos el Listado
		List<TblCliente> listar =  ema.createQuery("Select c from TblCliente c", TblCliente.class).getResultList();
		
		ema.getTransaction().commit();
		ema.close();
		 
		return listar;
	}

	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
