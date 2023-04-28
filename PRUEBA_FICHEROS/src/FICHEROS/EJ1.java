package FICHEROS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class EJ1 {
	public static void main(String[]args)
	{
		//escribimos la ruta del directorio
		String directorio="c:\\prueba";
		
		//creamos ahora un objeto file para el directorio
		File dir=new File(directorio);
		
		//jugemos ahora con el array, hagamos que el string de ficheros sea una lista de array
		String [] ficheros=dir.list();
		
		//comprobamos ahora que el array sea nulo y tenga elementos
		if(ficheros!=null && ficheros.length>0)
		{
			//hacemos uso del bucle for-each para asi recorrer todo el array
			for(String nombreFichero: ficheros)
			{
				System.out.println(nombreFichero);
			}
		}else
		{
			System.out.println("ocurrio un error");
		}
		
		//creamos ahora un objeto filewriter 
		try
		{
			FileWriter fw=new FileWriter("c:\\prueba\\listado.txt");
			
			//otro bucle for-each
			for(String nombreFichero: ficheros)
			{
				fw.write(nombreFichero+ "\n");
			}
			fw.close();
			System.out.println("Se ha guardado el contenido de archivo en listado.txt");
		}catch(IOException e) //lanzamos la excepcion
		{
			System.out.println("ocurrio un error" +e.getMessage());
		}
		
	}

}
