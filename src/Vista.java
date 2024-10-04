import java.util.Scanner;

public class Vista {
	/*
	 * id
	 * apellido
	 * dep
	 * salario
	 * */
	static Controlador controlador = new Controlador();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		menu();
	}
	public static  void menu() {
		int opcion =0;
	
		do {
			System.out.println("1 - Leer empleado:");
			System.out.println("2 - Borrar empleado:");
			System.out.println("3 - Añadir empleado:");
			System.out.println("4 - Actualizar empleado:");
			System.out.println("5 - Listar todos los empleados:");
			System.out.println("6 - Listar un empleado particular:");
			System.out.println("7 - Salir");
			
			
			switch(opcion) {
			case 1:
				System.out.println("Introduce el id del empleado");
				int id = sc.nextInt();
				controlador.leerEmpleado(id);
				break;
			case 2:
				System.out.println("Introduce el id del empleado");
				int iddd = sc.nextInt();
				controlador.borrarEmpleado(iddd);
				
				break;
			case 3:
				System.out.println("Introduce el id y apellido y departamento y salario del empleado");
				int idd= sc.nextInt();
				String apellido = sc.nextLine();
				int dep = sc.nextInt();
				double salario = sc.nextDouble();
				controlador.AnadirEmpleado(idd, apellido, dep, salario);
				
				break;
			case 4:
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				
			}
			
		}while(opcion != 7);
		}
	}


