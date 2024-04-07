package alumnos;

import java.util.Scanner;

public class AlumnosMain {
	static Scanner sc=new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaAlumnos l=new ListaAlumnos();
		Alumno a1=new Alumno("fer","moreno","43471751A","28/01/1998",8.5);
		Alumno a2=new Alumno("Gabriel","Paulista","123456712C","01/06/1970",10);
		Alumno a3=new Alumno("Pedro","Ortega","98765412D","06/01/1982",9.5);
		Alumno a4=new Alumno("Mikel","Merino","12378912D","28/01/1998",8.5);
		Alumno a6 = new Alumno("Ana", "García", "45612378X", "15/07/1997", 7.8);
		Alumno a7 = new Alumno("Carlos", "Martínez", "78945612Z", "03/11/1999", 6.9);
		Alumno a8 = new Alumno("Laura", "López", "65498712Y", "22/05/1996", 9.2);
		Alumno a9 = new Alumno("Javier", "Sánchez", "32165498A", "10/09/2000", 8.1);
		Alumno a10 = new Alumno("Sara", "Ruiz", "98765432B", "07/04/1995", 7.5);
		Alumno a11= new Alumno("Pedro", "Gómez", "14785236C", "19/12/1993", 8.9);
		Alumno a12= new Alumno("María", "Fernández", "36985214D", "05/06/2001", 6.3);
		Alumno a13= new Alumno("Juan", "Díaz", "258963147E", "30/10/1994", 9.7);
		Alumno a14 = new Alumno("Elena", "Martín", "78521496F", "14/08/1992", 7.2);
		l.addalumno1(a1);
		l.addalumno1(a2);
		l.addalumno1(a3);
		l.addalumno1(a4);
		l.addalumno1(a6);
		l.addalumno1(a7);
		l.addalumno1(a8);
		l.addalumno1(a9);
		l.addalumno1(a10);
		l.addalumno1(a11);
		l.addalumno1(a12);
		l.addalumno1(a13);
		l.addalumno1(a14);
		
		
		int opcion;
		do {
			System.out.println("Elige una opcion: ");
			System.out.println("1. Busca un alumno por su DNI");
			System.out.println("2. Inserta un alumno");
			System.out.println("3. Obtener un listado de alumnos");
			System.out.println("4. Borrar alumno");
			System.out.println("5. Finalizar");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.print("Dime el DNI del alumno: ");
				String DNI=sc.next();
				l.busquedaAlumno(DNI);
				break;
				
			case 2:
				Alumno nuevoAlumno=new Alumno();
				System.out.println("Introduce los datos del alumnos");
				if(l.addalumno(nuevoAlumno)) {
					System.out.println("Se ha añadido el alumno correctamente");
				}
				break;
			case 3:
				l.mostraralumnos();
				break;
			case 4:
				System.out.print("Dame el DNI del alumno que quieres eliminar: ");
				DNI=sc.next();
				if(l.eliminaralumnos(DNI)) {
					System.out.println("Se ha eliminado el alumno correctamente");
				}else {
					System.out.println("El alumno que tratas de eliminar no existe");
				}
					
			case 5:
				System.out.println("Ha salido con exito");
				break;
				
			default:
				System.out.println("No existe la opcion seleccionada, por favor introduce una opcion valida");
				break;
				}
				
			
			
			
			
		}while(opcion!=5);
		
		
	}

	

}
