package es.studium.Ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicio1
{
	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		try
		{
			// Abrir el fichero
			FileWriter fw = new FileWriter("fich1.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			// Gestionar el fichero
			System.out.println("Escribe una frase: ");
			String info = t.nextLine();
			salida.println(info);
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
