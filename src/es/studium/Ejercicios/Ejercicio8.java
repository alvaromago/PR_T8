package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8
{
	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		try
		{
			// Abrir fichero
			System.out.println("Dame el nombre del fichero: ");
			String fichero = t.nextLine();
			t.close();
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			String contenido;
			String vocales = "aeiou";
			String puntuacion = ".,:;¿?!¡ ";
			int numvocales = 0;
			int numpuntuacion = 0;
			int numconsonantes = 0;
			// Gestionar fichero
			while((contenido=br.readLine()) != null)
			{
				for(int i = 0; i < contenido.length(); i++)
				{
					if(vocales.contains(contenido.charAt(i)+"") == true)
					{
						numvocales++;
					}
					else if(puntuacion.contains(contenido.charAt(i)+"") == true)
					{
						numpuntuacion++;
					}
					else
					{
						numconsonantes++;
					}
				}
			}
			System.out.println("El archivo tiene " + numvocales + " vocales");
			System.out.println("El archivo tiene " + numconsonantes + " vocales");
			System.out.println("El archivo tiene " + numpuntuacion + " vocales");
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
