

public class DynamicStack <E> implements Stack<E> {

	private static class Node<E>{
		private E element; //Valor
		private Node<E> next; //Puntero en la lista
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public E getElement() {
			return element;
		}
		public void setElement(E element) {
			this.element = element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
	
	}
	
	 public int size=0;
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}
	private Node<E> header = null;// Referencia
	private Node<E> trailer = null;
	@Override
	public void push(E e) {
		Node<E> nAux = null;
		nAux.setElement(e);
		nAux.setNext(null);
		if(isEmpty()) {
			header = nAux;
			trailer= header;
			size ++;
		}else {
			Node<E> nfinal;
			nfinal = top2(); // devuelve el ultimo elemento en la pila
			nfinal.setNext(nAux);
			trailer = nfinal.getNext();
			size++;
		}
	}

	@Override
	public E top() {
        Node<E> nAux = header;

         while (nAux.getNext() != null) //Mientras el nodo siguiente de cada nodo, no sea nulo, se realizara
         {
             nAux = nAux.getNext();
         }

         return (E) nAux.getElement(); // Retorna el elemento al final de la pila
	}
	public Node<E> top2() {
        Node<E> nAux = header;

         while (nAux.getNext() != null) //Mientras el nodo siguiente de cada nodo, no sea nulo, se realizara
         {
             nAux = nAux.getNext();
         }

         return  nAux; // Retorna el elemento al final de la pila
	}
	public Node<E> top3() {// se queda en el penultimo
        Node<E> nAux = header;
        Node<E> nPenUltimo = null;
       
        
         while (nAux.getNext() != null) //Mientras el nodo siguiente de cada nodo, no sea nulo, se realizara
         {
        	 nPenUltimo = nAux;
             nAux = nAux.getNext();
         }

         return  nPenUltimo; // Retorna el elemento al final de la pila
	}

	@Override
	public E pop() {
		E temp = trailer.getElement();
		trailer = top3(); //cambia trailer
		trailer.setNext(null);
		// elimina al elemento
		size--; // porque se esta borrando el último
		return temp;
	}
	

}
