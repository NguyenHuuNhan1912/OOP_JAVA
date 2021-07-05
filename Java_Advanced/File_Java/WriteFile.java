package File_Java;
import java.util.Scanner;
import java.io.*;

public class WriteFile{
	//Thuoc tinh
	private String fullname;
	private String mssv;
	private int age;

	//Default constructor
	public WriteFile(){
		fullname = new String();
		mssv = new String();
		age=20;
	}
	//READ
	public void read(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ho ten: ");
		fullname = sc.nextLine();
		System.out.print("\nNhap mssv: ");
		mssv = sc.nextLine();
		System.out.print("\nNhap tuoi: ");
		age=Integer.parseInt(sc.nextLine());
	}
	public void print(){
		System.out.println("\nTen: "+fullname);
		System.out.println("\nMSSV: "+mssv);
		System.out.println("\nTuoi: "+age);
	}
	public static void read_List(WriteFile ds[]){
		for(int i=0;i<ds.length;i++){
			System.out.println("\nNhap thong tin sinh vien thu "+(i+1));
			ds[i] = new WriteFile();
			ds[i].read();
		}
	}
	public String get_Name(){
		return fullname;
	}
	public String get_MSSV(){
		return mssv;
	}
	public int get_Age(){
		return age;
	}
	public static void getSV(FileOutputStream file, WriteFile ds[]) throws IOException{
		String s = new String();
		for(int i=0;i<ds.length;i++){
			s = new String("--------------------------------------\n");
			file.write(s.getBytes());

			s = new String("Thong tin sinh vien thu "+(i+1));
			file.write(s.getBytes());

			s = new String("\nHo ten: "+ds[i].get_Name());
			file.write(s.getBytes());

			s = new String("\nMa so sinh vien: "+ds[i].get_MSSV());
			file.write(s.getBytes());

			s = new String("\nTuoi: "+Integer.toString(ds[i].get_Age())+"\n");
			file.write(s.getBytes());

			s = new String("--------------------------------------\n");
			file.write(s.getBytes());
		}
		file.close();
		System.out.println("\nFile da duoc ghi thanh cong, kiem tra lai trong thu muc D");
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nDanh sach cua ban co bao nhieu sinh vien: ");
		int n = Integer.parseInt(sc.nextLine());

		WriteFile ds[] = new WriteFile[n];

		//Nhap danh sach
		System.out.println("\nNhap thong tin cac sinh vien");
		WriteFile.read_List(ds);

		//Ghi vao file
		FileOutputStream file = new FileOutputStream("D://BT3.txt");
		WriteFile.getSV(file,ds);
		
	}
}
