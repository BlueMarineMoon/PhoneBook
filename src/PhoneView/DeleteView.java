package PhoneView;

import Main.R;
import model.PhoneVo;

public class DeleteView extends View {
	@Override
	public void display() {
		System.out.println("------------- ��ȭ��ȣ�� ���� -------------");

		if (R.type == R.SEARCH) {
			System.out.println("������ ������ �����Ͻðڽ��ϱ� ?");
			System.out.println("���� �� �̸� >> ");
			String name = scan.next();
			R.PhoneVo = new PhoneVo(0, name, null, null, null);
		}
	}
}

