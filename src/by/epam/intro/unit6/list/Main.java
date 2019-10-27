package by.epam.intro.unit6.list;

public class Main {
	public static void main(String[] args) {
        List ml = new List<>();
        ml.addBack(1.0);
        ml.addBack(2);
        ml.addBack("brrr");
        ml.addFront(6);
 
        ml.printList();
        ml.delEl(2);
        System.out.println();
        ml.printList();
        
    }
}
