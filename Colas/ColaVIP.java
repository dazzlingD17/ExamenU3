package Colas;
import Nodos.NodoCola2;

public class ColaVIP {
	
	public  NodoCola2 cima,fin;
	public  int tamanio;
	
	public boolean EstaVacia() {
		return cima == null;
	}
	
	public void Empujar(String elemento, int indice) {
		NodoCola2 nodo = new NodoCola2(elemento,indice);
		if(EstaVacia()) {
			cima = nodo;
		}else {
			fin.siguiente =  nodo;
		}
		fin = nodo;
		tamanio++;
	}
	public String SacarCola() {
		if(!EstaVacia()) {
			cima = cima.siguiente;
			tamanio--;
		}else {
			System.out.println("No hay usuarios en la cola VIP");
		}
		return null;
	}
	public void MostrarCola() {
		NodoCola2 recorre = cima;
		if(!EstaVacia()) {
			while(recorre!=null) {
				System.out.print("-Cliente: "+recorre.elemento +" Turno: "+ recorre.indice+" - ");
				recorre = recorre.siguiente;
			}
		}else {
			System.out.println("La cola VIP esta vacía");
		}
		

	}
	public String SacarUnElemento() {
		String v = null;
		NodoCola2 recorre = cima;
		if(!EstaVacia()) {
			
				v= ("-Cliente: "+recorre.elemento +" Turno: "+ recorre.indice+" - ");
				return v;
			
		}else {
			System.out.println("La cola  esta vacía");
			
		}
		return v;
	}

}
