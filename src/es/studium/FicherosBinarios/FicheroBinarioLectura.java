package es.studium.FicherosBinarios;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FicheroBinarioLectura
{

	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("datos.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream entradaB = new DataInputStream(bis);
			int dato;
			dato = entradaB.readInt();
			System.out.println(dato);
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
