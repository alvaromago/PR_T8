package es.studium.Ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio12
{

	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		System.out.println("Dame un número:");
		int dato = t.nextInt();
		t.close();
		try
		{
			FileOutputStream fos = new FileOutputStream("uno.bin");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream salidaB = new DataOutputStream(bos);
			salidaB.writeInt(dato);
			salidaB.close();
			bos.close();
			fos.close();
			System.out.println("Información guardada con éxito");
		}
		catch(IOException ioe)
		{
			System.out.println("Error en el fichero");
		}
	}

}
