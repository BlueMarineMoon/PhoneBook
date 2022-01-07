package model;

public class PhoneVo {
	private int no;
	private String name;
	private String phone;
	private String address;
	private String email;
	
	
	public PhoneVo() {
		this(0, "", "", "", "");
	}

	public PhoneVo(int no, String name, String phone, String address, String email) {
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return no + "\t" + name + "\t" + phone + "\t" + address + "\t" + email;
	}

	public static PhoneVo get(Object[] phonearr) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

