package poo_tarea1;

//Clase
public class Alumnos {
	
	//Atributos
	String nombre;
	Materias m1;
	Materias m2;
	Materias m3;
	Materias m4;
	Materias m5;
	Materias m6;
	
	//Métodos
	//Promedios Semestre
	//Alumno 1
	float calPromedioA1() {
		float prom = 0;
		prom = (m1.notas + m2.notas + m3.notas) / 3;
		return prom;
	}
	
	//Alumno 2
	float calPromedioA2() {
		float prom = 0;
		prom = (m4.notas + m5.notas + m6.notas) / 3;
		return prom;
	}
	
	//Alumno 3
	float calPromedioA3() {
		float prom = 0;
		prom = (m1.notas + m3.notas + m5.notas) / 3;
		return prom;
	}
	
	//Alumno 4
	float calPromedioA4() {
		float prom = 0;
		prom = (m2.notas + m4.notas + m6.notas) / 3;
		return prom;
	}
	
	//Alumno 5
	float calPromedioA5() {
		float prom = 0;
		prom = (m2.notas + m5.notas + m1.notas) / 3;
		return prom;
	}
	
	//Notas/Materias Perdidas:
	//Alumno 1
	int calNotPerdida1() {
		int nota = 0;
		if ((m1.notas >= 3) && (m2.notas >= 3) && (m3.notas >= 3)){
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
	
	//Alumno 2
	int calNotPerdidasa2() {
		int nota = 0;
		if((m4.notas >= 3) && (m5.notas >= 3) && (m6.notas >= 3))  {
			System.out.println("El alumno no perdio materias");
		}else if ((m4.notas < 3) && (m5.notas < 3) && (m6.notas < 3)){
			System.out.println("El alumno perdio 3 materias");
		}else if((m4.notas < 3) && (m5.notas < 3) && (m6.notas >= 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m4.notas >= 3) && (m5.notas < 3) && (m6.notas < 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m4.notas < 3) && (m5.notas >= 3) && (m6.notas < 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m4.notas < 3) && (m5.notas >= 3) && (m6.notas >= 3)) {
			System.out.println("El alumno perdio 1 materia");
		}else if((m4.notas >= 3) && (m5.notas < 3) && (m6.notas >= 3)) {
			System.out.println("El alumno perdio 1 materia");
		}else if((m4.notas >= 3) && (m5.notas >= 3) && (m6.notas < 3)) {
			System.out.println("El alumno perdio 1 materia");
		}
		return nota;
	}
	
	//Alumno 3
	int calNotPerdidasa3() {
		int nota = 0;
		if((m1.notas >= 3) && (m3.notas >= 3) && (m5.notas >= 3))  {
			System.out.println("El alumno no perdio materias");
		}else if ((m1.notas < 3) && (m3.notas < 3) && (m5.notas < 3)){
			System.out.println("El alumno perdio 3 materias");
		}else if((m1.notas < 3) && (m3.notas < 3) && (m5.notas >= 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m1.notas >= 3) && (m3.notas < 3) && (m5.notas < 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m1.notas < 3) && (m3.notas >= 3) && (m5.notas < 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m1.notas < 3) && (m3.notas >= 3) && (m5.notas >= 3)) {
			System.out.println("El alumno perdio 1 materia");
		}else if((m1.notas >= 3) && (m3.notas < 3) && (m5.notas >= 3)) {
			System.out.println("El alumno perdio 1 materia");
		}else if((m1.notas >= 3) && (m3.notas >= 3) && (m5.notas < 3)) {
			System.out.println("El alumno perdio 1 materia");
		}
		return nota;
	}
	
	//Alumno 4
	int calNotPerdidasa4() {
		int nota = 0;
		if((m2.notas >= 3) && (m4.notas >= 3) && (m6.notas >= 3))  {
			System.out.println("El alumno no perdio materias");
		}else if ((m2.notas < 3) && (m4.notas < 3) && (m6.notas < 3)){
			System.out.println("El alumno perdio 3 materias");
		}else if((m2.notas < 3) && (m4.notas < 3) && (m6.notas >= 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m2.notas >= 3) && (m4.notas < 3) && (m6.notas < 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m2.notas < 3) && (m4.notas >= 3) && (m6.notas < 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m2.notas < 3) && (m4.notas >= 3) && (m6.notas >= 3)) {
			System.out.println("El alumno perdio 1 materia");
		}else if((m2.notas >= 3) && (m4.notas < 3) && (m6.notas >= 3)) {
			System.out.println("El alumno perdio 1 materia");
		}else if((m2.notas >= 3) && (m4.notas >= 3) && (m6.notas < 3)) {
			System.out.println("El alumno perdio 1 materia");
		}
		return nota;
	}
	
	//Alumno 5
	int calNotPerdidasa5() {
		int nota = 0;
		if((m2.notas >= 3) && (m5.notas >= 3) && (m1.notas >= 3))  {
			System.out.println("El alumno no perdio materias");
		}else if ((m2.notas < 3) && (m5.notas < 3) && (m1.notas < 3)){
			System.out.println("El alumno perdio 3 materias");
		}else if((m2.notas < 3) && (m5.notas < 3) && (m1.notas >= 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m2.notas >= 3) && (m5.notas < 3) && (m1.notas < 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m2.notas < 3) && (m5.notas >= 3) && (m1.notas < 3)) {
			System.out.println("El alumno perdio 2 materias");
		}else if((m2.notas < 3) && (m5.notas >= 3) && (m1.notas >= 3)) {
			System.out.println("El alumno perdio 1 materia");
		}else if((m2.notas >= 3) && (m5.notas < 3) && (m1.notas >= 3)) {
			System.out.println("El alumno perdio 1 materia");
		}else if((m2.notas >= 3) && (m5.notas >= 3) && (m1.notas < 3)) {
			System.out.println("El alumno perdio 1 materia");
		}
		return nota;
	}
	
	//Notas/Materias Ganadas:
	//Alumno 1
	int calNotGanada1() {
		int nota = 0;
		if ((m1.notas >= 3) && (m2.notas >= 3) && (m3.notas >= 3)){
			System.out.println("El alumno gano todas las materias");
		}else if((m1.notas < 3 ) && (m2.notas < 3) && (m3.notas < 3)) {
			System.out.println("El alumno no gano ninguna materias");
		}else if((m1.notas < 3) && (m2.notas >= 3) && (m3.notas >= 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m1.notas >= 3) && (m2.notas < 3) && (m3.notas >= 3)) {
			System.out.println("El alumno gano 2 materia");
		}else if((m1.notas >= 3) && (m2.notas >= 3) && (m3.notas < 3)) {
			System.out.println("El alumno gano 2 materia");
		}else if((m1.notas >= 3) && (m2.notas < 3) && (m3.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
		}else if((m1.notas < 3) && (m2.notas >= 3) && (m3.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
		}else if((m1.notas < 3) && (m2.notas < 3) && (m3.notas >= 3)) {
			System.out.println("El alumno gano 1 materia");
			
		}
		
		return nota;
	}
	
	//Alumno 2
	int calMatGanadas2() {
		int nota = 0;
		if((m4.notas >= 3) && (m5.notas >= 3) && (m6.notas >= 3)) {
			System.out.println("El alumno gano las materias");
		}else if((m4.notas < 3) && (m5.notas < 3) && (m6.notas < 3)) {
			System.out.println("El alumno no gano ninguna materia");
		}else if((m4.notas >= 3) && (m5.notas >= 3) && (m6.notas < 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m4.notas >= 3) && (m5.notas < 3) && (m6.notas >= 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m4.notas < 3) && (m5.notas >= 3) && (m6.notas >= 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m4.notas >= 3) && (m5.notas < 3) && (m6.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
		}else if((m4.notas < 3) && (m5.notas >= 3) && (m6.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
		}else if((m4.notas < 3) && (m5.notas < 3) && (m6.notas >= 3)) {
			System.out.println("El alumno gano 1 materia");
		}
		return nota;
	}
	
	//Alumno 3
	int calMatGanadas3() {
		int nota = 0;
		if((m1.notas >= 3) && (m3.notas >= 3) && (m5.notas >= 3)) {
			System.out.println("El alumno gano las materias");
		}else if((m1.notas < 3) && (m3.notas < 3) && (m5.notas < 3)) {
			System.out.println("El alumno no gano ninguna materia");
		}else if((m1.notas >= 3) && (m3.notas >= 3) && (m5.notas < 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m1.notas >= 3) && (m3.notas < 3) && (m5.notas >= 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m1.notas < 3) && (m3.notas >= 3) && (m5.notas >= 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m1.notas >= 3) && (m3.notas < 3) && (m5.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
		}else if((m1.notas < 3) && (m3.notas >= 3) && (m5.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
		}else if((m1.notas < 3) && (m3.notas < 3) && (m5.notas >= 3)) {
			System.out.println("El alumno gano 1 materia");
		}
		return nota;
	}
	
	//Alumno 4
	int calMatGanadas4() {
		int nota = 0;
		if((m2.notas >= 3) && (m4.notas >= 3) && (m6.notas >= 3)) {
			System.out.println("El alumno gano las materias");
		}else if((m2.notas < 3) && (m4.notas < 3) && (m6.notas < 3)) {
			System.out.println("El alumno no gano ninguna materia");
		}else if((m2.notas >= 3) && (m4.notas >= 3) && (m6.notas < 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m2.notas >= 3) && (m4.notas < 3) && (m6.notas >= 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m2.notas < 3) && (m4.notas >= 3) && (m6.notas >= 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m2.notas >= 3) && (m4.notas < 3) && (m6.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
		}else if((m2.notas < 3) && (m4.notas >= 3) && (m6.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
		}else if((m2.notas < 3) && (m4.notas < 3) && (m6.notas >= 3)) {
			System.out.println("El alumno gano 1 materia");
		}
		return nota;
	}
	
	//Alumno 5
	int calMatGanadas5() {
		int nota = 0;
		if((m2.notas >= 3) && (m5.notas >= 3) && (m1.notas >= 3)) {
			System.out.println("El alumno gano las materias");
		}else if((m2.notas < 3) && (m5.notas < 3) && (m1.notas < 3)) {
			System.out.println("El alumno no gano ninguna materia");
		}else if((m2.notas >= 3) && (m5.notas >= 3) && (m1.notas < 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m2.notas >= 3) && (m5.notas < 3) && (m1.notas >= 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m2.notas < 3) && (m5.notas >= 3) && (m1.notas >= 3)) {
			System.out.println("El alumno gano 2 materias");
		}else if((m2.notas >= 3) && (m5.notas < 3) && (m1.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
		}else if((m2.notas < 3) && (m5.notas >= 3) && (m1.notas < 3)) {
			System.out.println("El alumno gano 1 materia");
		}else if((m2.notas < 3) && (m5.notas < 3) && (m1.notas >= 3)) {
			System.out.println("El alumno gano 1 materia");
		}
		return nota;
	}
	
	//Creditos perdidos y Dinero que debe pagar para repetirlos:
	//Alumno 1
	int calPerCredito() {
		int dinero = 0;
		if((m1.notas < 3) && (m2.notas < 3) && (m3.notas < 3)) {
			System.out.println("Perdio 3 creditos");
			dinero = (int) ((m1.numCreditos * m1.valCreditos) + (m2.numCreditos * m2.valCreditos) + (m3.numCreditos * m3.valCreditos));
		}else if((m1.notas >= 3) && (m2.notas < 3) && (m3.notas < 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m2.numCreditos * m2.valCreditos) + (m3.numCreditos * m3.valCreditos));
		}else if((m1.notas < 3) && (m2.notas >= 3) && (m3.notas < 3)) {
			System.out.println("Perdio 2 creditos");	
			dinero = (int) ((m1.numCreditos * m1.valCreditos) + (m3.numCreditos * m3.valCreditos));
		}else if((m1.notas < 3) && (m2.notas < 3) && (m3.notas >= 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m1.numCreditos * m1.valCreditos) + (m2.numCreditos * m2.valCreditos));
		}else if((m1.notas < 3) && (m2.notas >= 3) && (m3.notas >= 3)) {
			System.out.println("Perdio 1 creditos");	
			dinero = (int) ((m1.numCreditos * m1.valCreditos));
		}else if((m1.notas >= 3) && (m2.notas < 3) && (m3.notas >= 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m2.numCreditos * m2.valCreditos));
		}else if((m1.notas >= 3) && (m2.notas >= 3) && (m3.notas < 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m3.numCreditos * m3.valCreditos));
	}
		return dinero;
		
	}
	
	//Alumno 2
	int calPerCreditos2() {
		int dinero = 0;
		if ((m4.notas < 3) && (m5.notas < 3) && (m6.notas < 3)) {
			System.out.println("Perdio 3 creditos");
			dinero = (int) ((m4.numCreditos * m4.valCreditos) + (m5.numCreditos * m5.valCreditos) + (m6.numCreditos * m6.valCreditos));
		}else if((m4.notas < 3) && (m5.notas < 3) && (m6.notas >= 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m4.notas * m4.valCreditos) + (m5.numCreditos * m5.valCreditos));
		}else if((m4.notas < 3) && (m5.notas >= 3) && (m6.notas < 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m4.numCreditos * m4.valCreditos) + (m6.numCreditos * m6.valCreditos));
		}else if((m4.notas >= 3) && (m5.notas < 3) && (m6.notas < 3) ) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m5.numCreditos * m5.valCreditos) + (m6.numCreditos * m6.valCreditos));
		}else if((m4.notas < 3) && (m5.notas >= 3) && (m6.notas >= 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m4.numCreditos * m4.valCreditos));
		}else if((m4.notas >= 3) && (m5.notas < 3) && (m6.notas >= 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m5.numCreditos * m5.valCreditos));
		}else if((m4.notas >= 3) && (m5.notas >= 3) && (m6.notas < 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m6.numCreditos * m6.valCreditos));
		}
		return dinero;
	}
	
	//Alumno 3
	int calPerCreditos3() {
		int dinero = 0;
		if ((m1.notas < 3) && (m3.notas < 3) && (m5.notas < 3)) {
			System.out.println("Perdio 3 creditos");
			dinero = (int) ((m1.numCreditos * m1.valCreditos) + (m3.numCreditos * m3.valCreditos) + (m5.numCreditos * m5.valCreditos));
		}else if((m1.notas < 3) && (m3.notas < 3) && (m5.notas >= 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m1.notas * m1.valCreditos) + (m3.numCreditos * m3.valCreditos));
		}else if((m1.notas < 3) && (m3.notas >= 3) && (m5.notas < 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m1.numCreditos * m1.valCreditos) + (m5.numCreditos * m5.valCreditos));
		}else if((m1.notas >= 3) && (m3.notas < 3) && (m5.notas < 3) ) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m3.numCreditos * m3.valCreditos) + (m5.numCreditos * m5.valCreditos));
		}else if((m1.notas < 3) && (m3.notas >= 3) && (m5.notas >= 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m1.numCreditos * m1.valCreditos));
		}else if((m1.notas >= 3) && (m3.notas < 3) && (m5.notas >= 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m3.numCreditos * m3.valCreditos));
		}else if((m1.notas >= 3) && (m3.notas >= 3) && (m5.notas < 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m5.numCreditos * m5.valCreditos));
		}
		return dinero;
	}
	
	//Alumno 4
	int calPerCreditos4() {
		int dinero = 0;
		if ((m2.notas < 3) && (m4.notas < 3) && (m6.notas < 3)) {
			System.out.println("Perdio 3 creditos");
			dinero = (int) ((m2.numCreditos * m2.valCreditos) + (m4.numCreditos * m4.valCreditos) + (m6.numCreditos * m6.valCreditos));
		}else if((m2.notas < 3) && (m4.notas < 3) && (m6.notas >= 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m2.notas * m2.valCreditos) + (m4.numCreditos * m4.valCreditos));
		}else if((m2.notas < 3) && (m4.notas >= 3) && (m6.notas < 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m2.numCreditos * m2.valCreditos) + (m6.numCreditos * m6.valCreditos));
		}else if((m2.notas >= 3) && (m4.notas < 3) && (m6.notas < 3) ) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m4.numCreditos * m4.valCreditos) + (m6.numCreditos * m6.valCreditos));
		}else if((m2.notas < 3) && (m4.notas >= 3) && (m6.notas >= 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m2.numCreditos * m2.valCreditos));
		}else if((m2.notas >= 3) && (m4.notas < 3) && (m6.notas >= 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m4.numCreditos * m4.valCreditos));
		}else if((m2.notas >= 3) && (m4.notas >= 3) && (m6.notas < 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m6.numCreditos * m6.valCreditos));
		}
		return dinero;
	}
	
	//Alumno 5
	int calPerCreditos5() {
		int dinero = 0;
		if ((m2.notas < 3) && (m5.notas < 3) && (m1.notas < 3)) {
			System.out.println("Perdio 3 creditos");
			dinero = (int) ((m2.numCreditos * m2.valCreditos) + (m5.numCreditos * m5.valCreditos) + (m1.numCreditos * m1.valCreditos));
		}else if((m2.notas < 3) && (m5.notas < 3) && (m1.notas >= 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m2.notas * m2.valCreditos) + (m5.numCreditos * m5.valCreditos));
		}else if((m2.notas < 3) && (m5.notas >= 3) && (m1.notas < 3)) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m2.numCreditos * m2.valCreditos) + (m1.numCreditos * m1.valCreditos));
		}else if((m2.notas >= 3) && (m5.notas < 3) && (m1.notas < 3) ) {
			System.out.println("Perdio 2 creditos");
			dinero = (int) ((m5.numCreditos * m5.valCreditos) + (m1.numCreditos * m1.valCreditos));
		}else if((m2.notas < 3) && (m5.notas >= 3) && (m1.notas >= 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m2.numCreditos * m2.valCreditos));
		}else if((m2.notas >= 3) && (m5.notas < 3) && (m1.notas >= 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m5.numCreditos * m5.valCreditos));
		}else if((m2.notas >= 3) && (m5.notas >= 3) && (m1.notas < 3)) {
			System.out.println("Perdio 1 creditos");
			dinero = (int) ((m1.numCreditos * m1.valCreditos));
		}
		return dinero;
	}
	
	
	
}
	



	


	

