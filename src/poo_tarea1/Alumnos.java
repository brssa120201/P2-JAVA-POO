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
	int calNotPerdida1() {
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
	
	int calNotGanada1() {
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
	
	int calPerCredito() {
		int dinero = 0;
		if((m1.notas < 3) && (m2.notas < 3) && (m3.notas < 3)) {
			System.out.println("Perdio 3 creditos");
			dinero = (int) ((m1.numCreditos * m1.valCreditos) + (m2.numCreditos * m2.valCreditos) + (m3.numCreditos * m3.valCreditos));

		}else if((m1.notas > 3) && (m2.notas < 3) && (m3.notas < 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m2.numCreditos * m2.valCreditos) + (m3.numCreditos * m3.valCreditos));
			
		}else if((m1.notas < 3) && (m2.notas > 3) && (m3.notas < 3)) {
			System.out.println("Perdio 2 creditos");	
			dinero = (int) ((m1.numCreditos * m1.valCreditos) + (m3.numCreditos * m3.valCreditos));
			
		}else if((m1.notas < 3) && (m2.notas < 3) && (m3.notas > 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m1.numCreditos * m1.valCreditos) + (m2.numCreditos * m2.valCreditos));
			
		}else if((m1.notas < 3) && (m2.notas > 3) && (m3.notas > 3)) {
			System.out.println("Perdio 1 creditos");	
			dinero = (int) ((m1.numCreditos * m1.valCreditos));
			
		}else if((m1.notas > 3) && (m2.notas < 3) && (m3.notas > 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m2.numCreditos * m2.valCreditos));
			
		}else if((m1.notas > 3) && (m2.notas > 3) && (m3.notas < 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m3.numCreditos * m3.valCreditos));
	}
		return dinero;
		
}
	 
	
}



	


	

