/*      
        ARRAYS

    - Largest in Array
    - Creating an Array
    - Input Array Elements
    - Linear search

    1. BINARY SEARCH
    2. REVERSE AN ARRAY
    3. PAIRS OF NUMBER
    4. Print SUBARRAYS
    5. Min/Max SUBARRAY SUM
    6. Min/Max SUBARRAY SUM - Prefix Array Meathod
    7. Min/Max SUBARRAY SUM - Kadane's ALGO
*/


//          LARGEST IN ARRAY

import java.util.*;
public class Arrays{
    public static int largestno(int number[]){
         int lar = Integer.MIN_VALUE;
        for(int i=1; i<number.length; i++){        
            if (number[i]>lar){
            lar=number[i];
            }
        }
        System.out.print("largest number in the array is:"+lar);
    }

//          CREATING AN ARRAY

    public static void creatingArray(String args[]){
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //che
        marks[2] = sc.nextInt(); //math

        System.out.println("maths : " + marks[2]);
        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);

        //marks[2] += 5;
        //System.out.println("maths : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;

        System.out.println("Percentage = " + percentage + "%");

        System.out.println(marks.length);
    }

//          INPUT ARRAY ELEMENTS

    public static void inputArray(String args[]){
        int number[]=new int[5];
        System.out.println("ENter the elements of array: ");
        Scanner sc=new Scanner(System.in);
        number[0]=sc.nextInt();
        number[1]=sc.nextInt();
        number[2]=sc.nextInt();
        number[3]=sc.nextInt();
        number[4]=sc.nextInt();
        System.out.print("number[] = "+number);
    }

//          LINEAR SEARCH

public static int linearSearch(int number[], int key){
        for (int i=0; i<number.length; i++){
            if(number[i]==key){
               return i;
            }
        }
        return -1;
    }
    

//          BINARY SEARCH


    public static int binarySearch(int number[], int key){
        int start = 0;
        int end = number.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]<key){
                start = mid + 1;
            }
            else if(number[mid]>key){
                end = mid - 1;
            }
        }
        return -1;
    }
//          REVERSE ARRAY

    public static void reverseArray(int number[]){
        int start = 0;
        int end = number.length-1;

        while(start<end){
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;
            start++;
            end--;
        }
        for(int i=0; i<number.length; i++){
            System.out.println( number[i] + " " );
        }
    }
//          PAIRS OF NUMBER

    public static void pairs(int number[]){
        int tp=0;
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                System.out.print("(" + number[i] + "," + number[j] + ")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total pairs: " + tp);
    }

//          PRINT SUBARRAYS

    public static void printSubArray(int number[]){
        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    } 

//         MAX SUBARRAY SUM
//   BRUTE FORCE (T.C. = math.power(n,3))

    public static void maxSubArrayAum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int miniSum = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                    currSum=0;
                for (int k = i; k <=j; k++) {
                    currSum+=number[k];
                    
                }
                    System.out.print(currSum + " ");
                    if(currSum>maxSum){
                        maxSum=currSum;
                    }
                    if(currSum<miniSum){
                        miniSum=currSum;
                    }
                    System.out.println();
                
            }
            System.out.println();
            
        }
        System.out.println("Max Sub-ArraySum : " + maxSum);
        System.out.println("Mini Sub-ArraySum : " + miniSum);
    }

//          MAX SUBARRAY SUM (PRIFIX ARRAY)

    public static void maxSubArraySum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        for(int i=1; i<number.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
            }
            
        }
        System.out.println("Max SubArray Sum : " + maxSum);
    }

//          MAIN FUNCTION

    public static void main(String args[]){
        int number[] = {1, -2, 6, -1, 3};
        int key =  6;

        maxSubArraySum(number);

        // maxSubArrayAum(number);

        // printSubArray(number);

        // pairs(number);

        // reverseArray(number);

        // int index = linearSearch(number,key);

        // if(index==-1){
        //     System.out.print("Not found");
        // }
        // else{
        //     System.out.println("The key exists at index: "+ index);
        // }
        
        // int result = binarySearch(number, key);
        
        // if (result == -1){
        //     System.out.println("The key is not the the array.");
        // }
        // else{
        //     System.out.println("The key exists in the array at index: " + result);
        // }

    }
}
    