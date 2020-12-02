package Colas;
import Nodos.NodoCola1;
public class Colas {
	public  NodoCola1 cima,fin;
	public  int tamanio;
	
	public boolean EstaVacia() {
		return cima == null;
	}
	
	public void Empujar(String elemento, int indice) {
		NodoCola1 nodo = new NodoCola1(elemento,indice);
		if(EstaVacia()) {
			cima = nodo;
		}else {
			fin.siguiente = nodo;
		}
		fin = nodo;
		tamanio++;
	}
	public String SacarCola() {
		if(!EstaVacia()) {
			cima = cima.siguiente;
			tamanio--;
		}else {
			System.out.println("No hay clientes en la cola");
		}
		return null;
	}
	public void MostrarCola() {
		NodoCola1 recorre = cima;
		if(!EstaVacia()) {
			while(recorre!=null) {
				System.out.print(" - Cliente : "+recorre.elemento +", turno: "+ recorre.indice+ " - ");
				recorre = recorre.siguiente;
			}
		}else {
			System.out.println("La cola esta vacía");
		}
		
	}
	public String SacarUnElemento() {
		String a = null;
		NodoCola1 recorre = cima;
		if(!EstaVacia()) {
			
				a= ("-Cliente: "+recorre.elemento +" Turno: "+ recorre.indice+" - ");
				return a;
			
		}else {
			System.out.println("La cola esta vacía");
			
		}
		return a;
	}
	
	
}
