package s0814;

import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		//����Ʈ�� ģ�� �̸� 3�� �ֱ�
		list.add("������");
		list.add("�Ǽ�ȣ");
		list.add("�赿��");
		//����Ʈ ��ü ������ ����ϱ�
		System.out.println(list.toString());
		//����Ʈ�� ù��° �� ����ϱ�
		System.out.println(list.getFirst());
		//����Ʈ�� ������ �� ����ϱ�
		System.out.println(list.getLast());
		//����Ʈ�� �Ǿտ� "�����" �ֱ�
		list.addFirst("�����");
		//����Ʈ�� �ǵڿ� "�ڽ�ö" �ֱ�
		list.addLast("�ڽ�ö");
		//����Ʈ�� ������ �ϳ��� ����ϱ�
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("---------------");
		for(int i = 0 ; i < list.size() ; i++)
			System.out.println(list.get(i));
		
		
	}

}
