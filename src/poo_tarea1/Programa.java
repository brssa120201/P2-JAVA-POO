package poo_tarea1;

/*
 * Realizar un programa que realice unos calculos con las notas de unas
 * asignaturas pertenecientes a un estudiante. C�lculos:
 * 1. Promedio del semestre: OK
 * 2. Cu�ntas notas/asignaturas perdi� OK
 * 3. Cu�ntas asignaturas gan� OK
 * 4. Cada asignatura tiene un n�mero de cr�ditos, se debe indicar cu�ntos cr�ditos
 * perdi� y cu�nto dinero debe pagar para repetir los cr�ditos/asignatura. * 
 * 5. Crear al menos 5 estudiantes con diferentes valores
 * 6. Crear el proyecto en GitHub
 * 7. Fecha m�xima de entrega: domingo 09 de agosto 2020
 * */
public class Programa {

	public static void main(String[] args) {
		
		//Creas objetos Alumnos
		Alumnos a1 = new Alumnos();
		a1.nombre = "Lucia";
		
		Alumnos a2 = new Alumnos();
		a2.nombre = "Juan";
		
		Alumnos a3 = new Alumnos();
		a3.nombre = "Lola";
		
		Alumnos a4 = new Alumnos();
		a4.nombre = "Susi";
		
		Alumnos a5 = new Alumnos();
		a5.nombre = "To�o";
		
		//Crear objetos Materias
		Materias ma1 = new Materias();
		ma1.nombre = "Programaci�n";
		ma1.notas = 1;
		ma1.numCreditos = 2;
		
		Materias ma2 = new Materias();
		ma2.nombre = "Ingles";
		ma2.notas = 2;
		ma2.numCreditos = 3;
		
		Materias ma3 = new Materias();
		ma3.nombre = "Matematicas";
		ma3.notas = 4;
		ma3.numCreditos = 4;
		
		//Relaciones entre objetos
		a1.m1 = ma1;
		a1.m2 = ma2;
		a1.m3 = ma3;
		a2.m1 = ma1;
		a2.m2 = ma2;
		a2.m3 = ma3;
		
		
		float promedioA1 = a1.calPromedio();
		System.out.println("El promedio del estudiante es: " + promedioA1);
		
		System.out.println("Alumno: " + a1.nombre);
		int matperdidasa1 = a1.calNotPerdida();
		int matganadasa1 = a1.calNotGanada();
		
		System.out.println("Alumno: " + a2.nombre);
		int matperdidasa2 = a2.calNotPerdida();
		int matganadasa2 = a2.calNotGanada();
			
		
	}

}