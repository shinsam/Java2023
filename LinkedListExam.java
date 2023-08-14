package s0814;

import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		//리스트에 친구 이름 3개 넣기
		list.add("구예성");
		list.add("권순호");
		list.add("김동현");
		//리스트 전체 데이터 출력하기
		System.out.println(list.toString());
		//리스트의 첫번째 값 출력하기
		System.out.println(list.getFirst());
		//리스트의 마지막 값 출력하기
		System.out.println(list.getLast());
		//리스트의 맨앞에 "김기훈" 넣기
		list.addFirst("김기훈");
		//리스트의 맨뒤에 "박승철" 넣기
		list.addLast("박승철");
		//리스트의 데이터 하나씩 출력하기
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("---------------");
		for(int i = 0 ; i < list.size() ; i++)
			System.out.println(list.get(i));
		
		
	}

}
