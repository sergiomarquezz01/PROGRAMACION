package FICHEROS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EJ4 {
	public static void main(String[]args)
	{
		try
		{
			 //creamos un objeto FileWriter para escribir en un archivo de texto
			FileWriter script=new FileWriter("c:\\prueba\\Ejercicioclase\\creategit.sh");
            //creamos otro objeto BufferedWriter p

			BufferedWriter bw=new BufferedWriter(script);
            //escribimos en el archivo de texto las líneas para crear una rama en Git y subir un archivo

			bw.write("git checkout -b sergio\n");
			bw.write("git add creategit.sh\n");
			bw.write("git commit -m 'subiendo archivo' \n");
			bw.write("git push origin sergio\n");
			System.out.println("script creado");
			bw.close();
		}catch(IOException e ) //lanzamos la excepcion
		
		{
			System.out.println("ocurrio un error" +e.getMessage());
		}
	}

}
