package org.figueros.clase;
import org.figueros.controlador.ObtenerTexto;
public class Trabajador{
	String nombreUsuario;
	String clave;
	String rol;
	public Trabajador(){
		nombreUsuario="Trab";
		clave="trab";
		rol="trab";
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