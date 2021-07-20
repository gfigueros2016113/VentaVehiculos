package org.figueros.clase;
import org.figueros.controlador.ObtenerTexto;
public class Vehiculo{
int id;
String marca;
String modelo;
String placas;
String fecha;
	public Vehiculo(int id, String marca, String modelo, String placas, String fecha){
		this.id=id;
		this.marca=marca;
		this.modelo=modelo;
		this.placas=placas;
		this.fecha=fecha;
	}
	public void setId(int id){
		this.id=id;
	}
	public int setId(){
		return id;
	}
	public void setMarca(String marca){
		this.marca=marca;
	}
	public String getMarca(){
		return marca;
	}
	public void setModelo(String modelo){
		this.modelo=modelo;
	}
	public String getModelo(){
		return modelo;
	}
	public void setPlacas(String placas){
		this.placas=placas;
	}
	public String getPlacas(){
		return placas;
	}
	public void setFecha(String Fecha){
		this.fecha=fecha;
	}
	public String getFecha(){
		return fecha;
	}
	public void setCarro(int id, String marca, String modelo, String placas, String fecha){
		this.id=id;
		this.marca=marca;
		this.modelo=modelo;
		this.placas=placas;
		this.fecha=fecha;
	}
	public String getCarro(){
		return "id: "+id+" marca: "+marca+" modelo: "+modelo+"  placas: "+placas+" fecha: "+fecha;
	}
}