package FICHEROS;



import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class EJ2 {

	public static void main(String[] args) {
		

			//lo de siempre, cuando usamos la importación de scanner, hacemos uso de scanner para pedir al usuario que introduzca sus credenciales
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Usuario: ");
			String usuario=s.nextLine();
			System.out.println("Contraseña: ");
			String contraseña=s.nextLine();
			
			//creamos un objeto file para el directorio donde se va a guardar el fichero de los clientes
			String directorio="c:\\prueba\\clientes";
			File dir=new File(directorio);
			if(!dir.exists())
			{
				dir.mkdir();
			}
			 // Creamos un objeto File para el fichero de texto del cliente, utilizando el nombre de usuario ingresado
			String rutaFichero=directorio+"/"+usuario+".txt";
			File fichero=new File(rutaFichero);
			
			//comprobamos si el fichero existe o no, si no lo creamos en un nuevo archivo en el sistema de archivos para que nos devuelva un valor booleano que indica si el archivo fue creado correctamente
			if(!fichero.exists())
			{
				try {
				fichero.createNewFile();
				FileWriter wr=new FileWriter(fichero);
				wr.write("Sergio" +usuario +"\n");
				wr.write("Programacion:"+contraseña+"\n");
				wr.close();
				System.out.println("Exito");
				}catch(IOException e)
				{
					System.out.println("ocurrio un error"+e.getMessage());
				}
			}
			else
			{
				//si todo eso existe , indicamos que las credenciales ya estan en uso
				System.out.println("Las credenciales ya estan en uso");
			}
			s.close();
		}
	
	}