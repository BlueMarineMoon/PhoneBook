package PhoneView;

import Main.R;
import model.PhoneVo;

public class DeleteView extends View {
	@Override
	public void display() {
		System.out.println("------------- 전화번호부 삭제 -------------");

		if (R.type == R.SEARCH) {
			System.out.println("누구의 정보를 삭제하시겠습니까 ?");
			System.out.println("삭제 할 이름 >> ");
			String name = scan.next();
			R.PhoneVo = new PhoneVo(0, name, null, null, null);
		}
	}
}

