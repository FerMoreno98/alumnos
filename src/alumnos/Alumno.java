package alumnos;


import java.util.Scanner;

public class Alumno {
	static Scanner sc=new Scanner(System.in);
	private String nombre;
	private String apellido;
	private String DNI;
	private String fecha_nacimiento;
	private double nota_media;
	private int edad;
	private String Segundo_apellido;
	
	public Alumno(int edad) {
		this.edad=edad;
	}
	public Alumno() {
				
	}
	
	public Alumno(String nombre, String apellido, String dNI, String fecha_nacimiento, double nota_media) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.fecha_nacimiento = fecha_nacimiento;
		this.nota_media = nota_media;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public String getDNI() {
		return DNI;
	}




	public void setDNI(String dNI) {
		DNI = dNI;
	}




	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}




	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}




	public double getNota_media() {
		return nota_media;
	}




	public void setNota_media(double nota_media) {
		this.nota_media = nota_media;
	}




	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", fecha_nacimiento="
				+ fecha_nacimiento + ", nota_media=" + nota_media + "]";
	}
	
	
	public void addDatos() {
		nombre=sc.next();
		apellido=sc.next();
		DNI=sc.next();
		fecha_nacimiento=sc.next();
		nota_media=sc.nextDouble();
	
	}
	
	public void Edad() {
		System.out.println("mi edad es " +edad);
	}

	
	
	

}
