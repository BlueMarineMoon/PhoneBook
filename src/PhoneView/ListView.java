package PhoneView;

import Main.R;
import model.PhoneVo;

public class ListView extends View{
	@Override
	public void display() {
		System.out.println("-------------- ��ȭ��ȣ ����Ʈ --------------");
		for(PhoneVo Phone : R.PhoneArr) {
			System.out.println(Phone);
		}
	}
}
