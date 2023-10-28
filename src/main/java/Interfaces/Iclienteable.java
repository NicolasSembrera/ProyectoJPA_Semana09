package Interfaces;

import java.util.List;

import model.TblCliente;

public interface Iclienteable {
//Declaramos los métodos
	
	public void RegistrarCliente(TblCliente cliente);
	public void ActualizarCliente(TblCliente cliente);
	public void EliminarCliente(TblCliente cliente);
	public List<TblCliente> ListadoCliente();
	public TblCliente BuscarCliente(TblCliente cliente);
}
