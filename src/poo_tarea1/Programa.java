package poo_tarea1;

/*
 * Realizar un programa que realice unos calculos con las notas de unas
 * asignaturas pertenecientes a un estudiante. Cálculos:
 * 1. Promedio del semestre: OK
 * 2. Cuántas notas/asignaturas perdió OK
 * 3. Cuántas asignaturas ganó OK
 * 4. Cada asignatura tiene un número de créditos, se debe indicar cuántos créditos
 * perdió y cuánto dinero debe pagar para repetir los créditos/asignatura. * 
 * 5. Crear al menos 5 estudiantes con diferentes valores
 * 6. Crear el proyecto en GitHub
 * 7. Fecha máxima de entrega: domingo 09 de agosto 2020
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
		a5.nombre = "Toño";
		
		//Crear objetos Materias Alumnos
		Materias ma1 = new Materias();
		ma1.nombre = "Programación";
		ma1.notas = 1;
		ma1.numCreditos = 2;
		ma1.valCreditos = 2000;
		
		Materias ma2 = new Materias();
		ma2.nombre = "Ingles";
		ma2.notas = 2;
		ma2.numCreditos = 3;
		ma2.valCreditos = 3000;
		
		Materias ma3 = new Materias();
		ma3.nombre = "Matematicas";
		ma3.notas = 4;
		ma3.numCreditos = 1;
		ma3.valCreditos = 4000;
		
		//Relaciones entre objetos
		a1.m1 = ma1;
		a1.m2 = ma2;
		a1.m3 = ma3;
		
		
		System.out.println("Alumno: " + a1.nombre);
		float promedioA1 = a1.calPromedio();
		System.out.println("El promedio del estudiante " + promedioA1);
		
		int matperdidasa1 = a1.calNotPerdida1();
		int matganadasa1 = a1.calNotGanada1();
		
		float dineroA1 = a1.calPerCredito();
		System.out.println("Para repetir los creditos debe pagar: " + dineroA1);
		
			
		
	}

}