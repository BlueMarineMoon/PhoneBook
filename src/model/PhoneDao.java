package model;

import java.util.ArrayList;
import java.util.List;

public class PhoneDao {

	public static final String getListView = null;
	private static List<PhoneVo> ListView = new ArrayList<PhoneVo>();
	public static int top = 0;
	public static int sequenceNo = 1;
	
	static {
		ListView.add(new PhoneVo(sequenceNo++, "KIM", "010-1111-1111", "서울특별시", "kim@naver.com"));
		ListView.add(new PhoneVo(sequenceNo++, "LEE", "010-2222-2222", "부산광역시", "lee@naver.com"));
		ListView.add(new PhoneVo(sequenceNo++, "PARK", "010-3333-3333", "경기도수원", "park@naver.com"));
	}

	public PhoneVo[] selectAll() {
		PhoneVo[] NewArr = new PhoneVo[top];
		for (int i = 0; i < top; i++) {
			PhoneVo NewPhone = new PhoneVo();
			NewPhone.setNo(ListView.get(i).getNo());
			NewPhone.setName(ListView.get(i).getName());
			NewPhone.setPhone(ListView.get(i).getPhone());
			NewPhone.setAddress(ListView.get(i).getAddress());
			NewPhone.setEmail(ListView.get(i).getEmail());
			NewArr[i] = NewPhone;
		}
		return NewArr;
	}

	public PhoneVo selectOne(PhoneVo vo) {
		for (int i = 0; i < top; i++) {
			if (vo.getName().equals(ListView.get(i).getName())) {
				PhoneVo NewPhone = new PhoneVo();
				NewPhone.setNo(ListView.get(i).getNo());
				NewPhone.setName(ListView.get(i).getName());
				NewPhone.setPhone(ListView.get(i).getPhone());
				NewPhone.setAddress(ListView.get(i).getAddress());
				NewPhone.setEmail(ListView.get(i).getEmail());
				return NewPhone;
			}
		}
		return null;
	}

	public PhoneVo selectByNo(int no) {
		for (int i = 0; i < top; i++) {
			if (no == ListView.get(i).getNo()) {
				PhoneVo NewPhone = new PhoneVo();
				NewPhone.setNo(ListView.get(i).getNo());
				NewPhone.setName(ListView.get(i).getName());
				NewPhone.setPhone(ListView.get(i).getPhone());
				NewPhone.setAddress(ListView.get(i).getAddress());
				NewPhone.setEmail(ListView.get(i).getEmail());
				return NewPhone;
			}
		}
		return null;
	}

	public void insert(PhoneVo vo) {
		if (top >= 100) {
			System.out.println(">>> 더이상 입력이 불가능합니다!");
			return;
		}
		vo.setNo(sequenceNo++);
		this.ListView.add(vo);
	}

	public void update(PhoneVo vo) {
		for (int i = 0; i < top; i++) {
			if (ListView.get(i).getNo() == vo.getNo()) {
				this.ListView.add(vo);
			}
		}
	}

	public void delete(PhoneVo vo) {

		for (int i = 0; i < ListView.size(); i++) {
			if (ListView.get(i).getNo() == vo.getNo()) {
				this.ListView.remove(vo);
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
