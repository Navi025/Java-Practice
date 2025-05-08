
import java.util.*;

public class practice {

    public static void reverseNo() {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int r = n % 10;
            System.out.print(r + " ");
            n = n / 10;
        }
    }

    ;

// PATTURNS

    public static void rightTriangle() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
// i=1 j=4
// i=2 j=3

    public static void invertedRightTriangle() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
// Void Rectangle

    public static void voidRectangle() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            if (i == 2 || i == 3) {
                System.out.print("*     *");
            } else {
                System.out.print("* * * *");

            }
            System.out.println("");
        }

    }
// NUMBER's TRANGLE

    public static void numTraingle() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
// char triangle

    public static void charTriangle() {
        int n = 4;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
// FACTORIAL    

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;

    }
// BINARY COERFFICIENT

    public static int binCoff(int n, int r) {
        int nfact = factorial(n);
        int rfact = factorial(r);
        int n_rfact = factorial(n - r);
        int binCoff = nfact / (rfact * n_rfact);
        return binCoff;
    }

// Check Prime
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int binaryToDecimal(int binNum) {
        int pow = 0;
        int dec = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec += lastDigit * (int) Math.pow(2, pow);
            pow++;
            binNum /= 10;
        }
        return dec;
    }

    public static int decimalToBinary(int n) {
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum += rem * Math.pow(10, pow);
            pow++;
            n /= 2;
        }
        return binNum;
    }

    /* 

        ADVANCED PATTURN



        * * * * *
        *       *
        *       *
        * * * * *
     */
    public static void hollow_Rectangle(int rows, int col) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= col; j++) {
                if (i == 1 || i == rows || j == 1 || j == col) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    /*
        INVERTED ROTATED HALF PYRAMID  
                        *   space = 4  star = 1
                      * *   space = 3  star = 2       
                    * * *   space = 2  star = 3
                  * * * *   space = 1  star = 4
                * * * * *   sapce = 0  star = 5
     */
    public static void irhPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }

    }

    /*
             1 2 3 4 5   num = 1-5 space = 0
             1 2 3 4     num = 1-4 space = 1
             1 2 3       num = 1-3 space = 2
             1 2         num = 1-2 space = 3
             1           num = 1   space = 4
     */
    public static void iNumHPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    /*           FLOYD'S TRIANGLE
                    1
                    2 3
                    4 5 6
                    7 8 9 10
                    11 12 13 14 15
     */
    public static void floydsTriangle(int n) {
        int counter = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println("");
        }
    }

    /*        0-1 Triangle
                1           1,1
                0 1         2,2         2,1
                1 0 1       3,1|3,3     3,2
                0 1 0 1     4,2|4,4            4,1|4,3
                1 0 1 0 1    
     */
    public static void binaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println("");
        }
    }

    ;

    /*             BUTTERFLY (n=4)
            *             *     6   4   1
            * *         * *     4   4   2
            * * *     * * *     2   4   3
            * * * * * * * *     0   4   4
            * * * * * * * *
            * * *     * * *
            * *         * *
            *             *  

     */
    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    ;

    /*          Solid Rhombus
                * * * * *
              * * * * * 
            * * * * *
          * * * * *         
        * * * * *
     */

    public static void Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    /*          Hollow Rhombus
                 * * * * *
               *       *
             *       *
           *       *
         * * * * *   
     */
    public static void hRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }

     /*              Diamond
                    *           s = 3   st = 1
                   ***          s = 2   st = 3
                  *****         s = 1   st = 5
                 *******        s = 0   st = 7
                  *****
                   ***
                    *
*/

    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j  = 1; j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j = 1;j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
         for(int i=n;i>=1;i--){
            for(int j  = 1; j<=n-i;j++){
                System.out.print("   ");
            }
            for(int j = 1;j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // for (int i = 1; i <= 4; i++) {
        //     System.out.println("****");
        // }
        // reverseNo();
        // rightTriangle();
        // invertedRightTriangle();
        // voidRectangle();
        // numTraingle();  
        // charTriangle();
        // factorial(20);
        // System.out.print(binCoff(4,2));
        // System.out.print(isPrime(11));
        // System.out.print(binaryToDecimal(0010));
        // System.out.print(decimalToBinary(400));
        // irhPyramid(7);
        // iNumHPyramid(7);
        // floydsTriangle(5);
        // binaryTriangle(7);
        // butterfly(7);
        // hRhombus(5);
        diamond(4);

    }
}
