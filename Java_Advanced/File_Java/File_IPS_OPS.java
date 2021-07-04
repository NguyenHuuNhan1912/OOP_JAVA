package File_Java;
import java.util.Scanner;
import java.io.*;

public class File_IPS_OPS{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		//Doc du lieu tu file
		FileInputStream file = new FileInputStream("D://BT1.txt");
		byte arr[] = new byte[1024];
		file.read(arr);
		String result = new String(arr);
		result = result.trim();
		System.out.println("\nKet qua lay tu file");
		System.out.print(result);
		file.close();
		
		//Ghi du lieu vao file
		System.out.println("Nhan");
		FileOutputStream file1 = new FileOutputStream("D://BT2.txt");
		String s = "AN Giang";
		file1.write(s.getBytes());
		System.out.println("\nFile duoc ghi thanh cong !");
		file1.close();
	}
}