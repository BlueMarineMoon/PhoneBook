package PhoneView;

import Main.R;
import model.PhoneVo;

public class InsertView extends View {
	public void display() {
		System.out.println("------------- ��ȭ��ȣ�� �Է� -------------");
		System.out.println("���� �Է� >> ");
		String name = scan.next();
		System.out.print("��ȭ �Է� >> ");
		String phone = scan.next();
		System.out.print("�ּ� �Է� >>>");
		String address = scan.next();
		System.out.print("�̸��� >> ");
		String email = scan.next();
		R.PhoneVo = new PhoneVo(0, name, phone, address, email);
		System.out.println("�Է� �Ϸ�!");
	}
}
