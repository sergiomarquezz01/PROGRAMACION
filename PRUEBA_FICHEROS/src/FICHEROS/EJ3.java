package FICHEROS;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;



public class EJ3
{
	public static void main(String[]args) throws IOException
	{
		File carpetaAborrar=new File("c:\\prueba\\clientes");
		FileUtils.deleteDirectory(carpetaAborrar);
		System.out.println("se ha borrado la carpeta correctamente");
	}
}