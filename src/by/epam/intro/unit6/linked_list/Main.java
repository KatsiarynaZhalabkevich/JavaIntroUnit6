package by.epam.intro.unit6.linked_list;

public class Main {

	public static void main(String[] args) {
		LinkedContainer<String> list = new LinkedContainer<>();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		
		System.out.println(list.size());
		//System.out.println(list.getElementByIndex(3));
		
		for (String s : list) {
			System.out.println(s);
		}
	}

}
