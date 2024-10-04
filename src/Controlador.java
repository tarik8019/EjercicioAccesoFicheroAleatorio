import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Controlador {
	
	
	File fichero = new File("AleatorioEmple.dat");
	
	public boolean leerEmpleado(int regestro) {
		/*
		 * id
		 * apellido
		 * dep
		 * salario
		 * */
		
		
		try {
			RandomAccessFile accessFile = new RandomAccessFile(fichero, "r");
			int posicion = (regestro-1)*36;
			accessFile.seek(posicion);
			int id = accessFile.readInt();
			String apellido = accessFile.readUTF();
			int dep = accessFile.readInt();
			double salario = accessFile.readDouble();
			System.out.println("Empleado id: "+id+ " Apellido: "+apellido+ " Departamento: "+dep+" Salario: "+salario);
			return true;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean borrarEmpleado(int id) {
		
		try {
			RandomAccessFile accessFile = new  RandomAccessFile(fichero, "rw");
			int posicion = (id-1)*36;
		
			
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		
		return true;
	}
	
	
		public void AnadirEmpleado(int id, String apellido, int dep, double salario) {
			
			
			try {
				RandomAccessFile accessFile = new RandomAccessFile(fichero, "rw");
				StringBuffer buffer = new StringBuffer(apellido);
				buffer.setLength(15);
				if( leerEmpleado(id) == false) {
				accessFile.writeInt(id);
				accessFile.writeChars(buffer.toString());
				accessFile.writeInt(dep);
				accessFile.writeDouble(salario);
				System.out.println("El empleado esta añadido con exito");
				}else {
					System.out.println("No se puede añadir empleado, esta existe");
				}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}
	


