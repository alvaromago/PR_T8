package es.studium.FicherosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FicheroTextoEscritura
{

	public static void main(String[] args)
	{
		try
		{
			// Abrir el fichero
			FileWriter fw = new FileWriter("archivo.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			// Gestionar el fichero
			salida.println("Claudia Palazón");
			System.out.println("Información Almacenada");
			// Cerrar el fichero
			salida.close();
			bw.close();
			fw.close();
		}
		catch(IOException ioe)
		{
			System.out.println("Error en Fichero");
		}
	}

}
