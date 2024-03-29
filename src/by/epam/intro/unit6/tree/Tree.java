package by.epam.intro.unit6.tree;

import java.util.List;

public interface Tree<E> extends Iterable<E> {
	boolean add(E e);
	List<E> get();
	int size();
	SimpleTree.Leaf find(E e);

}
