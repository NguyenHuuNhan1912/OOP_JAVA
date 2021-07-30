import java.util.Scanner;
public class Determinant_Matrix{
    public static void read(int mt[][]){
        Scanner sc = new Scanner(System.in);
        int i,j;
        for(i=0;i<mt.length;i++){
            for(j=0;j<mt.length;j++){
                System.out.printf("\nNhap phan tu o vi tri [%d][%d]: ",i,j);
                mt[i][j] = sc.nextInt();
            }
        }
    }
    public static void print(int mt[][]){
        int i,j;
        for(i=0;i<mt.length;i++){
            for(j=0;j<mt.length;j++){
                System.out.print(mt[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int determinant(int mt[][]){
        int result = 0;
		if (mt.length == 1) {
			result = mt[0][0];
			return result;
		}
		if (mt.length == 2) {
			result = mt[0][0] * mt[1][1] - mt[0][1] * mt[1][0];
			return result;
		}
		for (int i=0;i<mt[0].length;i++) {
			int temp[][] = new int[mt.length-1][mt[0].length-1];
			for(int j=1;j<mt.length;j++) {
				for(int k=0;k<mt[0].length;k++) {

					if (k<i) {
						temp[j-1][k] = mt[j][k];
					} else if (k > i) {
						temp[j-1][k-1] = mt[j][k];
					}
				}
			}
			result += mt[0][i] * Math.pow(-1,(int)i) * determinant(temp);
		}
		return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap cap cua ma tran: ");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        Determinant_Matrix.read(matrix);
        System.out.println("\nMa tran vua nhap");
        Determinant_Matrix.print(matrix);
        System.out.println("\nDinh thuc cua ma tran tren = "+Determinant_Matrix.determinant(matrix));
    }
}