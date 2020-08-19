package poo_tarea1;

//Clase
public class Alumnos {
	
	 //Atributos
	String nombre;
	
	//Arreglos
	static final int MAX_MATERIAS = 8;
	static final int MAX_CREDITOS = 4;
	
	Materias[] materias = new Materias[Alumnos.MAX_MATERIAS];
	int cantMaterias = 0;
	Materias[] creditos = new Materias[Alumnos.MAX_CREDITOS];
	int cantCreditos = 0;
	
	
	//Métodos
	
	//Añadir Materias
	public void AddMaterias(Materias a) throws Exception {
		if(cantMaterias == MAX_MATERIAS) {
			throw new Exception("El alumno ya inscribio la cantidad maxima de materias");
		}
		
		materias[cantMaterias] = a;
		cantMaterias++;
	}
	
	//Añadir Creditos
	public void AddCreditos(Materias a) throws Exception {
		for (int s = 0; s<cantCreditos; s++) {
			if(materias[s].creditos == MAX_CREDITOS) {
				throw new Exception("El alumno ya no tiene creditos disponibles para inscribir materias");
			}
		}
		
		materias[cantCreditos] = a;
		cantCreditos++;
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
				credito = credito + materias[l].creditos;
			}
		}
	
		return credito;
	}
	

	//Dinero por Creditos:
	int calDinero() {
		int dinero = 0;
		for(int m = 0; m<cantMaterias; m++) {
			if(materias[m].notas < 3) {
				dinero = (int) (dinero + (materias[m].creditos * materias[m].valCreditos));
			}
			
		}
		
		return dinero;
	}
	
	
}
	



	


	

