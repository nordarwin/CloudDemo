package Basico001;

import java.util.Scanner;

public class PruebaCuenta {
	
	
	public static void main ( String [] args ) {
		
		Cuenta cuenta1 = new Cuenta( 50.00 );
		Cuenta cuenta2 = new Cuenta( -7.53 );
		
		
		System.out.printf("Saldo de la Cuenta1 $%.2f ", cuenta1.obtenerSaldo());
		
		System.out.printf("Saldo de la Cuenta2 $%.2f ", cuenta2.obtenerSaldo());
		
		
		
		Scanner entrada = new Scanner(System.in);
		double montoDeposito;
		
		System.out.print("Escriba el monto a depositar para Cuenta1: ");
		montoDeposito = entrada.nextDouble();
		System.out.printf("\n Sumando %.2f al saldo de la cuenta1\n\n", montoDeposito);
		cuenta1.abonar(montoDeposito);
		
		
		// nuestra los saldos
		System.out.printf("Saldo de la Cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
		
		System.out.printf("Saldo de la Cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());
		
		
		System.out.print("Escriba el monto a depositar para cuenta2");
		montoDeposito = entrada.nextDouble();
		System.out.printf("\n Sumando %.2f al saldo de la cuenta2\n\n", montoDeposito);
		cuenta2.abonar(montoDeposito);
		
		System.out.printf("Saldo de la Cuenta1: $%.2f\n ", cuenta1.obtenerSaldo());
		
		System.out.printf("Saldo de la Cuenta2: $%.2f\n ", cuenta2.obtenerSaldo());
		
	}

}
