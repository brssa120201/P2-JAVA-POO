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
	
}
