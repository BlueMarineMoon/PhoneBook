package PhoneView;

import Main.R;

public class MenuView extends View {
	@Override
	public void display() {
		System.out.println("------------- 전화번호부 메뉴 -------------");
		int no = 0;
		while (true) {
			try {
				System.out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
				System.out.print("선택: ");
				no = scan.nextInt();
				while(no > 6 || no < 1) {
					System.out.println("범위를 넘었습니다.");
					System.out.print("다시 선택: ");
					no = scan.nextInt();
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력 하세요!");
				scan.next();
				continue;
			}
		} 
		R.no = no;
	}
}