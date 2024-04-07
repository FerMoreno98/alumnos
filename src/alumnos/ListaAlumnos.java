package alumnos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ListaAlumnos {
	static Scanner sc=new Scanner(System.in);
	private ArrayList<Alumno> listadoalumnos;
	private HashSet<Alumno> listaalumnos2;
	
	
	
	public ListaAlumnos(HashSet<Alumno> listaalumnos2) {
		super();
		this.listaalumnos2=new HashSet<>();
	}
    
	public ListaAlumnos() {
		super();
		// TODO Auto-generated constructor stub
		this.listadoalumnos= new ArrayList<>();
	}

	public ListaAlumnos(ArrayList<Alumno> listadoalumnos) {
		super();
		this.listadoalumnos = listadoalumnos;
	}

	public ArrayList<Alumno> getListadoalumnos() {
		return listadoalumnos;
	}

	public void setListadoalumnos(ArrayList<Alumno> listadoalumnos) {
		this.listadoalumnos = listadoalumnos;
	}
	
	public Alumno busquedaAlumno(String DNI) {
		
			for(Alumno c:listadoalumnos) {
				if(c.getDNI().equals(DNI)) {
					System.out.println(c.getNombre());
					System.out.println(c.getApellido());
					System.out.println(c.getDNI());
					System.out.println(c.getFecha_nacimiento());
					System.out.println(c.getNota_media());
					System.out.println("");
					return c;
					
				}
				}
			System.out.println("El contacto introducido no existe");
			return null;
			}
			
			
		
	public void addalumno1(Alumno a) {
		listadoalumnos.add(a);
	}
	
	
	
	
	public boolean addalumno(Alumno a) {
		System.out.println("Nombre: ");
		String nombre=sc.nextLine();
		System.out.print("Apellido: ");
		String apellido=sc.nextLine();
		System.out.print("DNI: ");
		String DNI=sc.nextLine();
		System.out.print("Fecha nacimiento: ");
		String fecha_nac=sc.nextLine();
		System.out.print("Nota media: ");
		Double media=Double.parseDouble(sc.nextLine().replace(",", "."));
		
		a.setNombre(nombre);
		a.setApellido(apellido);
		a.setDNI(DNI);
		a.setFecha_nacimiento(fecha_nac);
		a.setNota_media(media);
		for(Alumno c:listadoalumnos) {
				if(c.getDNI().equals(a.getDNI())) {
				System.out.println("el alumno ya existe");
				return false;
			}
				
			
		}
			listadoalumnos.add(a);
		return true;
	}
	
	public void mostraralumnos() {
		for (Alumno c:listadoalumnos) {
			System.out.println("Nombre: "+c.getNombre());
			System.out.println("Apellido: "+c.getApellido());
			System.out.println("DNI: "+ c.getDNI());
			System.out.println("Fecha de nacimiento: "+ c.getFecha_nacimiento());
			System.out.println("Nota media: "+ c.getNota_media());
			System.out.println("------------------------------------");
		}
	}
	
	public boolean eliminaralumnos(String DNI) {
		for(Alumno c: listadoalumnos) {
			if(c.getDNI().equals(DNI)) {
				listadoalumnos.remove(c);
				return true;
			}
			
		}
		return false;
	}
	public void Saludar() {
		System.out.println("Hola muy buenas");
	}
	
	public void Despedirse() {
		System.out.println("Adios");
	}
	@Override
	public String toString() {
		return "ListaAlumnos [listadoalumnos=" + listadoalumnos + "]";
	}
	
	
}
