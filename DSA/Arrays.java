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
*/

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