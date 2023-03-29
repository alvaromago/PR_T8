package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5
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
			FileReader fr1 = new FileReader(fichero1);
			FileReader fr2 = new FileReader(fichero2);
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);
			String contenido1;
			String almacen1 = "";
			String contenido2;
			String almacen2 = "";
			// Gestionar fichero
			while((contenido1=br1.readLine()) != null)
			{
				almacen1 = almacen1 + contenido1;
			}
			while((contenido2=br2.readLine()) != null)
			{
				almacen2 = almacen2 + contenido2;
			}
			if(almacen1.equals(almacen2))
			{
				System.out.println("Son iguales");
			}
			else
			{
				System.out.println("Son distintos");
			}
			// Cerrar fichero
			br2.close();
			br1.close();
			fr2.close();
			fr1.close();
			t.close();
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
