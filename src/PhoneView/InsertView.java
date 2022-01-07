package PhoneView;

import Main.R;
import model.PhoneVo;

public class InsertView extends View {
	public void display() {
		System.out.println("------------- 전화번호부 입력 -------------");
		System.out.println("성명 입력 >> ");
		String name = scan.next();
		System.out.print("전화 입력 >> ");
		String phone = scan.next();
		System.out.print("주소 입력 >>>");
		String address = scan.next();
		System.out.print("이메일 >> ");
		String email = scan.next();
		R.PhoneVo = new PhoneVo(0, name, phone, address, email);
		System.out.println("입력 완료!");
	}
}
