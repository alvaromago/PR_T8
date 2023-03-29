package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		try
		{
			// Abrir fichero
			System.out.println("Dame el nombre del primer fichero: ");
			String fichero1 = t.nextLine();
			System.out.println("Dame el nombre del segundo fichero: ");
			String fichero2 = t.nextLine();
			FileReader fr = new FileReader(fichero1);
			FileWriter fw1 = new FileWriter(fichero2, false);
			FileWriter fw2 = new FileWriter(fichero2, true);
			BufferedWriter bw1 = new BufferedWriter(fw1);
			BufferedWriter bw2 = new BufferedWriter(fw2);
			BufferedReader br = new BufferedReader(fr);
			PrintWriter salida1 = new PrintWriter(bw1);
			PrintWriter salida2 = new PrintWriter(bw2);
			String contenido1;
			String respuesta;
			// Gestionar fichero
			File fichero = new File(fichero2);
			if(fichero.exists())
			{	
				System.out.println("Ese fichero ya existe. ¿Quieres sobreescribir la información? ");
				respuesta = t.nextLine();
				t.close();
				if(respuesta.toLowerCase().equals("si"))
				{					
					while((contenido1=br.readLine()) != null)
					{
						if(contenido1 != null)
						{
							salida1.println(contenido1);
						}
					}
				}
				else
				{
					while((contenido1=br.readLine()) != null)
					{
						if(contenido1 != null)
						{
							salida2.println(contenido1);
						}
					}
				}
			}
			else
			{
				while((contenido1=br.readLine()) != null)
				{
					if(contenido1 != null)
					{
						salida1.println(contenido1);
					}
				}
			}
			System.out.println("Información Almacenada");
			// Cerrar fichero
			br.close();
			bw1.close();
			bw2.close();
			fw1.close();
			fw2.close();
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
