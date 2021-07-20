package org.figueros.clase;
import org.figueros.controlador.ObtenerTexto;
import java.io.IOException;
public class Login{
	ObtenerTexto oT=new ObtenerTexto();
	String usuario;
	String clave;
	String rol;
	ManejadorUsuario mUsuario=new ManejadorUsuario();
	public void pantallaPrincipal()throws IOException{
		System.out.println("-----Ingrese su usuario-----");
		usuario=oT.texto();
		System.out.println("------Ingrese la clave------");
		clave=oT.texto();
		mUsuario.autentificador(usuario,clave);
	}
}