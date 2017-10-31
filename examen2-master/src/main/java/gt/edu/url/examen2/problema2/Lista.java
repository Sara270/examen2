/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema2;

/**
 *
 * @author Sara
 */
public class Lista<E> implements List<E> {
		private int cima=1;
    private int limite = 15;
    private int valor;
    private E[] arreglo;
    private Boolean vacio;
    private Boolean lleno;
	
	
	public int size() {	
		return arreglo.length;
	}

	public boolean isEmpty() {
		if (cima == 1) // verifica que no haya ningun elemento
        {
            vacio = true;
        }
        else
        {
            vacio = false;
        }
		return vacio;

	}

	
	public E get(int i) {
		E temp = arreglo[i];
		return temp;
	}

	@SuppressWarnings("unchecked")
	
	public E set(int i, Object e) {
		E temp = arreglo[i];
		arreglo[i] = (E) e;
		return temp;
	}

	
	public void add(int i, Object e) {
		 if (isEmpty())
         {	 
             arreglo[i] = (E) e;
             cima++;
         }
         else
         {
        	 for (int i1 = cima; i1 >= i; i1= i1--) // se le va a restar una posición, para correr el resto a la derecha
             {
               arreglo[i1 + 1] =  arreglo[i1];  
             }
             arreglo[i] = (E) e;
             cima++; // porque crecio el arreglo
         }
	}

	
	public E remove(int i) throws IndexOutOfBoundsException {
		 
		E temp = null;
		 
		 if (isEmpty())
         {
            temp = null;
         }  
         else
         {
        	if(arreglo[i] == null) {
        		temp = null;
        	}else {
        	    temp = arreglo[i];
        	    for (int i1 = i; i1 < cima; i1++) // se le va a restar una posición, para correr el resto a la izquierda
                {
                  arreglo[i1] = arreglo[i1 + 1];  
                }
        	    arreglo[cima] = null;
        	    cima --;
        	}
         }
       return temp;  
	}

	public int getCima() {
		return cima;
	}

	public void setCima(int cima) {
		this.cima = cima;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public Boolean getVacio() {
		return vacio;
	}

	public void setVacio(Boolean vacio) {
		this.vacio = vacio;
	}

	public Boolean getLleno() {
		return lleno;
	}

	public void setLleno(Boolean lleno) {
		this.lleno = lleno;
	}

}
