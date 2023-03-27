package es.studium.Ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio4
{
	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		char info;
		try
		{
			// Abrir el fichero
			FileWriter fw = new FileWriter("fich2.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			// Gestionar el fichero
			do 
			{		
				info = t.nextLine().charAt(0);
				if(info != '*')
				{
					salida.println(info);
				}
			}while(info != '*');
			System.out.println("Información Almacenada");
			// Cerrar el fichero
			salida.close();
			bw.close();
			fw.close();
			t.close();
		}
		catch(IOException ioe)
		{
			System.out.println("Error en Fichero");
		}
	}
}
