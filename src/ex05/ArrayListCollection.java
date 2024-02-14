package ex05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListCollection {

	public static void main(String[] args) {
		//ArrayList와 LinkedList 두 클래스 상위클래스인 List사용가능
		
//		ArrayList<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
//		List<String> list = new ArrayList<String>();	
		Set<String> list = new HashSet<String>();		//문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + '\t');
		}

	}

}
