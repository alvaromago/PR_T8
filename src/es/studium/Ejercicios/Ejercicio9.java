package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio9
{

	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		System.out.println("Dime el nombre del fichero: ");
		String fichero = t.nextLine();
		System.out.println("Dime una palabra: ");
		String palabra = t.nextLine();
		t.close();
		boolean estar = false;
		try
		{
			// Abrir fichero
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			String contenido;
			// Gestionar fichero
			while((contenido=br.readLine()) != null)
			{
				if (contenido.equals(palabra))
				{
					estar = true;
					break;
				}
				else
				{
					estar = false;
				}
			}
			if (estar == true)
			{
				System.out.println("La palabra está en el fichero");
			}
			else if (estar == false)
			{
				System.out.println("La palabra no está en el fichero");
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
