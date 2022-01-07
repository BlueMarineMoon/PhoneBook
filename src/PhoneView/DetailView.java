package PhoneView;

import Main.R;
import model.PhoneVo;

public class DetailView extends View {
	@Override
	public void display() {
		if(R.type == R.SEARCH) {
			System.out.println("------------- 전화번호부 검색 -------------");
			System.out.println("검색 할 이름 >> ");
			String name = scan.next();
			R.PhoneVo = new PhoneVo(0, name, null, null, null);
		} else {
			System.out.println("------------- 전화번호부 상세검색 -------------");
			System.out.println(R.PhoneVo);
		}
	}
}
