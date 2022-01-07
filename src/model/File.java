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
			String str = list.get(1).getName();
			bs.write(str.getBytes());

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
