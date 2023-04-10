package es.studium.Ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio14
{

	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		int numeros[] = new int[10];
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.println("Dame un número entero:");
			numeros[i] = t.nextInt();
		}
		t.close();
		try
		{
			FileOutputStream fos = new FileOutputStream("tabla1.dat", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream salidaB = new DataOutputStream(bos);
			for(int i = 0; i < numeros.length; i++)
			{				
				salidaB.writeInt(numeros[i]);
			}
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
