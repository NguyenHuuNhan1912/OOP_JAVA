import java.util.Scanner;
public class Multiplication_Matrix{
    private int row,column;
    private int matrix[][];
    private final int idx = 100;
    public Multiplication_Matrix(){
        row = 0;
        column = 0;
        matrix = new int[idx][idx];
    }
    public Multiplication_Matrix(Multiplication_Matrix mm){
        row = mm.row;
        column = mm.column;
        matrix = new int[mm.row][mm.column];
        int i,j;
        for(i=0;i<mm.row;i++){
            for(j=0;j<mm.column;j++){
                matrix[i][j] = mm.matrix[i][j];
            }
        }
    }
    public void print(){
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void read(Scanner sc){
        System.out.print("\nNhap so hang cua ma tran: ");
        row = sc.nextInt();
        System.out.print("\nNhap so co cua ma tran: ");
        column = sc.nextInt();
        System.out.println("\nNhap cac phan tu trong ma tran");
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.printf("\nNhap phan tu o vi tri [%d][%d]: ",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public int get_row(){
        return row;
    }
    public int get_column(){
        return column;
    }
    public static void check(Multiplication_Matrix mt1, Multiplication_Matrix mt2){
        if(mt1.column != mt2.row){
            System.out.println("\nHai ma tran khong kha tich --> Khong the nhan 2 ma tran");
            System.exit(0);
        }
    }
    public Multiplication_Matrix multiplication(Multiplication_Matrix mtb){
        Multiplication_Matrix result = new Multiplication_Matrix();
        result.row = row;
        result.column = mtb.column;
        int i,j,l;
        for(i=0;i<row;i++){
            for(j=0;j<mtb.column;j++){
                for(l=0;l<column;l++){
                    result.matrix[i][j] += matrix[i][l] * mtb.matrix[l][j];
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Multiplication_Matrix mta = new Multiplication_Matrix();
        Multiplication_Matrix mtb = new Multiplication_Matrix();
        System.out.println("\nNhap thong tin ma tran A");
        mta.read(sc);
        System.out.println("\nNhap thong tin ma tran B");
        mtb.read(sc);
        Multiplication_Matrix.check(mta,mtb);
        System.out.println("\nMa tran A"); mta.print();
        System.out.println("\nMa tran B"); mtb.print();
        System.out.println("\nTich hai ma tran"); 
        mta.multiplication(mtb).print();
    }
}