package s0814;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		ArrayList<String> list = new ArrayList<>();
		//������ �߰�
		list.add("�Ű�ȭ");
		list.add("���缮");
		list.add("�����");
		list.add("���ع�");
		list.add("�̽���");
		System.out.println(list.toString());
		list.remove("���缮");
		System.out.println(list.toString());
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("-----------------");
		// ����Ʈ�� ����ִ� ��� �����͸� �ϳ��� ����ϱ�
		
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-----------------");
		list.clear();
		System.out.println("������ ������" + list.size());
		
		System.out.println("-----------------");
		list.add("����");
		list.add("�κ�");
		if(list.contains("����")== true ) {
			System.out.println("������ �����ϰ� ����");
		}
		
	}

}




