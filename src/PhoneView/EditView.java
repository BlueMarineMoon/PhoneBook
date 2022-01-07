package PhoneView;

import Main.R;
import model.PhoneVo;

public class EditView extends View {
	@Override
	public void display() {
		System.out.println("----------------- 전화번호 수정 -----------------");
		
		
		while(R.type == R.SEARCH) {
			System.out.println("누구의 정보를 수정하시겠습니까 ?");
			System.out.println("수정 할 정보 >> ");
			String name = scan.next();
			R.PhoneVo = new PhoneVo(0, name, null, null, null);
			break;
		}
					
		while(true) {
			System.out.print("어떤 정보를 수정할까요? 1.이름 2.번호 3.주소 4.이메일");
			int select = scan.nextInt();
			if(select == 1) {
				System.out.print("새로운 이름을 입력하세요");
				String name = scan.next();
				R.PhoneVo.setName(name);
				break;
			} else if (select == 2) {
				System.out.print("새로운 번호 >> ");
				String phone = scan.next();
				R.PhoneVo.setPhone(phone);
				break;
			} else if (select == 3) {
				System.out.print("새로운 이메일 >> ");
				String address = scan.next();
				R.PhoneVo.setAddress(address);
				break;
			} else if (select == 4) {
				System.out.print("새로운 이메일 >> ");
				String email = scan.next();
				R.PhoneVo.setEmail(email);
				break;
			} else {
				System.out.print("잘못 입력하셨습니다. 번호를 다시 입력해주세요.\n");
						
			}
			
		}
		
	}
}

