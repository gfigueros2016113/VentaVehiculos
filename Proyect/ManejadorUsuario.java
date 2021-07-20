package org.figueros.clase;
import org.figueros.vista.MenuAdmin;
import org.figueros.vista.MenuTrab;
import org.figueros.controlador.ObtenerTexto;
import java.io.IOException;
public class ManejadorUsuario{
	Administrador aD=new Administrador();
	Trabajador tR=new Trabajador();
	MenuAdmin mA=new MenuAdmin();
	MenuTrab mT=new MenuTrab();
	String usua;
	String cont;
	String lab;
	String user;
	String pass;
	String rol;
	   	public void autentificador(String u,String clave)throws IOException{
			usua=aD.getNombreUsuario();
			cont=aD.getClave();
			lab=aD.getRol();
			user=tR.getNombreUsuario();
			pass=tR.getClave();
			rol=tR.getRol();
				if(u.equals(usua)&& clave.equals(cont)){
				if(lab.equals("admin")){	
					System.out.println("-----------------------------------------");
					System.out.println("         Bienvenido Administrador");
					mA.MenuAdmin(u);
				}else{
					System.out.println("Usuario No Existente");
				}
				}else{
					if(u.equals(user)&&pass.equals(pass)){
					if(rol.equals("trab")){
						System.out.println("-----------------------------------------");
						System.out.println("         Bienvenido Trabajador");
						mT.MenuTrab(u);
					}else{
						System.out.println("Usuario No Existente");
				}
					}
		}
	}
}