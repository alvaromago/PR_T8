package es.studium.Ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio15
{

	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		int numeros[] = new int[10];
		String nombreFichero = "";
		System.out.println("Dame el nombre del fichero:");
		nombreFichero = t.nextLine();
		t.close();
		try
		{
			FileInputStream fis = new FileInputStream(nombreFichero);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream entradaB = new DataInputStream(bis);
			for(int i = 0; i < numeros.length; i++)
			{
				numeros[i] = entradaB.readInt();
			}
			entradaB.close();
			bis.close();
			fis.close();
			for(int numero: numeros)
			{
				System.out.println(numero);
			}
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("El fichero no se encuentra");
		}
		catch(IOException ioe)
		{
			System.out.println("Error en el fichero");
		}
	}

}
