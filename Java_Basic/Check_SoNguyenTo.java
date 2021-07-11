import java.util.Scanner;
import java.lang.Math;
public class Check_SoNguyenTo{

    //Kiểm tra đầu vào có hợp lệ hay không
    public static int read(Scanner sc){
        String s;
        int n;
        do{
            s = sc.nextLine();
            try{n = Integer.parseInt(s);}
            catch(NumberFormatException e){
                System.out.println("\nLoi: "+e.toString());
                System.out.print("\nSai dinh dang, nhap lai: ");
                n = Integer.MAX_VALUE;
            }
        }while(n==Integer.MAX_VALUE);
        return n;
    }

    //Hàm kiểm tra số nguyên tố
    public static boolean check_prime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    //Thực thi
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap 1 so de kiem tra: ");
        int n = read(sc);
        int count=0;

        //Kiểm tra không sử dụng hàm
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) count++;  
        }

        if(count==0) System.out.println("So "+n+" la so nguyen to");
        else System.out.println("So "+n+" khong phai la so nguyen to");

        /*Sử dụng hàm
        if(check_prime(n)) System.out.println("So "+n+" la so nguyen to");
        else System.out.println("So "+n+" khong phai la so nguyen to");
        */

         //Khi run code chi chon 1 trong 2 cach tren
    }
}