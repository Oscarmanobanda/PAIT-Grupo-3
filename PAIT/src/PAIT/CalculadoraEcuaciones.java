package PAIT;

import java.util.Scanner;

public class CalculadoraEcuaciones {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner (System.in);
		System.out.println("Calculadora de sistemas de ecuaciones 2x2");
		
	System.out.println("--- Solucionador de Sistemas 2x2 ---");
	System.out.println("Ecuación 1: a1(x) + b1(y) = c1");
	System.out.println("Ecuación 2: a2(x) + b2(y) = c2");


	try {
	    System.out.print("Ingrese a1: ");
	    double a1 = sc.nextDouble();
	    System.out.print("Ingrese b1: ");
	    double b1 = sc.nextDouble();
	    System.out.print("Ingrese c1: ");
	    double c1 = sc.nextDouble();

	    System.out.print("Ingrese a2: ");
	    double a2 = sc.nextDouble();
	    System.out.print("Ingrese b2: ");
	    double b2 = sc.nextDouble();
	    System.out.print("Ingrese c2: ");
	    double c2 = sc.nextDouble();

	    
	    double detPrincipal = (a1 * b2) - (a2 * b1);

	    if (detPrincipal != 0) {
	    	
	       
	        double x = ((c1 * b2) - (c2 * b1)) / detPrincipal;
	        double y = ((a1 * c2) - (a2 * c1)) / detPrincipal;

	        System.out.println(" Solución única ");
	        System.out.printf("x = %.4f%n", x);
	        System.out.printf("y = %.4f%n", y);
	    } else {
	        
	        if ((a1 / a2 == b1 / b2) && (a1 / a2 == c1 / c2)) {
	            System.out.println("El sistema tiene infinitas soluciones.");
	        } else {
	            System.out.println("El sistema no tiene solución (Rectas paralelas).");
	        }
	    }
	}catch (Exception e) {
	    System.out.println("Error: Por favor ingrese valores numéricos válidos.");
	} finally {
		
	}
	    sc.close();
		}
	}
