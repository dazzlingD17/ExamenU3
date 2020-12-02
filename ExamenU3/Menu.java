package examenu3;

import java.util.Scanner;
import Colas.ColaDinamica;
import Colas.ColaVIP;

public class Menu {
	
	Scanner leer = new Scanner(System.in);
	int opc;
	
	public void Menu() {
		
		boolean X = true;
		String [] cliente = {"V.I.P.","Cliente común"};
		
		int turno = 1;
		int numero = 0;
		int opc;
		//Instancias
		ColaVIP cv = new ColaVIP();
		ColaDinamica cd = new ColaDinamica();
	
		while(X) {
		System.out.println("\n");
		System.out.println("-----MENU----- ");
                System.out.println("\n Elija una opcion: ");
		System.out.println(" [1] Nuevo Cliente ");
		System.out.println(" [2] Pasar a Ventanilla ");
		System.out.println(" [3] Mostrar Colas ");
		System.out.println(" [4] Salir ");
		opc = leer.nextInt();
		
		switch (opc) {
		case 1:
			
				numero = (int)(Math.random() * 2);
				if(numero == 0) {
					cv.Empujar(cliente[0], turno++);
					
					
				}else {
					cd.Empujar(cliente[1],turno++);
					
								
			}
				cv.MostrarCola();
				cd.MostrarCola();
			
		break;
		case 2:
			String []Ventanilla = new String [3];
			
			for(int i = 0; i < 3; i++ ) {
				if(!cv.EstaVacia()) {
				
				cv.SacarCola();
                        System.out.println("|          Ventanilla 1           |          Ventanilla 2          |          Ventanilla 3          |");
			System.out.println(" "+Ventanilla[0]+"  "+Ventanilla[1]+"  "+Ventanilla[2]);
			
			
				
				}else {
					
					cd.SacarCola();
				}
				
			}
			
			
				
		break;
		case 3:
			cd.MostrarCola();
			System.out.println();
			cv.MostrarCola();
		break;
		case 4:
			X = false;
			System.out.println("");
		break;
		

		default:
			System.out.println("Opcion no valida ");
			break;
		}
	}
	}
	
}
