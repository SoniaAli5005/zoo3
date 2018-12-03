package zooExercise;

import java.util.ArrayList;

public class ZooMain {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Black", "F", "  Cat", "Cat","Tibbles",1,3);
		//Zoo zoo = new Zoo();
		ArrayList<Animals> zoo = new ArrayList<Animals>();
		zoo.add(cat1);
		//cat1.sound();
	//	cat1.toString();
		for(Animals a : zoo) {
			System.out.println(a);
		}
	}
}
