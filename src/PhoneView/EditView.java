package PhoneView;

import Main.R;
import model.PhoneVo;

public class EditView extends View {
	@Override
	public void display() {
		System.out.println("----------------- ��ȭ��ȣ ���� -----------------");
		
		
		while(R.type == R.SEARCH) {
			System.out.println("������ ������ �����Ͻðڽ��ϱ� ?");
			System.out.println("���� �� ���� >> ");
			String name = scan.next();
			R.PhoneVo = new PhoneVo(0, name, null, null, null);
			break;
		}
					
		while(true) {
			System.out.print("� ������ �����ұ��? 1.�̸� 2.��ȣ 3.�ּ� 4.�̸���");
			int select = scan.nextInt();
			if(select == 1) {
				System.out.print("���ο� �̸��� �Է��ϼ���");
				String name = scan.next();
				R.PhoneVo.setName(name);
				break;
			} else if (select == 2) {
				System.out.print("���ο� ��ȣ >> ");
				String phone = scan.next();
				R.PhoneVo.setPhone(phone);
				break;
			} else if (select == 3) {
				System.out.print("���ο� �̸��� >> ");
				String address = scan.next();
				R.PhoneVo.setAddress(address);
				break;
			} else if (select == 4) {
				System.out.print("���ο� �̸��� >> ");
				String email = scan.next();
				R.PhoneVo.setEmail(email);
				break;
			} else {
				System.out.print("�߸� �Է��ϼ̽��ϴ�. ��ȣ�� �ٽ� �Է����ּ���.\n");
						
			}
			
		}
		
	}
}

