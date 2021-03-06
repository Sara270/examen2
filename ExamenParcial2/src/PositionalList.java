
public interface PositionalList<E> {
	int size( );
	boolean isEmpty( );
	Position<E> first( );
	Position<E> last( );
	Position<E> addFirst(E e);
	Position<E> addLast(E e);
	Position<E> before(Position<E> p) throws IllegalArgumentException;
	Position<E> after(Position<E> p) throws IllegalArgumentException;
	Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;
	Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;
	E set(Position<E> p, E e) throws IllegalArgumentException;
	E remove(Position<E> p) throws IllegalArgumentException;
        //Metodo a implementar problema 3
        void swap(Position<E> p, Position<E> q);
        //Metodo a implementar problema 4
        Position<E> positionAtIndex(int i);
}
