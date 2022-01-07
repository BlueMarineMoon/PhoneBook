package PhoneView;

import Main.R;
import model.PhoneVo;

public class ListView extends View{
	@Override
	public void display() {
		System.out.println("-------------- 전화번호 리스트 --------------");
		for(PhoneVo Phone : R.PhoneArr) {
			System.out.println(Phone);
		}
	}
}
