package poo_tarea1;

public class Programa {

	public static void main(String[] args) throws Exception {
			
		//Objetos Alumnos
		Alumnos a1 = new Alumnos();
		a1.nombre = "Lucia";
		a1.numCreditos = 20;
		Alumnos a2 = new Alumnos();
		a2.nombre = "Juan";
		a2.numCreditos = 20;
		Alumnos a3 = new Alumnos();
		a3.nombre = "Lola";
		a3.numCreditos = 20;
		Alumnos a4 = new Alumnos();
		a4.nombre = "Susi";
		a4.numCreditos = 20;
		Alumnos a5 = new Alumnos();
		a5.nombre = "Toño";
		a5.numCreditos = 20;
		
		//Objetos Materias 
		Materias ma1 = new Materias();
		ma1.nombre = "Ecuaciones Diferenciales";
		ma1.notas = 1;
		ma1.numCreditos = 2;
		ma1.valCreditos = 2000;
		
		Materias ma2 = new Materias();
		ma2.nombre = "Telematica";
		ma2.notas = 5;
		ma2.numCreditos = 3;
		ma2.valCreditos = 3000;
		
		Materias ma3 = new Materias();
		ma3.nombre = "Bases de datos";
		ma3.notas = 4;
		ma3.numCreditos = 1;
		ma3.valCreditos = 4000;
		
		Materias ma4 = new Materias();
		ma4.nombre = "Teoria de Señales";
		ma4.notas = (float) 4.5;
		ma4.numCreditos = 4;
		ma4.valCreditos = 1500;
		
		Materias ma5 = new Materias();
		ma5.nombre = "Redes";
		ma5.notas = 2;
		ma5.numCreditos = 2;
		ma5.valCreditos = 3700;
				
		Materias ma6 = new Materias();
		ma6.nombre = "Programación 4";
		ma6.notas = 1;
		ma6.numCreditos = 2;
		ma6.valCreditos = 1000;
		
		Materias ma7 = new Materias();
		ma7.nombre = "Ingles 4";
		ma7.notas = 2;
		ma7.numCreditos = 3;
		ma7.valCreditos = 5000;
		
		Materias ma8 = new Materias();
		ma8.nombre = "Matematicas Especiales";
		ma8.notas = 1;
		ma8.numCreditos = 1;
		ma8.valCreditos = 4000;
		
		Materias ma9 = new Materias();
		ma9.nombre = "Arquitectura de Software";
		ma9.notas = 5;
		ma9.numCreditos = 2;
		ma9.valCreditos = 4500;
		
		Materias ma10 = new Materias();
		ma10.nombre = "Microcontroladores";
		ma10.notas = 4;
		ma10.numCreditos = 1;
		ma10.valCreditos = 6700;
		
		Materias ma11 = new Materias();
		ma11.nombre = "Programación 3";
		ma11.notas = 5;
		ma11.numCreditos = 3;
		ma11.valCreditos = 5000;
		
		Materias ma12 = new Materias();
		ma12.nombre = "Ingles 3";
		ma12.notas = 2;
		ma12.numCreditos = 3;
		ma12.valCreditos = 9000;
		
		Materias ma13 = new Materias();
		ma13.nombre = "Desarrollo de Software";
		ma13.notas = 4;
		ma13.numCreditos = 2;
		ma13.valCreditos = 8000;
		
		Materias ma14 = new Materias();
		ma14.nombre = "Ondas Electromagneticas";
		ma14.notas = 1;
		ma14.numCreditos = 2;
		ma14.valCreditos = 2750;
		
		Materias ma15 = new Materias();
		ma15.nombre = "Sistemas Operativos";
		ma15.notas = 4;
		ma15.numCreditos = 4;
		ma15.valCreditos = 8700;
		
		Materias ma16 = new Materias();
		ma16.nombre = "Programación 2";
		ma16.notas = 5;
		ma16.numCreditos = 2;
		ma16.valCreditos = 15000;
		
		Materias ma17 = new Materias();
		ma17.nombre = "Ingles 2";
		ma17.notas = (float) 2.5;
		ma17.numCreditos = 2;
		ma17.valCreditos = 9000;
		
		Materias ma18 = new Materias();
		ma18.nombre = "Matematicas Discretas";
		ma18.notas = 2;
		ma18.numCreditos = 2;
		ma18.valCreditos = 2000;
		
		Materias ma19 = new Materias();
		ma19.nombre = "Ingenieria de requerimientos";
		ma19.notas = 2;
		ma19.numCreditos = 3;
		ma10.valCreditos = 750;
		
		Materias ma20 = new Materias();
		ma20.nombre = "Circuitos";
		ma20.notas = 1;
		ma20.numCreditos = 6;
		ma20.valCreditos = 700;
		
		Materias ma21 = new Materias();
		ma21.nombre = "Programación 1";
		ma21.notas = 2;
		ma21.numCreditos = 3;
		ma21.valCreditos = 10000;
		
		Materias ma22 = new Materias();
		ma22.nombre = "Ingles 1";
		ma22.notas = 4;
		ma22.numCreditos = 3;
		ma22.valCreditos = 9000;
		
		Materias ma23 = new Materias();
		ma23.nombre = "Introducción a Ingenieria";
		ma23.notas = 1;
		ma23.numCreditos = 2;
		ma23.valCreditos = 5000;
		
		Materias ma24 = new Materias();
		ma24.nombre = "Matematicas";
		ma24.notas = 2;
		ma24.numCreditos = 2;
		ma24.valCreditos = 2350;
		
		Materias ma25 = new Materias();
		ma25.nombre = "Algebra Lineal";
		ma25.notas = 5;
		ma25.numCreditos = 1;
		ma25.valCreditos = 6700;
	
		Materias ma26 = new Materias();
		ma26.nombre = "Fisica";
		ma26.notas = (float) 3.8;
		ma26.numCreditos = 2;
		ma26.valCreditos = 8700;
			
		try {
			a1.AddMaterias(ma1);
			a1.AddMaterias(ma2);
			a1.AddMaterias(ma3);
			a1.AddMaterias(ma4);
			a1.AddMaterias(ma5);
			a1.AddMaterias(ma26);//Materia que anexa el alumno
			
			System.out.println("----------------------------------------------------");
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
			
			a2.AddMaterias(ma6);
			a2.AddMaterias(ma7);
			a2.AddMaterias(ma8);
			a2.AddMaterias(ma9);
			a2.AddMaterias(ma10);
									
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
					
			a3.AddMaterias(ma11);
			a3.AddMaterias(ma12);
			a3.AddMaterias(ma13);
			a3.AddMaterias(ma14);
			a3.AddMaterias(ma15);
			
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
					
			a4.AddMaterias(ma16);
			a4.AddMaterias(ma17);
			a4.AddMaterias(ma18);
			a4.AddMaterias(ma19);
			a4.AddMaterias(ma20);
			
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
					
			a5.AddMaterias(ma21);
			a5.AddMaterias(ma22);
			a5.AddMaterias(ma23);
			a5.AddMaterias(ma24);
			a5.AddMaterias(ma25);
			
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

			
		} catch (MaxMateriasException mme) {
			System.out.println(mme.getMessage());
		} catch (CreditosInsuficientesException cie) {
			System.out.println(cie.getMessage());
		} catch (Exception e) {
			System.out.println("Ocurrio un error inesperado");
		}

	
	}
	
	
	

}

	
	