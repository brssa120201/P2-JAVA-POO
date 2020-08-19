package poo_tarea1;

public class Programa {

	public static void main(String[] args) throws Exception {
		
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
		ma4.notas = (float) 4.5;
		ma4.creditos = 4;
		ma4.valCreditos = 1500;
		
		Materias ma5 = new Materias();
		ma5.nombre = "Electronica";
		ma5.notas = 2;
		ma5.creditos = 2;
		ma5.valCreditos = 3700;
		
		//Arreglos
		a1.AddMaterias(ma1);
		a1.AddCreditos(ma1);
		a1.AddMaterias(ma2);
		a1.AddCreditos(ma2);
		a1.AddMaterias(ma3);
		a1.AddCreditos(ma3);
		a1.AddMaterias(ma4);
		a1.AddCreditos(ma4);
		a1.AddMaterias(ma5);
		a1.AddCreditos(ma5);
								
						
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
		Materias ma6 = new Materias();
		ma6.nombre = "Programación";
		ma6.notas = 1;
		ma6.creditos = 2;
		ma6.valCreditos = 1000;
		
		Materias ma7 = new Materias();
		ma7.nombre = "Ingles";
		ma7.notas = 2;
		ma7.creditos = 3;
		ma7.valCreditos = 5000;
		
		Materias ma8 = new Materias();
		ma8.nombre = "Matematicas";
		ma8.notas = 1;
		ma8.creditos = 1;
		ma8.valCreditos = 4000;
		
		Materias ma9 = new Materias();
		ma9.nombre = "Desarrollo";
		ma9.notas = 5;
		ma9.creditos = 2;
		ma9.valCreditos = 4500;
		
		Materias ma10 = new Materias();
		ma10.nombre = "Electronica";
		ma10.notas = 4;
		ma10.creditos = 2;
		ma10.valCreditos = 6700;
			
		//Arreglos
		a2.AddMaterias(ma6);
		a2.AddCreditos(ma6);
		a2.AddMaterias(ma7);
		a2.AddCreditos(ma7);
		a2.AddMaterias(ma8);
		a2.AddCreditos(ma8);
		a2.AddMaterias(ma9);
		a2.AddCreditos(ma9);
		a2.AddMaterias(ma10);
		a2.AddCreditos(ma10);
		
					
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
		Materias ma11 = new Materias();
		ma11.nombre = "Programación";
		ma11.notas = 5;
		ma11.creditos = 3;
		ma11.valCreditos = 5000;
		
		Materias ma12 = new Materias();
		ma12.nombre = "Ingles";
		ma12.notas = 2;
		ma12.creditos = 3;
		ma12.valCreditos = 9000;
		
		Materias ma13 = new Materias();
		ma13.nombre = "Matematicas";
		ma13.notas = 4;
		ma13.creditos = 2;
		ma13.valCreditos = 8000;
		
		Materias ma14 = new Materias();
		ma14.nombre = "Desarrollo";
		ma14.notas = 1;
		ma14.creditos = 2;
		ma14.valCreditos = 2750;
		
		Materias ma15 = new Materias();
		ma15.nombre = "Electronica";
		ma15.notas = 4;
		ma15.creditos = 4;
		ma15.valCreditos = 8700;
		
			
		//Arreglos
		a3.AddMaterias(ma11);
		a3.AddCreditos(ma11);
		a3.AddMaterias(ma12);
		a3.AddCreditos(ma12);
		a3.AddMaterias(ma13);
		a3.AddCreditos(ma13);
		a3.AddMaterias(ma14);
		a3.AddCreditos(ma14);
		a3.AddMaterias(ma15);
		a3.AddCreditos(ma15);
		
				
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
		Materias ma16 = new Materias();
		ma16.nombre = "Programación";
		ma16.notas = 5;
		ma16.creditos = 2;
		ma16.valCreditos = 15000;
		
		Materias ma17 = new Materias();
		ma17.nombre = "Ingles";
		ma17.notas = (float) 2.5;
		ma17.creditos = 2;
		ma17.valCreditos = 9000;
		
		Materias ma18 = new Materias();
		ma18.nombre = "Matematicas";
		ma18.notas = 2;
		ma18.creditos = 2;
		ma18.valCreditos = 2000;
		
		Materias ma19 = new Materias();
		ma19.nombre = "Desarrollo";
		ma19.notas = 2;
		ma19.creditos = 3;
		ma10.valCreditos = 750;
		
		Materias ma20 = new Materias();
		ma20.nombre = "Electronica";
		ma20.notas = 1;
		ma20.creditos = 6;
		ma20.valCreditos = 700;
		
		//Arreglos
		a4.AddMaterias(ma16);
		a4.AddCreditos(ma16);
		a4.AddMaterias(ma17);
		a4.AddCreditos(ma17);
		a4.AddMaterias(ma18);
		a4.AddCreditos(ma18);
		a4.AddMaterias(ma19);
		a4.AddCreditos(ma19);
		a4.AddMaterias(ma20);
		a4.AddCreditos(ma20);
		
			
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
		Materias ma21 = new Materias();
		ma21.nombre = "Programación";
		ma21.notas = 2;
		ma21.creditos = 3;
		ma21.valCreditos = 10000;
		
		Materias ma22 = new Materias();
		ma22.nombre = "Ingles";
		ma22.notas = 4;
		ma22.creditos = 3;
		ma22.valCreditos = 9000;
		
		Materias ma23 = new Materias();
		ma23.nombre = "Matematicas";
		ma23.notas = 1;
		ma23.creditos = 2;
		ma23.valCreditos = 5000;
		
		Materias ma24 = new Materias();
		ma24.nombre = "Desarrollo";
		ma24.notas = 2;
		ma24.creditos = 2;
		ma24.valCreditos = 2350;
		
		Materias ma25 = new Materias();
		ma25.nombre = "Electronica";
		ma25.notas = 5;
		ma25.creditos = 10;
		ma25.valCreditos = 6700;
		
		//Arreglos
		a5.AddMaterias(ma21);
		a5.AddCreditos(ma21);
		a5.AddMaterias(ma22);
		a5.AddCreditos(ma22);
		a5.AddMaterias(ma23);
		a5.AddCreditos(ma23);
		a5.AddMaterias(ma24);
		a5.AddCreditos(ma24);
		a5.AddMaterias(ma25);
		a5.AddCreditos(ma25);

		
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