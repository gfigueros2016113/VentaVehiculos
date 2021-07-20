package org.figueros.controlador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ObtenerTexto{
	BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	String texto=null;
	int numero=0;
	public String texto(){
		try{
		texto=entrada.readLine();
		
		}catch(IOException io){
			System.out.println("Error de IO");
			System.exit(1);
		}
		return texto;
	}

	public int textoEntero(){
		try{
		numero=Integer.parseInt(entrada.readLine());
		
		}catch(IOException io){
			System.out.println("Error de IO");
			System.exit(1);
		}
		return numero;
	}
}