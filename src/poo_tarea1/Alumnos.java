package poo_tarea1;

import java.util.Arrays;

//Clase
public class Alumnos {
	
	 //Atributos
	String nombre;
	
	 public static int MAX_MATERIAS = 5;
	 public final static int FAC_CRECIMIENTO = 2;
	
	//Arreglos
	Materias[] materias = new Materias[MAX_MATERIAS];
	
	Materias[] materiasCopia = new Materias[(MAX_MATERIAS * FAC_CRECIMIENTO)];
	
	int cantMaterias = 0;
	int numCreditos;
	
	//Copiar arreglo
	public void materiasCop() {
		materiasCopia = Arrays.copyOf(materias, materiasCopia.length);
	}
	
	//Arreglo final(original)
	public void materiasFin() {
		materias = Arrays.copyOf(materiasCopia, materiasCopia.length);
	}
	
	//Métodos
	//Añadir Materias y creditos con excepciones
	public void AddMaterias(Materias a) throws Exception {
		for(int i = 0; i < cantMaterias; i++) {
			if(cantMaterias == Alumnos.MAX_MATERIAS) {
				//throw new MaxMateriasException("El alumno ya inscribio la cantidad maxima de materias");
				Alumnos.MAX_MATERIAS = materiasCopia.length;
				materiasCop();
				Materias[] materias = new Materias[materiasCopia.length]; 
				materiasFin();
				
				System.out.println("El tamaño del arreglo ahora es: " +materiasCopia.length);
				
			}
		}
		int creditos = 0;
		for(int i = 0; i < cantMaterias; i++) {
			creditos = creditos + materias[i].numCreditos;
		}
		creditos = creditos + a.numCreditos;
		if(creditos > numCreditos ) {
			throw new CreditosInsuficientesException("El estudiante no tiene creditos disponibles para inscribir la materia " +a.nombre);
		}
		materias[cantMaterias] = a;
		cantMaterias++;
	}
	
	//Promedios Semestre
	float calPromedio() {
		float prom = 0;
		for(int i = 0; i<cantMaterias; i++) {
			prom = prom + materias[i].notas;
		}
		return prom / cantMaterias;
	}

	//Notas/Materias Perdidas:
	int calNotPerdida() {
		int nota = 0;
		for(int j = 0; j<cantMaterias; j++) {
			if(materias[j].notas < 3) {
			nota = nota + 1;
			}
		}
		return nota;
	}
	
	//Notas/Materias Ganadas:
	int calNotGanada() {
		int nota = 0;
		for(int k = 0; k<cantMaterias; k++) {
			if(materias[k].notas > 3) {
			nota = nota + 1;
			}
		}
		return nota;
	}
	
	//Creditos Perdidos:
	int calPerCredito() {
		int credito = 0;
		for(int l = 0; l<cantMaterias; l++) {
			if(materias[l].notas < 3)	{
				credito = credito + materias[l].numCreditos;
			}
		}
		return credito;
	}
	
	//Dinero por Creditos:
	int calDinero() {
		int dinero = 0;
		for(int m = 0; m<cantMaterias; m++) {
			if(materias[m].notas < 3) {
				dinero = (int) (dinero + (materias[m].numCreditos * materias[m].valCreditos));
			}
		}
		return dinero;
	}

	
	
	
}


	


	


	

