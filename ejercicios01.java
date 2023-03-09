package practica1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Practica1 {
		static void primerMetodo(int x) {
			System.out.println(x);
		}
		// 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
		// Revisar si es un triángulo válido
		static void triangleArea(double x,double y,double z) {
			//confirmar que las entradas no son 0 y no son negativos
			if((x>0 && y>0 &&  z>0)) {
				//utilizar la formula de heron area = 0.25*raiz(a+b+c)*raiz(a-b+c)*raiz(a+b-c)
				//formula para cuando sabes los 3 lados de un triangulo pero no su altura
				double area = (0.25)*(Math.sqrt((x+y+z)))*(Math.sqrt((-x+y+z)))*(Math.sqrt((x-y+z)))*(Math.sqrt((x+y-z)));
				System.out.println(area);
			}else {
				System.out.println("Alguno de los lados es 0 o menor");
			}
		}
		
		// 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
		// Utilizar PI de la libreria de Java
		static void areaCircunference(double radio) {
			//confirmar que las entradas no son 0 y no son negativos
			if(radio>0) {
				//se usa la formula 2*PI*radio = circunferencia
				double circunference = 2*Math.PI*radio;
				//se usa la formula PI*radio*radio
				double area = Math.PI*Math.pow(radio, 2);
				System.out.println("La circunferencia del circulo es "+circunference);
				System.out.println("El area del circulo es: "+area);
			}else {
				System.out.println("El radio es 0 o menor");
			}
		}
		
		// 3 Escribir un metodo que muestre por consola la hora del sistema
		// Utilizar e investigar la libreria de Java
		static void currentHour() {
			
			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
			Date date = new Date(); 
			System.out.println(formatter.format(date));
		}

		// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
		// ej 3600 = "1 hora = 60 min = 3600 seg"
		static void convertSeconds(double seconds) {
			//confirmar que las entradas no son 0 y no son negativos
			if(seconds>0) {
				//recibiendo la entrada como dato double pero realizando la operación transformandolo a int para 
				//solo recibir las horas totales dentro de la entrada estipulada
				int hours = ((int)seconds/3600);
				//recibiendo la entrada como dato double pero realizando la operación transformandolo a int para 
				//solo recibir los minutos totales dentro de la entrada estipulada
				int minutes = ((int)seconds/60);
				System.out.println("Horas: "+hours);
				System.out.println("Minutos: "+minutes);
				//se recibe la entrada pero se tranforma a int para imprimir los segundos totales.
				System.out.println("Segundos: "+(int)seconds);
			}else {
				System.out.println("Los segundos son 0 o menos");
			}
		}
		
		// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
		static void sphereVolumen(double radio) {
			//confirmar que las entradas no son 0 y no son negativos
			if(radio>0) {
				//se utliza la formula volumen=(PI*radio*radio*radio)*(4/3) para el volumend de una esfera
				double volumen = Math.PI*Math.pow(radio,3.0)*(4.0/3.0);
				System.out.println("El volumen de la esfera es: "+volumen);
			}else {
				System.out.println("El radio es 0 o menor");
			}
		}
		
		
		
		// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
		static void coneVolumen(double radio, double height) {
			//confirmar que las entradas no son 0 y no son negativos
			if(radio>0 && height>0) {
				//se utliza la formula volumen=((PI*radio*radio)*altura)/3 para el volumend de un cono
				double volumen = (Math.PI*Math.pow(radio,2)*height)/3.0;
				System.out.println("El volumen de la cono es: "+volumen);
			}else {
				System.out.println("El radio o la altura es 0 o menor");
			}
		}
		
		// 7 Encontrar el area superficial de un cubo dado un lado a
		static void cubeSuperficialArea(double a) {
			//confirmar que las entradas no son 0 y no son negativos
			if(a>0) {
				//se utiliza la formula area = 6*lado*lado para el area total de la superficie de un cubo
				double superficialArea = 6*Math.pow(a, 2);
				System.out.println("El area superficial del cubo es: "+superficialArea);
			}else {
				System.out.println("El lado es 0 o menor");
			}
		}

		// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
		static void isLeapYear(int year){
			//Año bisiesto es el divisible entre 4,
			//salvo que sea año secular -último de cada siglo,
			//terminado en «00»-, en cuyo caso también ha de ser divisible entre 400.
			boolean leap = false;
			// Si el año es divisible entre 4 años
		    if (year % 4 == 0) {

		      // Si el año es divisible entre 100 años
		      if (year % 100 == 0) {

		        // Si el año es divisible entre 400 años
		        // entonces es bisisiesto
		        if (year % 400 == 0)
		          leap = true;
		        else
		          leap = false;
		      }
		      
		      // Si el año no es divisible entre 100 años
		      else
		        leap = true;
		    }
		 // Si el año no es divisible entre 4 años
		    else
		      leap = false;

		    if (leap)
		      System.out.println(year + " es bisiesto.");
		    else
		      System.out.println(year + " no es bisiesto.");
		  }
		

	
	

	public static void main(String[] args) {

		primerMetodo(134);
		
		
		triangleArea(12.2,12.2,12);
		
		areaCircunference(3);
		currentHour();
		convertSeconds(3660.999999);
		sphereVolumen(8);
		coneVolumen(8,18);
		cubeSuperficialArea(5);
		isLeapYear(1900);

	}

}