package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2
{
	public static void main(String[] args)
	{
		try
		{
			// Abrir fichero
			FileReader fr = new FileReader("fich1.txt");
			BufferedReader br = new BufferedReader(fr);
			String contenido;
			// Gestionar fichero
			while((contenido=br.readLine()) != null)
			{
				System.out.println(contenido);
			}
			// Cerrar fichero
			br.close();
			fr.close();
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Fichero no encontrado");
		}
		catch(IOException ioe)
		{
			System.out.println("Error en fichero");
		}
	}
}
