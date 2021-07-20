package org.figueros.clase;
import org.figueros.controlador.ObtenerTexto;
public class Administrador{
	String nombreUsuario;
	String clave;
	String rol;
	public Administrador(){
		nombreUsuario="Admin";
		clave="admin";
		rol="admin";
	}
	public String getNombreUsuario(){
		return nombreUsuario;
	}
	public String getClave(){
		return clave;
	}
	public String getRol(){
		return rol;
	}
}