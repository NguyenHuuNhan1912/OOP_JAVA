import java.util.Scanner;
public class Sum_Matrix{

    //Thuoc tinh cua ma tran
    private int row,column;
    private int matrix[][];
    private final int idx =50;

    //Default constructor
    public Sum_Matrix(){
        row = 0;
        column = 0;
        matrix = new int[idx][idx];
    }

    //Coppy constructor
    public Sum_Matrix(Sum_Matrix mt){
        row = mt.row;
        column = mt.column;
        matrix = new int[idx][idx];
        int i,j;
        for(i=0;i<mt.row;i++){
            for(j=0;j<mt.column;j++){
                matrix[i][j] = mt.matrix[i][j];
            }
        }
    }

    //Ham nhap ma tran
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap so hang cua ma tran: ");
        row = sc.nextInt();
        System.out.print("\nNhap so cot cua ma tran: ");
        column = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.printf("\nNhap phan tu [%d][%d]: ",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    //Ham in ma tran
    public void print(){
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Ham tinh tong hai ma tran
    public Sum_Matrix sum_matrix(Sum_Matrix mt2){
        Sum_Matrix result = new Sum_Matrix(mt2);
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                result.matrix[i][j] = matrix[i][j] + mt2.matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sum_Matrix matrix1 = new Sum_Matrix();
        Sum_Matrix matrix2 = new Sum_Matrix();

        System.out.println("\nNhap ma tran thu 1");
        matrix1.read();

        System.out.println("\nNhap ma tran thu 2");
        matrix2.read();

        System.out.println("\nMa tran thu 1");
        matrix1.print();

        System.out.println("\nMa tran thu 2");
        matrix2.print();
        
        System.out.println("\nTong hai ma tran");
        matrix1.sum_matrix(matrix2).print();
    }
}