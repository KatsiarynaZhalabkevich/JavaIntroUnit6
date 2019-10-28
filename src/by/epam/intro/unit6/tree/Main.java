package by.epam.intro.unit6.tree;

public class Main {

	public static void main(String[] args) {
		Tree<Integer> tree = new SimpleTree<Integer>();
		
		tree.add(1);
		tree.add(12);
		tree.add(16);
		tree.add(6);
		tree.add(8);
		tree.add(-13);
		tree.add(21);
		
		for (Integer i : tree) {
			System.out.print(i+" ");
		}
		
		System.out.println(tree.find(8));
		

	}

}
