import java.util.Scanner;
import java.lang.Math;
public class Check_SoChinhPhuong{
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap 1 so de kiem tra: ");
        int n = read(sc);
        int temp =(int)Math.sqrt(n);
        if(temp*temp == n) System.out.println("\nSo "+n+" la so chinh phuong");
        else System.out.println("\nSo "+n+" khong phai la so chinh phuong");
    }
}