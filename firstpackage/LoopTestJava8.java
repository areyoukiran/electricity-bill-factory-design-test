package firstpackage;

import java.util.ArrayList;

public class LoopTestJava8 {
	public static void main(String[] args) {
		loopListJava8();
	}
	
	public static void loopListJava8() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.forEach(x -> System.out.println(x));
		list.forEach(System.out::println);
	}	
}