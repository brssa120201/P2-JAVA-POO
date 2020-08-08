package poo_tarea1;

//Clase
public class Alumnos {
	
	//Atributos
	String nombre;
	Materias m1;
	Materias m2;
	Materias m3;
	
	//Métodos
	float calPromedio() {
		float prom = 0;
		prom = (m1.notas + m2.notas + m3.notas) / 3;
		return prom;
	}
	
	//Alumno 1
	int calNotPerdida() {
		int nota = 0;
		if ((m1.notas > 3) && (m2.notas > 3) && (m3.notas > 3)){
			System.out.println("El alumno no perdio ninguna materia");
			
		}else if((m1.notas < 3 ) && (m2.notas < 3) && (m3.notas < 3)) {
			System.out.println("El alumno perdio 3 materias");
			
		}else if((m1.notas > 3) && (m2.notas < 3) && (m3.notas < 3)) {
			System.out.println("El alumno perdio 2 materias");
			
		}else if((m1.notas < 3) && (m2.notas > 3) && (m3.notas < 3)) {
			System.out.println("El alumno perdio 2 materia");
			
		}else if((m1.notas < 3) && (m2.notas < 3) && (m3.notas > 3)) {
			System.out.println("El alumno perdio 2 materia");
			
		}else if((m1.notas < 3) && (m2.notas > 3) && (m3.notas > 3)) {
			System.out.println("El alumno perdio 1 materia");
			
		}else if((m1.notas > 3) && (m2.notas < 3) && (m3.notas > 3)) {
			System.out.println("El alumno perdio 1 materia");
			
		}else if((m1.notas < 3) && (m2.notas < 3) && (m3.notas > 3)) {
			System.out.println("El alumno perdio 1 materia");
			
		}
		
		return nota;
	}
	
	int calNotGanada() {
		int nota = 0;
		if ((m1.notas > 3) && (m2.notas > 3) && (m3.notas > 3)){
			System.out.println("El alumno gano todas las materias");
			
		}else if((m1.notas < 3 ) && (m2.notas < 3) && (m3.notas < 3)) {
			System.out.println("El alumno no gano ninguna materias");
			
		}else if((m1.notas < 3) && (m2.notas > 3) && (m3.notas > 3)) {
			System.out.println("El alumno gano 2 materias");
			
		}else if((m1.notas > 3) && (m2.notas < 3) && (m3.notas > 3)) {
			System.out.println("El alumno gano 2 materia");
			
		}else if((m1.notas > 3) && (m2.notas > 3) && (m3.notas < 3)) {
			System.out.println("El alumno gano 2 materia");
			
		}else if((m1.notas > 3) && (m2.notas < 3) && (m3.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
			
		}else if((m1.notas < 3) && (m2.notas > 3) && (m3.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
			
		}else if((m1.notas < 3) && (m2.notas < 3) && (m3.notas > 3)) {
			System.out.println("El alumno gano 1 materia");
			
		}
		
		return nota;
}
	
}
	


	

