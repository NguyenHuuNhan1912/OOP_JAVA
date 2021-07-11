import java.util.Scanner;
public class Check_SoDoiXung{

    //Hàm kiểm tra số nhập vào có hợp lệ hay không
    public static boolean IsNumber(String number){
        int length= number.length();
        if(length==0) return false;
        if(number.charAt(0)=='0') return false;
        for(int i=0;i<length;i++){
            if(number.charAt(i) < '0' || number.charAt(i) > '9') return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nNhap so can kiem tra: ");
        String number = sc.nextLine();
        boolean temp = true;
        
        if(!IsNumber(number)){
            while(temp){
                System.out.print("\nSai dinh dang, nhap lai: ");
                number = sc.nextLine();
                if(IsNumber(number)) temp=false;
            }
        }

        //Chuyen string sang mang char
        char arr[] = number.toCharArray();
        boolean result = true;
        int last = arr.length-1;

        /*
        Chạy for so sánh kí tự đâu tiên và cuối cùng nếu khác thì false
        nếu giống thì trừ last để có cặp số tiếp theo cần so sánh, cứ như
        vậy cho đến hết chuỗi ký tự, và biến boolean result sẽ quyết định kết quả
        */
        for(int i=0;i<=last;i++){
            if(arr[i]!=arr[last]) result = false;
            else last-=1;
        }
        if(result) System.out.println("So "+number+" la so doi xung");
        else System.out.println("so "+number+" khong phai la so doi xung");
    }
}