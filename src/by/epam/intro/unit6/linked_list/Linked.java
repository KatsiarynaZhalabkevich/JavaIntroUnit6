package by.epam.intro.unit6.linked_list;

public interface Linked<E> {
	void addLast(E e);

	void addFirst(E e);

	int size();

	E getElementByIndex(int index);

}
