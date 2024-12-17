/*
                ARRAY
            Creating Array

import java.util.*;
public class Arrays{
    public static void main(String args[]){
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
}

            UPDATING ARRAY


public class Arrays{
    public static void update(int marks [], int a){
        a =10;
        for (int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;

        }
    }
    public static void main(String args[]){
        int marks[] = {89, 98, 86};
        int a = 5;
        update(marks, a);
        System.out.println(a);

        //print marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
    }
}

            LINEAR SEARCH


public class Arrays{
    public static int linearSearch(int number[], int key){
        for (int i=0; i<number.length; i++){
            if(number[i]==key){
               return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2,7,9,6,2,10,12,78,96};
        int key = 100;

        int index = linearSearch(number,key);

        if(index==-1){
            System.out.print("Not found");
        }
        else{
            System.out.println("The key exists at index: "+ index);
        }
    }
}

            LARGEST NUMBER


public class Arrays{
    public static int largestNumber(int number[]){
        int lar = Integer.MIN_VALUE; // -infinity
        int low = Integer.MAX_VALUE; // +infinity
        for (int i=0; i<number.length; i++) {
            if(lar < number[i]) {
                lar = number[i];
            }
            if(low > number[i]){
                low = number[i];
            }
        }
        System.out.println("The lowest no: "+ low);
        return lar;
    }
    public static void main(String args[]){
        int number[] = {2,4,5,7,9,5,2,1,3,4};
        System.out.print("The Largest number is: " + largestNumber(number));
    }
}

            BINARY SEARCH
  

public class Arrays{
    public static int binarySearch(int number[], int key){
        int start = 0;
        int end = number.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if (number[mid] == key){
                return mid;
            } 
            else if (number[mid]<key){
                start = mid + 1;
            }
            else if (number[mid]>key){
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int number[] = {2,4,6,7,8,9,10,12,14,16};
        int key = 100;
        int result = binarySearch(number,key);

        if (result == -1){
            System.out.print("Not found.");
        } 
        else{
            System.out.print("The required no is at index: " + result);
        }
    }
}

        REVERSE OF AN ARRAY


public class Arrays{
    public static void reverse(int number[]){
        int first = 2; 
        int last = number.length-1;

        while(first < last){
            int temp = number[last];
            number[last] = number[first];
            number[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int number[] = {2,4,5,6,7,8,9,6,5,3,2,1};
        
        reverse(number);
        for (int i=0; i<=number.length-1; i++){
            System.out.print(number[i] + " ");
        }
    }
}

            PAIRS OF NUMBERS IN ARRAY


public class Arrays{
    public static void pairs(int number[]){
        int tp=0;
        for (int i=0; i<number.length; i++){
            int curr = number[i];
            for (int j=i+1; j<number.length; j++){
                System.out.print("(" + curr + "," + number[j]+ ")");
            tp++;
            }
            System.out.println();
        }
        System.out.print("Total pairs : " + tp);
    }

    public static void main(String args[]){
        int number[] = {2,4,6,7,8,9,10};
        pairs(number);
    }
}

                PRINT SUB ARRAY


public class Arrays{
    public static void subarray(int number[]){
        for (int i=0; i<number.length; i++){
            int start = i;
            for (int j= i; j<number.length; j++){
                int end = j;
                for (int k = start; k<= end; k++){
                    System.out.print( number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        subarray(number);
    }
}

            SUM OF SUB-ARRAY
            MIN & MAX SUM

            BRUTE FORCE (T.C. = math.power(n,3))

public class Arrays{
    public static void sumOfSubarray(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i=0; i<number.length; i++){        
            for (int j = i; j<number.length; j++){
                currSum = 0;
                for (int k = i; k<= j; k++){
                    currSum += number[k];
                }
                System.out.println( currSum + " ");
                if(currSum>maxSum){
                        maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.print("MAximim Sum is : " + maxSum);
    }
    public static void main(String args[]){
        int number[] = {1,-2,6,-1,3};
        sumOfSubarray(number);
    }
}

*/

// public class Arrays{
//     public static void sumOfSubArray(int number []){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for (int i = 0; i<number.length; i++){
//             for (int j = i; j<number.length; j++){
//                 currSum=0;
//                 for (int k = i; k<=j; k++){
//                     currSum += number[k];
//                     //System.out.println(currSum + " ");
//                 }
//                 System.out.println(currSum + " ");
//                  if (currSum>maxSum){
//                 maxSum = currSum;
//                 }
//             }
           
//             System.out.println();
//         }
//         System.out.print("The maximum Sum is: " + maxSum);
//     }

//     public static void main(String args[]){
//         int number[] = {1,-2,6,-1,3} ;
//         sumOfSubArray(number);
//     }

// }

//    BINARY SEARCH
// plan: V-mid, start, end
//     I=key, array number
//     p=mid=key;mid<key,strt=mid+1; mid>key,end=mid-1
//     0=i i.e key

public class Arrays{
    public static int binarySearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            int start = 0;
            int end = number.length-1;

            while(start<=end){
                int mid=(start+end)/2;
                if(number[mid]==key){
                    return mid;
                }
                else if(number[mid]<key){
                    start=mid+1;
                }
                else if(number[mid]>key){
                    end=mid-1;
                }
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={2,4,6,7,8,9,10,15,19,20};
        int key=20;
        int result=binarySearch(number, key);

        if (result==-1){
            System.out.print("The no is not in array");
        }
        else{
        System.out.print("The no is at index: " + binarySearch(number,key));
        }
    }
}