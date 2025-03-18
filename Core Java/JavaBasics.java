public class JavaBasics{
    public static void main(String[] args) {
    System.out.print("1,2,3,6,5,");
    System.out.print("1,2,3,6,5,");
    System.out.print("1,2,3,6,5,");

    }
}

//boilerpalte code


public class JavaBasics{
    public static void main(String[] args){
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }

}

//VARIABLES

public class JavaBasics{
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        String name = "Tony stark";
        System.out.println(name);


        a = b;
        System.out.print(a);

    } 
}


import java.util.*;
 public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //String input = sc.next();
        String input = sc.nextLine();
        System.out.print(input);
    }
 } 

import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
    }
} 


import java.util.*;
public class JavaBasics{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.println(f);
    }
} 

//SUM OF TWO NOS


import java.util.*;
public class JavaBasics{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
//   PRODUCT of 2 nos
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int produst = a * b;
        System.out.println(produst); 
    }
}

// ARES OF CIRCLE 

import java.util.*;
public class JavaBasics{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float ar = 3.14f * r * r;
        System.out.print(ar);

    }
}


/* TYPE CONVERSION ANd TYPE CATSING */

import java.util.*;
public class JavaBasics{
    public static void main(String args []){
        int a = 45;
        float b = 25.96f;
        float c = a;
        int d = (int)b;
        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println(number);
        System.out.println(number2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class JavaBasics{
    public static void main(String args []){
        int $=24;
        System.out.println($);
    }
} 

/* Question 1 : In a program, input 3 numbers:A,BandC.
You have to output the average of these 3 numbers. 
(Hint : Average of N numbers is sum of those numbers divided by N) */

import java.util.*;
public class JavaBacics{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no: "); 
        int b = sc.nextInt();
        System.out.print("Enter 3rd no: ");
        int c = sc.nextInt();
        float av = (a + b + c)/3;
        System.out.println(av);
    }   
}

/* Question 2 : In a program, input the side of a square. 
You have to output the area of the square.
(Hint : area of a square is (side x side)) */

import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sides of Square: ");
        float s = sc.nextFloat();
        float Area = s * s;
        System.out.println(Area);
    }
}

/* Question 3 : Enter cost of 3 items from the user (using float data type)
-a pencil, a pen and an eraser. You have to output the total cost of the items 
back to the user as their bill.(Add on : You can also try adding 18% gst tax to 
the items in the bill as an advanced problem */

import java.util.*;
public class JavaBasics{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the cost of pencil: ");
        float ps = sc.nextFloat();
       
        System.out.print("Enter the cost of pen: ");
        float pn = sc.nextFloat();
       
        System.out.print("Enter the cost of Eraser: ");
        float es = sc.nextFloat();
       
        float S_Total = ps + pn + es;
        float t = S_Total * 0.18f;
        float bill = S_Total + t;
       
        System.out.println("Cost of product = " + S_Total);
        System.out.println("GST = "+ t);
        System.out.println("Total bill with GST = " + bill); 

        sc.close();
    }
}*/

/* CONDITIONAL STATEMENTS */

public class JavaBasics {
    public static void main(String args []){
        int age = 22;
        if (age >= 18){
            System.out.print("adult : Drive, Vote");
        }
        else{
            System.out.print("Not Adult");
        }
    }
}

// ODD OR EVEN 
import java.util.*;
public class JavaBacics{
    public static void main(String srgs[]){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("The no is even");
        }
        else{
            System.out.println("The no is odd");
        }
    }
}

/* Elseif */
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        System.out.print("ENter the age : ");
        Scanner sc = new Scanner(System.in);
        float age = sc.nextFloat();
        if (age >= 18 && age <= 65){
            System.out.print("The person is Adult");
        }
        else if (age>65){
            System.out.println("The persion is Senior Citizen");
        }
        else {
            System.out.println("You are child");
        }
    }
}

/*INCOME TAX CALCULATOR */
import java.util.*;
public class JavaBacics{
    public static void main(String args[]){
        
        System.out.print("Enter the income : ");
        
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        
        float tax;
        if (income < 500000){
            System.out.println("No Tax Applied");
        }
        
        else if ( income >= 500000 && income <= 1000000){
            tax = income * 0.2f;
            System.out.println("Tax applied 20% of net income: " + tax);
        }

        else {
            tax = income*0.3f;
            System.out.println("Tax Applied is 30% of net income: " + tax);
        }
    }
}

/* TERNARAY OPERATOR */

public class JavaBacics{
    public static void main(String args[]){
        
        int no = 45;
        
        //Ternary Operator
        String result = (no%2==0)? "Even":"Odd";
        System.out.print(result);
    }
} 



public class JavaBacics{
    public static void main(String args[]){
        int marks = 45;
        //tertiary oprator
        String result = (marks>=33)?"Pass":"Fail";
        System.out.println(result);
    }
}


/* SWITCH CASE */
public class JavaBacics{
    public static void main(String args[]){
        int no = 8;
        switch (no){
            case 1 : System.out.print("Samosa");
                        break;
            case 2 : System.out.println("Momos");
                        break;
            case 3 : System.out.println("Chocolate shake");
                        break;
            default : System.out.println("Kuch nhi milne wala");
        }
    }
}

/* CALCULATOR */

import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        
        System.out.println("What you wanna do?\n +,-,*,/,%: ");
        
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        
        int a = 4567;
        int b = 8567;

        switch (choice){
            case "+" : System.out.println(a+b);
                            break;
            case "-" : System.out.println(a-b);
                            break;
            case "*" : System.out.println(a*b);
                            break;
            case "/" : System.out.println(b/a);
                            break;
            case "%" : System.out.println(b%a);
                            break;
            default : System.out.println("Give a correct choice");  
        }


    }

}


/* CONDITIONAL STAEMENT QUESTIONS */

/*Question1:
Write a Java program to get a number from the user 
and print whether it is positive or negative */

import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num<0){
            System.out.println("The no is Negative.");
        
        }
        else{
            System.out.println("The no is Positive.");
        }

    }
}

/* Question2:
Finish the following code so that it prints You have a fever if your temperature 
is above 100 and otherwise prints You don't have a fever. */

public class JavaBasics{
    public static void main(String args[]){
        double temp = 103.5;

        if (temp>100){
            System.out.print("You have a fever.");

        }
        else{
            System.out.println("You don't have a fever.");
        }
    }
}

/* Question3:
Write a Java program to input week number(1-7) and print day of week name using 
switch case. */

import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        System.out.print("Enter day no of a week : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        
        switch (day){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");    
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;
            default : System.out.println("Enter an interger between 1-7");     
        }
    }
}

public class JavaBasics{
    public static void main(String args[]) {
        int a = 63, b = 36; 
        boolean x = (a < b) ? true : false; 
        int y = (a > b) ? a : b;
        System.out.println("x = " + x);
        System.out.println("y : " + y);
    }
}

/*Question5: WRONG SOL
Write a Java program that takes a year from the user and print whether that year
 is a leap year or not. 
WRONG SOL*/
import java.util.*;
    public class JavaBasics{
        public static void main(String args[]){
            
            System.out.print("Enter a year : ");
            
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();

            if (year % 4 == 0){
                System.out.println("This is a leap year");
            }
            else if (year % 100 == 0){
                System.out.println("This is a leap year");}
// WRONG SOL            
            else if (year % 400 == 0){
                System.out.println("This is a leap year");
            }    
            else {
                System.out.println("This is NOT a leap year");
            }
        }
    }


    /* LOOPS */


public class JavaBasics{
    public static void main(String args[]){
        int counter = 0;
        while (counter < 3){
            System.out.println("Navnitya is a Software Developer");
            counter++;
        }

    }
}