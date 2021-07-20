package org.figueros.clase;
import org.figueros.controlador.ObtenerTexto;
public class Cliente{
	int id;
	String nombre;
	String apellido;
	int telefono;
	String direccion;
	
	public Cliente(int id, String nombre, String apellido,int telefono,String direccion){
	this.id=id;
	this.nombre=nombre;
	this.apellido=apellido;
	this.telefono=telefono;	
	this.direccion=direccion;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	} 
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	} 
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	public String getApellido(){
		return apellido;
	} 
	public void setTelefono(int telefono){
		this.telefono=telefono;
	}
	public int getTelefono(){
		return telefono;
	} 
	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	public String getDireccion(){
		return direccion;
	} 
	public void setcliente(int id, String nombre, String apellido,int telefono,String direccion){
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
		this.direccion=direccion;
	}
	public String getcliente(){
		return "id: "+id+" nombre: "+nombre+"  apellido: "+apellido+" telefono: "+telefono+" direccion: "+direccion;
	}
}