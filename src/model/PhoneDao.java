package model;

import java.util.ArrayList;
import java.util.List;

public class PhoneDao {

	private static final int MAX = 100;
	private static final PhoneVo[] PhoneArr = new PhoneVo[MAX];
	public static final String getListView = null;
	private static List<PhoneVo> ListView = new ArrayList<PhoneVo>();
	public static int top = 0;
	public static int sequenceNo = 1;
	
	static {
		PhoneArr[top++] = new PhoneVo(sequenceNo++, "KIM", "010-1111-1111", "서울특별시", "kim@comstudy.org");
		PhoneArr[top++] = new PhoneVo(sequenceNo++, "LEE", "010-2222-2222", "부산광역시", "lee@comstudy.org");
		PhoneArr[top++] = new PhoneVo(sequenceNo++, "PARK", "010-3333-3333", "경기도수원", "park@comstudy.org");
	}

	public PhoneVo[] selectAll() {
		PhoneVo[] newArr = new PhoneVo[top];
		for (int i = 0; i < newArr.length; i++) {
			PhoneVo newPhone = new PhoneVo();
			newPhone.setNo(PhoneArr[i].getNo());
			newPhone.setName(PhoneArr[i].getName());
			newPhone.setPhone(PhoneArr[i].getPhone());
			newPhone.setAddress(PhoneArr[i].getAddress());
			newPhone.setEmail(PhoneArr[i].getEmail());
			newArr[i] = newPhone;
		}
		return newArr;
	}

	public PhoneVo selectOne(PhoneVo vo) {
		for (int i = 0; i < top; i++) {
			if (vo.getName().equals(PhoneArr[i].getName())) {
				PhoneVo newPhone = new PhoneVo();
				newPhone.setNo(PhoneArr[i].getNo());
				newPhone.setName(PhoneArr[i].getName());
				newPhone.setPhone(PhoneArr[i].getPhone());
				newPhone.setAddress(PhoneArr[i].getAddress());
				newPhone.setEmail(PhoneArr[i].getEmail());
				return newPhone;
			}
		}
		return null;
	}

	public PhoneVo selectByNo(int no) {
		for (int i = 0; i < top; i++) {
			if (no == PhoneArr[i].getNo()) {
				PhoneVo newPhone = new PhoneVo();
				newPhone.setNo(PhoneArr[i].getNo());
				newPhone.setName(PhoneArr[i].getName());
				newPhone.setPhone(PhoneArr[i].getPhone());
				newPhone.setAddress(PhoneArr[i].getAddress());
				newPhone.setEmail(PhoneArr[i].getEmail());
				return newPhone;
			}
		}
		return null;
	}

	public void insert(PhoneVo vo) {
		if (top >= MAX) {
			System.out.println(">>> 더이상 입력이 불가능합니다!");
			return;
		}
		vo.setNo(sequenceNo++);
		PhoneArr[top++] = vo;
	}

	public void update(PhoneVo vo) {
		for (int i = 0; i < top; i++) {
			if (PhoneArr[i].getNo() == vo.getNo()) {
				PhoneArr[i] = vo;
			}
		}
	}

	public void delete(PhoneVo vo) {

		for (int i = 0; i < top; i++) {
			if (PhoneArr[i].getNo() == vo.getNo()) {
				for (int j = i; j < top - 1; j++) {
					PhoneArr[j] = PhoneArr[j + 1];
				}
				PhoneArr[top - 1] = null;
				top--;
			}
		}
	}
	
	public List<PhoneVo> getListView() {
		return PhoneDao.ListView;
	}
	
	public void setInfoList(List<PhoneVo> ListView) {
		PhoneDao.ListView = ListView;
	}
}
