/* 

        ADVANCED PATTURN



        * * * * *
        *       *
        *       *
        * * * * *
*/     
public class Jpatturn{
    public static void hollow_rectangle(int rows, int col){
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=col; j++){
                if (i==1 ||i==rows || j==1 || j==col){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
/*
        INVERTED ROTATED HALF PYRAMID  
                        *
                      * *          
                    * * *
                  * * * *
                * * * * * 
*/
    public static void inverted_rotated_half_Pyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

/*
             1 2 3 4 5 
             1 2 3 4
             1 2 3
             1 2
             1 
*/             
    public static void inverted_half_num_pyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
/*           FLOYD'S TRIANGLE
                    1
                    2 3
                    4 5 6
                    7 8 9 10
                    11 12 13 14 15
*/

    public static void floydsTriangle(int n){
        int counter = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

/*        0-1 Triangle
                1
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1    
*/    
    public static void binaryTriangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                
                
            }
            System.out.println();
        }
    }
/*             BUTTERFLY (n=4)
            *             *
            * *         * *
            * * *     * * *
            * * * * * * * *
            * * * * * * * *
            * * *     * * *
            * *         * *
            *             *  

*/

    public static void butterfly(int n){
        // outter loop -> lines/rows
        for (int i=1; i<=n; i++){
            // innner loop -> star 1
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            // inner loop2 -> space
            for (int j=1; j<=2*(n-i); j++){
                System.out.print("   ");
            }
            // innner loop3 -> star 2
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            // next line
            System.out.println();
        }
        // mirror of above -> reverce loop 
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print("   ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        
    } 
/*          Solid Rhombus
                * * * * *
              * * * * * 
            * * * * *
          * * * * *         
        * * * * *
*/
    public static void solid_rhombus(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for (int j=1; j<=n; j++ ){
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
    public static void hollow_Rhombus(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for (int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();        
        }
    }
      public static void main(String args[]){
        //hollow_rectangle(7,7);
        //inverted_rotated_half_Pyramid(5);
        //inverted_half_num_pyramid(5);
        //floydsTriangle(7);
        //binaryTriangle(5);
        //butterfly(5);
        //solid_rhombus(5);
        hollow_Rhombus(5);
    }
}

