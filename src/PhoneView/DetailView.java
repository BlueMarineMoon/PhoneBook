package PhoneView;

import Main.R;
import model.PhoneVo;

public class DetailView extends View {
	@Override
	public void display() {
		if(R.type == R.SEARCH) {
			System.out.println("------------- ��ȭ��ȣ�� �˻� -------------");
			System.out.println("�˻� �� �̸� >> ");
			String name = scan.next();
			R.PhoneVo = new PhoneVo(0, name, null, null, null);
		} else {
			System.out.println("------------- ��ȭ��ȣ�� �󼼰˻� -------------");
			System.out.println(R.PhoneVo);
		}
	}
}
