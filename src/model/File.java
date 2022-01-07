package model;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class File {
	private static final Object[] PhoneArr = null;

	public static void OutputBufferedStream(List<PhoneVo> list) throws IOException {
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("E:\\PGY\\PhoneBook.dat"));
			String name = list.get(0).getName();
			bs.write(name.getBytes());
			String phone = list.get(0).getPhone();
			bs.write(phone.getBytes());
			String address = list.get(0).getAddress();
			bs.write(address.getBytes());
			String email = list.get(0).getEmail();
			bs.write(email.getBytes());

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			bs.close();
		}
	}

	public static void InputStream(List<PhoneVo> list) throws IOException {
		try {
			String filePath = "E:\\\\PGY\\\\PhoneBook.dat";
			FileInputStream fileStream = null;

			fileStream = new FileInputStream(filePath);
			byte[] readBuffer = new byte[fileStream.available()];
			while (fileStream.read(readBuffer) != -1) {
			}
			System.out.println(new String(readBuffer));

			fileStream.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
