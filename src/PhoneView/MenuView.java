package PhoneView;

import Main.R;

public class MenuView extends View {
	@Override
	public void display() {
		System.out.println("------------- ��ȭ��ȣ�� �޴� -------------");
		int no = 0;
		while (true) {
			try {
				System.out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����");
				System.out.print("����: ");
				no = scan.nextInt();
				while(no > 6 || no < 1) {
					System.out.println("������ �Ѿ����ϴ�.");
					System.out.print("�ٽ� ����: ");
					no = scan.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("���ڸ� �Է� �ϼ���!");
				scan.next();
				continue;
			}
		} 
		R.no = no;
	}
}