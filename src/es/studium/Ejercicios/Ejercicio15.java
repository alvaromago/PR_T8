package es.studium.Ejercicios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio15
{

	public static void main(String[] args)
	{
		int numeros[] = new int[10];
		int dato = 0;
		try
		{
			FileInputStream fis = new FileInputStream("tabla1.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream entradaB = new DataInputStream(bis);
			for(int i = 0; i < numeros.length; i++)
			{
				dato = entradaB.readInt();
				numeros[i] = dato;
			}
			System.out.println(numeros);
			entradaB.close();
			bis.close();
			fis.close();
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
