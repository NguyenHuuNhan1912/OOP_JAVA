import java.util.Random;
public class RDum {
    public static void usingRandomClass(char arr[]) {
        
        for (int i=0; i<5; i++) {
            Random rand = new Random();
            int ranNum = rand.nextInt(36)+1;
            System.out.println("Random number is " + arr[ranNum]);
        }
    }
    public static void main(String[] args) {
        char arr[] = {'0','1','2','3','4','5','6','7','8','9','A','a','B','b','C',
        'c','D','d','E','e','F','f','G','g','H','h','I','i','J','j','K','k','L','l',
        'M','m','N','n','O','o','P','p','Q','q','R','r','S','s','T','t','U','u','V','v',
        'W','w','X','x','Y','y','Z','z'};
        
        usingRandomClass(arr);
    }
    
}
