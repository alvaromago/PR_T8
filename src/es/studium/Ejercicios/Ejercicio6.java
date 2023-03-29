package es.studium.Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		try
		{
			// Abrir fichero
			System.out.println("Dame el nombre del fichero origen: ");
			String fichero1 = t.nextLine();
			System.out.println("Dame el nombre del fichero destino: ");
			String fichero2 = t.nextLine();
			t.close();
			FileReader fr = new FileReader(fichero1);
			FileWriter fw = new FileWriter(fichero2);
			BufferedWriter bw = new BufferedWriter(fw);
			BufferedReader br1 = new BufferedReader(fr);
			PrintWriter salida = new PrintWriter(bw);
			String contenido1;
			// Gestionar fichero
			while((contenido1=br1.readLine()) != null)
			{
				salida.println(contenido1);
			}
			System.out.println("Información Almacenada");
			// Cerrar fichero
			br1.close();
			bw.close();
			fw.close();
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
