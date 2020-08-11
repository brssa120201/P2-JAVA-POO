package poo_tarea1;
/*
 * ENTREGAR: 9 AGOSTO
 * Realizar un programa que realice unos calculos con las notas de unas
 * asignaturas pertenecientes a un estudiante. Cálculos:
 * 1. Promedio del semestre: OK
 * 2. Cuántas notas/asignaturas perdió OK
 * 3. Cuántas asignaturas ganó OK
 * 4. Cada asignatura tiene un número de créditos, se debe indicar cuántos créditos
 * perdió y cuánto dinero debe pagar para repetir los créditos/asignatura. OK * 
 * 5. Crear al menos 5 estudiantes con diferentes valores OK
 * 6. Crear el proyecto en GitHub
 * 
 * ENTREGAR 13 AGOSTO
 * 7. Cambiar el proyecto para que funcione con arreglos OK
 * No permitir asignaturas repetidas OK
 * */
public class Programa {

	public static void main(String[] args) {
		
		//Objetos Alumnos
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
		
		//Alumno 1
		//Objetos Materias 
		Materias ma1 = new Materias();
		ma1.nombre = "Programación";
		ma1.notas = 1;
		ma1.creditos = 2;
		ma1.valCreditos = 2000;
		
		Materias ma2 = new Materias();
		ma2.nombre = "Ingles";
		ma2.notas = 5;
		ma2.creditos = 3;
		ma2.valCreditos = 3000;
		
		Materias ma3 = new Materias();
		ma3.nombre = "Matematicas";
		ma3.notas = 4;
		ma3.creditos = 1;
		ma3.valCreditos = 4000;
		
		Materias ma4 = new Materias();
		ma4.nombre = "Desarrollo";
		ma4.notas = 2;
		ma4.creditos = 4;
		ma4.valCreditos = 1500;
		
		Materias ma5 = new Materias();
		ma5.nombre = "Electronica";
		ma5.notas = 2;
		ma5.creditos = 4;
		ma5.valCreditos = 3700;
		
		Materias ma6 = new Materias();
		ma6.nombre = "Circuitos";
		ma6.notas = 1;
		ma6.creditos = 4;
		ma6.valCreditos = 2800;
		
		//Arreglos
		a1.materias[0] = ma1;
		a1.cantMaterias++;
		a1.materias[1] = ma2;
		a1.cantMaterias++;
		a1.materias[2] = ma3;
		a1.cantMaterias++;
		a1.materias[3] = ma4;
		a1.cantMaterias++;
		a1.materias[4] = ma5;
		a1.cantMaterias++;
		a1.materias[5] = ma6;
		a1.cantMaterias++;
		
		System.out.println("Alumno 1: " + a1.nombre);
		float promedio = a1.calPromedio();
		System.out.println("El promedio del alumno es: " + promedio);	
		int matperdidas = a1.calNotPerdida();
		System.out.println("La cantidad de materias perdidas es: " +matperdidas);
		int matganadas = a1.calNotGanada();
		System.out.println("La cantidad de materias ganadas es: " +matganadas);
		float creditos = a1.calPerCredito();
		System.out.println("La cantidad de creditos que perdio es: " +creditos);
		float dinero = a1.calDinero();
		System.out.println("La cantidad de dinero que debe pagar es: " +dinero);
		System.out.println("----------------------------------------------------");
		
		
		//Alumno 2
		Materias ma7 = new Materias();
		ma7.nombre = "Programación";
		ma7.notas = 1;
		ma7.creditos = 2;
		ma7.valCreditos = 1000;
		
		Materias ma8 = new Materias();
		ma8.nombre = "Ingles";
		ma8.notas = 2;
		ma8.creditos = 3;
		ma8.valCreditos = 5000;
		
		Materias ma9 = new Materias();
		ma9.nombre = "Matematicas";
		ma9.notas = 1;
		ma9.creditos = 1;
		ma9.valCreditos = 4000;
		
		Materias ma10 = new Materias();
		ma10.nombre = "Desarrollo";
		ma10.notas = 5;
		ma10.creditos = 4;
		ma10.valCreditos = 4500;
		
		Materias ma11 = new Materias();
		ma11.nombre = "Electronica";
		ma11.notas = 4;
		ma11.creditos = 4;
		ma11.valCreditos = 6700;
		
		Materias ma12 = new Materias();
		ma12.nombre = "Circuitos";
		ma12.notas = 5;
		ma12.creditos = 4;
		ma12.valCreditos = 4800;
		
		//Arreglos
		a2.materias[0] = ma7;
		a2.cantMaterias++;
		a2.materias[1] = ma8;
		a2.cantMaterias++;
		a2.materias[2] = ma9;
		a2.cantMaterias++;
		a2.materias[3] = ma10;
		a2.cantMaterias++;
		a2.materias[4] = ma11;
		a2.cantMaterias++;
		a2.materias[5] = ma12;
		a2.cantMaterias++;
				
		System.out.println("Alumno 2: " + a2.nombre);
		float promedio1 = a2.calPromedio();
		System.out.println("El promedio del alumno es: " + promedio1);	
		int matperdidas1 = a2.calNotPerdida();
		System.out.println("La cantidad de materias perdidas es: " +matperdidas1);
		int matganadas1 = a2.calNotGanada();
		System.out.println("La cantidad de materias ganadas es: " +matganadas1);
		float creditos1 = a2.calPerCredito();
		System.out.println("La cantidad de creditos que perdio es: " +creditos1);
		float dinero1 = a2.calDinero();
		System.out.println("La cantidad de dinero que debe pagar es: " +dinero1);
		System.out.println("----------------------------------------------------");
		
		
		//Alumno 3:
		Materias ma13 = new Materias();
		ma13.nombre = "Programación";
		ma13.notas = 5;
		ma13.creditos = 3;
		ma13.valCreditos = 5000;
		
		Materias ma14 = new Materias();
		ma14.nombre = "Ingles";
		ma14.notas = 2;
		ma14.creditos = 3;
		ma14.valCreditos = 9000;
		
		Materias ma15 = new Materias();
		ma15.nombre = "Matematicas";
		ma15.notas = 4;
		ma15.creditos = 2;
		ma15.valCreditos = 8000;
		
		Materias ma16 = new Materias();
		ma16.nombre = "Desarrollo";
		ma16.notas = 1;
		ma16.creditos = 2;
		ma16.valCreditos = 2750;
		
		Materias ma17 = new Materias();
		ma17.nombre = "Electronica";
		ma17.notas = 4;
		ma17.creditos = 4;
		ma17.valCreditos = 8700;
		
		Materias ma18 = new Materias();
		ma18.nombre = "Circuitos";
		ma18.notas = (float) 1.4;
		ma18.creditos = 4;
		ma18.valCreditos = 5600;
		
		//Arreglos
		a3.materias[0] = ma13;
		a3.cantMaterias++;
		a3.materias[1] = ma14;
		a3.cantMaterias++;
		a3.materias[2] = ma15;
		a3.cantMaterias++;
		a3.materias[3] = ma16;
		a3.cantMaterias++;
		a3.materias[4] = ma17;
		a3.cantMaterias++;
		a3.materias[5] = ma18;
		a3.cantMaterias++;
		
		System.out.println("Alumno 3: " + a3.nombre);
		float promedio2 = a3.calPromedio();
		System.out.println("El promedio del alumno es: " + promedio2);	
		int matperdidas2 = a3.calNotPerdida();
		System.out.println("La cantidad de materias perdidas es: " +matperdidas2);
		int matganadas2 = a3.calNotGanada();
		System.out.println("La cantidad de materias ganadas es: " +matganadas2);
		float creditos2 = a3.calPerCredito();
		System.out.println("La cantidad de creditos que perdio es: " +creditos2);
		float dinero2 = a3.calDinero();
		System.out.println("La cantidad de dinero que debe pagar es: " +dinero2);
		System.out.println("----------------------------------------------------");
		
		
		//Alumno 4:
		Materias ma19 = new Materias();
		ma19.nombre = "Programación";
		ma19.notas = 5;
		ma19.creditos = 2;
		ma19.valCreditos = 15000;
		
		Materias ma20 = new Materias();
		ma20.nombre = "Ingles";
		ma20.notas = (float) 2.5;
		ma20.creditos = 2;
		ma20.valCreditos = 9000;
		
		Materias ma21 = new Materias();
		ma21.nombre = "Matematicas";
		ma21.notas = 2;
		ma21.creditos = 2;
		ma21.valCreditos = 2000;
		
		Materias ma22 = new Materias();
		ma22.nombre = "Desarrollo";
		ma22.notas = 2;
		ma22.creditos = 3;
		ma22.valCreditos = 750;
		
		Materias ma23 = new Materias();
		ma23.nombre = "Electronica";
		ma23.notas = 1;
		ma23.creditos = 6;
		ma23.valCreditos = 700;
		
		Materias ma24 = new Materias();
		ma24.nombre = "Circuitos";
		ma24.notas = 5;
		ma24.creditos = 2;
		ma24.valCreditos = 500;
		
		//Arreglos
		a4.materias[0] = ma19;
		a4.cantMaterias++;
		a4.materias[1] = ma20;
		a4.cantMaterias++;
		a4.materias[2] = ma21;
		a4.cantMaterias++;
		a4.materias[3] = ma22;
		a4.cantMaterias++;
		a4.materias[4] = ma23;
		a4.cantMaterias++;
		a4.materias[5] = ma24;
		a4.cantMaterias++;
	
		System.out.println("Alumno 4: " + a4.nombre);
		float promedio3 = a4.calPromedio();
		System.out.println("El promedio del alumno es: " + promedio3);	
		int matperdidas3 = a4.calNotPerdida();
		System.out.println("La cantidad de materias perdidas es: " +matperdidas3);
		int matganadas3 = a4.calNotGanada();
		System.out.println("La cantidad de materias ganadas es: " +matganadas3);
		float creditos3 = a4.calPerCredito();
		System.out.println("La cantidad de creditos que perdio es: " +creditos3);
		float dinero3 = a4.calDinero();
		System.out.println("La cantidad de dinero que debe pagar es: " +dinero3);
		System.out.println("----------------------------------------------------");
		
		
		//Alumno 5:
		Materias ma25 = new Materias();
		ma25.nombre = "Programación";
		ma25.notas = 2;
		ma25.creditos = 3;
		ma25.valCreditos = 10000;
		
		Materias ma26 = new Materias();
		ma26.nombre = "Ingles";
		ma26.notas = 4;
		ma26.creditos = 3;
		ma26.valCreditos = 9000;
		
		Materias ma27 = new Materias();
		ma27.nombre = "Matematicas";
		ma27.notas = 1;
		ma27.creditos = 2;
		ma27.valCreditos = 5000;
		
		Materias ma28 = new Materias();
		ma28.nombre = "Desarrollo";
		ma28.notas = 2;
		ma28.creditos = 2;
		ma28.valCreditos = 2350;
		
		Materias ma29 = new Materias();
		ma29.nombre = "Electronica";
		ma29.notas = 5;
		ma29.creditos = 2;
		ma29.valCreditos = 6700;
		
		Materias ma30 = new Materias();
		ma30.nombre = "Circuitos";
		ma30.notas = 2;
		ma30.creditos = 3;
		ma30.valCreditos = 900;
		
		//Arreglos
		a5.materias[0] = ma25;
		a5.cantMaterias++;
		a5.materias[1] = ma26;
		a5.cantMaterias++;
		a5.materias[2] = ma27;
		a5.cantMaterias++;
		a5.materias[3] = ma28;
		a5.cantMaterias++;
		a5.materias[4] = ma29;
		a5.cantMaterias++;
		a5.materias[5] = ma30;
		a5.cantMaterias++;
	
		System.out.println("Alumno 5: " + a5.nombre);
		float promedio4 = a5.calPromedio();
		System.out.println("El promedio del alumno es: " + promedio4);	
		int matperdidas4 = a5.calNotPerdida();
		System.out.println("La cantidad de materias perdidas es: " +matperdidas4);
		int matganadas4 = a5.calNotGanada();
		System.out.println("La cantidad de materias ganadas es: " +matganadas4);
		float creditos4 = a5.calPerCredito();
		System.out.println("La cantidad de creditos que perdio es: " +creditos4);
		float dinero4 = a5.calDinero();
		System.out.println("La cantidad de dinero que debe pagar es: " +dinero4);
		System.out.println("----------------------------------------------------");
		
}
}