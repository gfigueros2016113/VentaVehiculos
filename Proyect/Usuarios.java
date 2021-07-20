package org.figueros.clase;
import org.figueros.controlador.ObtenerTexto;
public class Usuarios{
	int id;
	String nombreUsuario;
	String clave;
	String rol;
	public Usuarios(int id, String nombreUsuario, String clave, String rol){
		this.nombreUsuario=nombreUsuario;
		this.clave=clave;
		this.rol=rol;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setNombreUsuario(String nombreUsuario){
		this.nombreUsuario=nombreUsuario;
	}
	public void setClave(String clave){
		this.clave=clave;
	}
	public void setRol(String rol){
		this.rol=rol;
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
	public void setCreadorUsuario(int id, String nombreUsuario, String clave, String rol){
		this.id=id;
		this.nombreUsuario=nombreUsuario;
		this.clave=clave;
		this.rol=rol;
	}
	public String getCreadorUsuario(){
		return "id: "+id+"  nombre: "+nombreUsuario+" clave: "+clave+" rol: "+rol;
	}
}