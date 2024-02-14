package ex02;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListCollection {

	public static void main(String[] args) {
		//ArrayList와 LinkedList는 사용법이 같지만 저장되는 메모리구조가 다르다.
		
//		ArrayList<String> list = new ArrayList<String>();
		LinkedList<String> list = new LinkedList<String>();
		//문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
			
		}
		System.out.println();
		
		//향상된 for문 이용
		for(String str : list) {
			System.out.print(str + " ");
		}
		
		//삭제
		list.remove(0);
		System.out.println();
		
		for(String str : list) {
			System.out.print(str + " ");
		}

	}

}
