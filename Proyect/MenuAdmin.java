package org.figueros.vista;
import org.figueros.controlador.ObtenerTexto;
import org.figueros.clase.Cliente;
import org.figueros.clase.Trabajador;
import org.figueros.clase.Vehiculo;
import org.figueros.clase.Administrador;
import org.figueros.clase.Usuarios;
import org.figueros.clase.Login;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class MenuAdmin{
	ArrayList<Cliente> arregloCliente =new ArrayList<Cliente>();
	ArrayList<Vehiculo> arregloVehiculo=new ArrayList<Vehiculo>();
	ArrayList<Usuarios> arregloUsuario=new ArrayList<Usuarios>(); 
	ObtenerTexto oT=new ObtenerTexto();
	int dato;
	int contador;
	int optiones;
	int option;
	int opci;
	int id;
	int telefono;
	int nuevotelefono;
		String marca;
		String modelo;
		String placas;
		String fecha;
		String nuevomarca;
		String nuevomodelo;
		String nuevaplacas;
		String nuevafecha;
		String usuario;
		String clave;
		String rol;
		String nuevousuario;
		String nuevaclave;
		String nuevorol;
		String respuesta1;
		String respuesta2;
		String respuesta3;
		String respuesta4;
		String nombre;
		String apellido;
		String direccion;
		String nuevonombre;
		String nuevoapellido;
		String nuevadireccion;
	public void MenuAdmin(String u) throws IOException{
		do{
			System.out.println("");
			System.out.println("----------Menu de Administrador----------");
			System.out.println("1 - Cliente");
			System.out.println("2 - Vehiculo");
			System.out.println("3 - Usuario");
			System.out.println("4 - Cerrar Sesion");
			System.out.println("-----------------------------------------");
			System.out.println("ingrese su opcion");
			optiones=oT.textoEntero();
	switch(optiones){
	case 1:
		do{
		System.out.println("-------------MENU CLIENTE-------------");
		System.out.println("1 - Ingresar");
		System.out.println("2 - Modificar");
		System.out.println("3 - Eliminiar");
		System.out.println("4 - Reporte");
		System.out.println("5 - Volver");
		System.out.println("--------------------------------------");
		System.out.println("ingrese su opcion");
		option=oT.textoEntero();
		switch(option){
			case 1:
				do{
				System.out.println("ingrese el nombre");
				nombre=oT.texto();
				System.out.println("ingrese el apellido");
				apellido=oT.texto();
				System.out.println("ingrese el telefono");
				telefono=oT.textoEntero();
				System.out.println("ingrese la direccion");
				direccion=oT.texto();
				arregloCliente.add(new Cliente(id,nombre,apellido,telefono,direccion));
				id++;
				System.out.println("desea ingresar otro cliente");
				respuesta3=oT.texto();
				}while(respuesta3.equals("si"));
			break;
			
			case 2:
				do{
				System.out.println("ingrese el id del cliente que desea modificar");
				dato=oT.textoEntero();
				for(Cliente variable: arregloCliente){
					if(contador==dato){
						System.out.println(variable.getcliente());
						System.out.println("--------------------------------------");
						System.out.println("----------Que desea Modificar---------");
						System.out.println("1 - Nombre");
						System.out.println("2 - Apellido");
						System.out.println("3 - Telefono");
						System.out.println("4 - Direccion");
						System.out.println("--------------------------------------");
						System.out.println("ingrese su opcion");
						opci=oT.textoEntero();
						switch(opci){
							case 1:
								System.out.println("ingrese el nuevo nombre");
								nuevonombre=oT.texto();
								variable.setNombre(nuevonombre);
								System.out.println(variable.getcliente());
							break;
							case 2:
								System.out.println("ingrese el nuevo apellido");
								nuevoapellido=oT.texto();
								variable.setApellido(nuevoapellido);
								System.out.println(variable.getcliente());
							break;
							case 3:
								System.out.println("ingrese el nuevo telefono");
								nuevotelefono=oT.textoEntero();
								variable.setTelefono(nuevotelefono);
								System.out.println(variable.getcliente());
							break;
							case 4:
								System.out.println("ingrese la nueva direccion");
								nuevadireccion=oT.texto();
								variable.setDireccion(nuevadireccion);
								System.out.println(variable.getcliente());
							break;
						}
					}
				contador++;
				}
				if(contador>arregloCliente.size()){
					System.out.println("el cliente no se encuentra en el sistema");
				}
				System.out.println("desea realizar otro cambio");
				respuesta3=oT.texto();
				}while(respuesta3.equals("si"));
			break;
			
			case 3:
				do{
				System.out.println("ingresa el id del usuario que desea eliminar");
				dato=oT.textoEntero();
				arregloCliente.remove(dato);
				System.out.println("Se Elimino ese Cliente");
				System.out.println("desea eliminar otro cliente");
				respuesta3=oT.texto();
				}while(respuesta3.equals("si"));			
			break;
			
			case 4:
				do{
					System.out.println("--------------------------------------");
					System.out.println("---------------REPORTES---------------");
					System.out.println("1 - Reporte General");
					System.out.println("2 - Reporte de Cliente");
					System.out.println("3 - Volver");
					System.out.println("--------------------------------------");
					System.out.println("ingrese su opcion");
				opci=oT.textoEntero();
				switch(opci){
					case 1:
						for(Cliente variable: arregloCliente){
						System.out.println("--------------------------------------");
						System.out.println(variable.getcliente());
						}
						System.out.println("desea imprimir este reporte");
						respuesta4=oT.texto();
						if(respuesta4.equals("si")){
						String ruta="c:/Proyect/reporteproyecto.txt";
						File archivo=new File(ruta);
						BufferedWriter bw;
						bw=new BufferedWriter(new FileWriter(archivo));
						for(Cliente variable: arregloCliente){
						bw.write("------");
						bw.write(variable.getcliente());
						}
						bw.close();
						}
					break;
					case 2:
						System.out.println("ingresa el id del usuario que desea ver");
						dato=oT.textoEntero();
						for(Cliente variable: arregloCliente){
						if(contador==dato){
						System.out.println(variable.getcliente());
						
						System.out.println("desea imprimir este reporte");
						respuesta4=oT.texto();
						if(respuesta4.equals("si")){
						String ruta="c:/Proyect/reporteproyecto.txt";
						File archivo=new File(ruta);
						BufferedWriter bw;
						bw=new BufferedWriter(new FileWriter(archivo));
						bw.write("------");
						bw.write(variable.getcliente());
						bw.close();
						}
						}
						contador++;
						}
						if(contador>arregloCliente.size()){
						System.out.println("el cliente no se encuentra en el sistema");
						}
					break;
					case 3:
					break;
					default:
					System.out.println("Esta opcion No es valida");	
					break;
					}
				System.out.println("desea realizar otra revision");
				respuesta3=oT.texto();
				}while(respuesta3.equals("si"));
			break;
		}
		System.out.println("desea volver al menu anterior");
		respuesta2=oT.texto();
		}while(respuesta2.equals("no"));
		break;
	case 2:
		do{
		System.out.println("-------------MENU VEHICULO------------");
		System.out.println("1 - Ingresar");
		System.out.println("2 - Modificar");
		System.out.println("3 - Eliminiar");
		System.out.println("4 - Reporte");
		System.out.println("5 - Volver");
		System.out.println("--------------------------------------");
		System.out.println("ingrese su opcion");
		option=oT.textoEntero();
		switch(option){
		case 1:
			do{
			System.out.println("ingrese la marca");
			marca=oT.texto();
			System.out.println("ingrese el modelo");
			modelo=oT.texto();
			System.out.println("ingrese las placas");
			placas=oT.texto();
			System.out.println("ingrese fecha de ingreso");
			fecha=oT.texto();
			arregloVehiculo.add(new Vehiculo(id,marca,modelo,placas,fecha));
			id++;
			System.out.println("desea ingresar otro vehiculo");
			respuesta3=oT.texto();
			}while(respuesta3.equals("si"));
		break;
		case 2:
			do{
			System.out.println("ingrese el id del cliente que desea modificar");
			dato=oT.textoEntero();
			for(Vehiculo variable: arregloVehiculo){
			if(contador==dato){
		
			System.out.println(variable.getCarro());
			System.out.println("--------------------------------------");
			System.out.println("----------Que desea Modificar---------");
			System.out.println("1 - Nombre");
			System.out.println("2 - Apellido");
			System.out.println("3 - Telefono");
			System.out.println("4 - Direccion");
			System.out.println("--------------------------------------");
			System.out.println("ingrese su opcion");
			opci=oT.textoEntero();
			switch(opci){
			case 1:
				System.out.println("ingrese la nuevo marca");
				nuevomarca=oT.texto();
				variable.setMarca(nuevomarca);
				System.out.println(variable.getCarro());
			break;
			case 2:
				System.out.println("ingrese el nuevo modelo");
				nuevomodelo=oT.texto();
				variable.setMarca(nuevomodelo);
				System.out.println(variable.getCarro());
			break;
			case 3:
				System.out.println("ingrese las nuevas placas");
				nuevaplacas=oT.texto();
				variable.setPlacas(nuevaplacas);
				System.out.println(variable.getCarro());
			break;
			case 4:
				System.out.println("ingrese la nueva fecha");
				nuevafecha=oT.texto();
				variable.setFecha(nuevafecha);
				System.out.println(variable.getCarro());
			break;
				}
				}
				contador++;
				}
				if(contador>arregloVehiculo.size()){
					System.out.println("el vehiculo no se encuentra en el sistema");
				}
				System.out.println("desea realizar otro cambio");
				respuesta3=oT.texto();
				}while(respuesta3.equals("si"));
		break;
		case 3:
			do{
			System.out.println("ingresa el id del usuario que desea eliminar");
			dato=oT.textoEntero();
			arregloVehiculo.remove(dato);
			System.out.println("Se Elimino ese Cliente");
			System.out.println("desea eliminar otro cliente");
			respuesta3=oT.texto();
			}while(respuesta3.equals("si"));
		break;
		case 4:
			do{
			System.out.println("--------------------------------------");
			System.out.println("---------------REPORTES---------------");
			System.out.println("1 - Reporte General");
			System.out.println("2 - Reporte de Cliente");
			System.out.println("3 - Volver");
			System.out.println("--------------------------------------");
			System.out.println("ingrese su opcion");
			opci=oT.textoEntero();
			switch(opci){
				case 1:
					for(Vehiculo variable: arregloVehiculo){
					System.out.println("--------------------------------------");
					System.out.println(variable.getCarro());
					}
					System.out.println("desea imprimir este reporte");
					respuesta4=oT.texto();
					if(respuesta4.equals("si")){
					String ruta="c:/Proyect/reporteproyecto.txt";
					File archivo=new File(ruta);
					BufferedWriter bw;
					bw=new BufferedWriter(new FileWriter(archivo));
					for(Vehiculo variable: arregloVehiculo){
					bw.write("------");
					bw.write(variable.getCarro());
					}
					bw.close();
					}
				break;
				case 2:
					System.out.println("ingresa el id del usuario que desea ver");
					dato=oT.textoEntero();
					for(Vehiculo variable: arregloVehiculo){
					if(contador==dato){
					System.out.println(variable.getCarro());
					System.out.println("desea imprimir este reporte");
					respuesta4=oT.texto();
					if(respuesta4.equals("si")){
					String ruta="c:/Proyect/reporteproyecto.txt";
					File archivo=new File(ruta);
					BufferedWriter bw;
					bw=new BufferedWriter(new FileWriter(archivo));
					bw.write("------");
					bw.write(variable.getCarro());
					bw.close();					
					}
					}
					contador++;
					}
					if(contador>arregloVehiculo.size()){
					System.out.println("el vehiculo no se encuentra en el sistema");
					}
				break;
				case 3:
				break;
				default:
					System.out.println("Esta opcion No es valida");	
				break;
				}
				System.out.println("desea resalizar otra revision");
				respuesta3=oT.texto();
				}while(respuesta3.equals("si"));
		break;
		}
		System.out.println("desea volver al menu anterior");
		respuesta2=oT.texto();
		}while(respuesta2.equals("no"));
		break;
	case 3:
		do{
		System.out.println("-------------MENU USUARIO-------------");
		System.out.println("1 - Ingresar");
		System.out.println("2 - Modificar");
		System.out.println("3 - Eliminiar");
		System.out.println("4 - Reporte");
		System.out.println("5 - Volver");
		System.out.println("--------------------------------------");
		System.out.println("ingrese su opcion");
		option=oT.textoEntero();
		switch(option){
			case 1:
				do{
				System.out.println("ingrese un nombre de usuario");
				usuario=oT.texto();
				System.out.println("ingrese la clave");
				clave=oT.texto();
				System.out.println("ingrese su rol");
				rol=oT.texto();
				arregloUsuario.add(new Usuarios(id,usuario,clave,rol));
				id++;
				System.out.println("desea ingresar otro usuario");
				respuesta3=oT.texto();
				}while(respuesta3.equals("si"));
			break;
			case 2:
				do{
				System.out.println("ingrese el id del usuario que desea modificar");
				dato=oT.textoEntero();
				for(Usuarios variable: arregloUsuario){
					if(contador==dato){
						System.out.println(variable.getCreadorUsuario());
						System.out.println("--------------------------------------");
						System.out.println("----------Que desea Modificar---------");
						System.out.println("1 - Nombre");
						System.out.println("2 - Apellido");
						System.out.println("3 - Telefono");
						System.out.println("4 - Direccion");
						System.out.println("--------------------------------------");
						System.out.println("ingrese su opcion");
						opci=oT.textoEntero();
						switch(opci){
							case 1:
								System.out.println("ingrese el nuevo nombre de usuario");
								nuevousuario=oT.texto();
								variable.setNombreUsuario(nuevousuario);
								System.out.println(variable.getCreadorUsuario());
							break;
							case 2:
								System.out.println("ingrese la nueva clave");
								nuevaclave=oT.texto();
								variable.setClave(nuevaclave);
								System.out.println(variable.getCreadorUsuario());
							break;
							case 3:
								System.out.println("ingrese el nuevo rol del usuario");
								nuevorol=oT.texto();
								variable.setRol(nuevorol);
								System.out.println(variable.getCreadorUsuario());
							break;
						}
					}
				contador++;
				}
				if(contador>arregloUsuario.size()){
					System.out.println("el cliente no se encuentra en el sistema");
				}
				System.out.println("desea realizar otro cambio");
				respuesta3=oT.texto();
				}while(respuesta3.equals("si"));
		break;
		case 3:
			do{
			System.out.println("ingresa el id del usuario que desea eliminar");
			dato=oT.textoEntero();
			arregloUsuario.remove(dato);
			System.out.println("Se Elimino ese Usuario");
			System.out.println("desea eliminar otro usuario");
			respuesta3=oT.texto();
			}while(respuesta3.equals("si"));			
		break;
		case 4:
				do{
					System.out.println("--------------------------------------");
					System.out.println("---------------REPORTES---------------");
					System.out.println("1 - Reporte General");
					System.out.println("2 - Reporte de Usuario");
					System.out.println("3 - Volver");
					System.out.println("--------------------------------------");
					System.out.println("ingrese su opcion");
				opci=oT.textoEntero();
				switch(opci){
					case 1:
						for(Usuarios variable: arregloUsuario){
						System.out.println("--------------------------------------");
						System.out.println(variable.getCreadorUsuario());
						}
						System.out.println("desea imprimir este reporte");
						respuesta4=oT.texto();
						if(respuesta4.equals("si")){
						String ruta="c:/Proyect/reporteproyecto.txt";
						File archivo=new File(ruta);
						BufferedWriter bw;
						bw=new BufferedWriter(new FileWriter(archivo));
						for(Usuarios variable: arregloUsuario){
						bw.write("------");
						bw.write(variable.getCreadorUsuario());
						}
						bw.close();
						}
					break;
					case 2:
						System.out.println("ingresa el id del usuario que desea ver");
						dato=oT.textoEntero();
						for(Usuarios variable: arregloUsuario){
						if(contador==dato){
						System.out.println(variable.getCreadorUsuario());
						System.out.println("desea imprimir este reporte");
						respuesta4=oT.texto();
						if(respuesta4.equals("si")){
						String ruta="c:/Proyect/reporteproyecto.txt";
						File archivo=new File(ruta);
						BufferedWriter bw;
						bw=new BufferedWriter(new FileWriter(archivo));
						bw.write("------");
						bw.write(variable.getCreadorUsuario());
						bw.close();					
						}
						}
						contador++;
						}
						if(contador>arregloUsuario.size()){
						System.out.println("el cliente no se encuentra en el sistema");
						}
					break;
					case 3:
					break;
					default:
					System.out.println("Esta opcion No es valida");	
					break;
					}
				System.out.println("desea realizar otra revision");
				respuesta3=oT.texto();
				}while(respuesta3.equals("si"));
			break;
		}
		System.out.println("desea volver al menu anterior");
		respuesta2=oT.texto();
		}while(respuesta2.equals("no"));
	break;
	case 4:
	break;
	default:
		System.out.println("Esta opcion No es valida");
	break;
	}
		System.out.println("Desea cerrar sesion");
		respuesta1=oT.texto();
		}while(respuesta1.equals("no"));
	}
}