package by.epam.intro.unit6.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SimpleTree<E> implements Tree<E> {
	private Leaf<E> root;
	private List<E> list;
	private int size = 0;

	public SimpleTree() {
		list = new LinkedList<>();
		root = new Leaf<>(null);
	}
	

	class Leaf<E> implements Comparable<E> {
		private Leaf<E> parent;
		private Leaf<E> right;
		private Leaf<E> left;
		private E element;

		private Leaf(E element) {
			this.element = element;
		}

		public E getElement() {
			return element;
		}

		@Override
		public int compareTo(Object o) {
			Leaf<E> node = (Leaf<E>) o;
			return this.hashCode() - node.hashCode();
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((element == null) ? 0 : element.hashCode());
			return result;
		}

	}


	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean add(E e) {
		if (size == 0) {
			return initRootLeaf(e);
		}
		
		Leaf<E> newNode = new Leaf<>(e);
		Leaf<E> lastNode = findLastLeaf(root, newNode); 
		
		if (lastNode == null) {return false;}
		size++;
		newNode.parent = lastNode;
		if (lastNode.compareTo(newNode)<0) {
			lastNode.right = newNode;
			return true;
		}else {
			lastNode.left = newNode;
			return true;
		}
		
	}
	//поиск места для нового узла
	private Leaf<E> findLastLeaf(final Leaf<E> oldLeaf, final Leaf<E> newLeaf){
		int compare = oldLeaf.compareTo(newLeaf);
		Leaf<E> lastLeaf = oldLeaf;
		if(compare<0&&oldLeaf.right!=null) {
			lastLeaf = findLastLeaf(oldLeaf.right, newLeaf);
			return lastLeaf;
		}
		if(compare>0&&oldLeaf.left!=null) {
			lastLeaf = findLastLeaf(oldLeaf.left, newLeaf);
			return lastLeaf;
		}
		if(compare ==0) return null;
		return lastLeaf;
	}
	
	private boolean initRootLeaf(final E e) {
		root.element = e;
				size++;
		return true;
	}


	@Override
	public List<E> get() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Leaf find(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
