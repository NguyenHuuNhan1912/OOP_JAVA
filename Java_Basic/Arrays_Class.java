/*Khai bao va su dung arrays class trong java de sap xep cac mang
Su dung cac ham da co san trong lop arrays ma java cung cap*/
import java.util.Scanner;
import java.util.Arrays;
public class Arrays_Class{
    private int n;
    private int arr[];
    private final int idx = 100;
    public Arrays_Class(){
        n = 0;
        arr = new int[idx];
    }
    public Arrays_Class(Arrays_Class sa){
        n = sa.n;
        arr = new int[sa.n];
        for(int i=0;i<sa.n;i++){
            arr[i] = sa.arr[i];
        }
    }
    public static int check(Scanner sc){
        String s;
        int n;
        do{
            s = sc.nextLine();
            try{n = Integer.parseInt(s);}
            catch(NumberFormatException e){
                n = Integer.MAX_VALUE;
                System.out.println("\nError: "+e.toString());
                System.out.print("\nSai dinh dang, nhap lai: ");
            }
        }while(n==Integer.MAX_VALUE);
        return n;
    }
    public void read(Scanner sc){
        System.out.print("\nMang co bao nhieu phan tu: ");
        n = Arrays_Class.check(sc);
        System.out.println("\nNhap gia tri cho cac phan tu");
        for(int i=0;i<n;i++){
            System.out.print("\nNhap gia tri phan tu thu "+(i+1)+": ");
            arr[i] = Arrays_Class.check(sc);//try-catch
        }
        //Thay doi so phan tu trong mang tiet kiem bo nho
        int arrcp[] = Arrays.copyOfRange(arr,0,n);
        arr = Arrays.copyOf(arrcp,n);
    }
    public void print(int i){
        System.out.println("\nArray["+(i+1)+"] = "+Arrays.toString(arr));
    }
    public void sort(){
        Arrays.sort(arr);
    }
    public static void read_array(Arrays_Class ds[],Scanner sc){
         for(int i=0;i<ds.length;i++){
            System.out.println("\nNhap thong tin mang thu "+(i+1));
            ds[i] = new Arrays_Class();
            ds[i].read(sc);
        }
    }
    public static void print_array(Arrays_Class ds[]){
        for(int i=0;i<ds.length;i++){
            ds[i].print(i);
        }
    }
    public static void Arrays_Class(Arrays_Class ds[]){
        for(int i=0;i<ds.length;i++){
            ds[i].sort();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Arrays_Class array = new Arrays_Class();
        // System.out.println("\nNhap du lieu cho mang");
        // array.read(sc);
        // System.out.println("\nMang chua sap xep");
        // array.print();
        // System.out.println("\nMang da sap xep");
        // array.sort();
        // array.print();
        System.out.print("\nDanh sach ban co bao nhieu mang: ");
        int n = Arrays_Class.check(sc);
        Arrays_Class ds[] = new Arrays_Class[n];
        System.out.println("\nNhap thong tin cac mang");
        Arrays_Class.read_array(ds,sc);
        System.out.println("\nThong tin cac mang chua sap xep");
        Arrays_Class.print_array(ds);
        System.out.println("\nCac mang da sap xep theo chieu tang dan");
        Arrays_Class.Arrays_Class(ds);
        Arrays_Class.print_array(ds);
    }
}
