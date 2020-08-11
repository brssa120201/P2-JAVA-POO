package poo_tarea1;

//Clase
public class Alumnos {
	
	//Atributos
	String nombre;
	
	//Arreglos
	Materias[] materias = new Materias[15];
	int cantMaterias = 0;
	
	//Métodos
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
	



	


	

