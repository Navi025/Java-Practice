/* 

        ADVANCED PATTURN



        *****
        *   *
        *   *
        *****
     

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

    public static void main(String args[]){
      hollow_rectangle(7,7);
    }
}

        INVERTED ROTATED HALF PYRAMID  
                        *
                      * *          
                    * * *
                  * * * *
                * * * * * 
public class Jpatturn{
    public static void main(String args[]){
        inverted_rotated_half_Pyramid(5);
    }

    public static void inverted_rotated_half_Pyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                Snystem.out.print("   ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}*/