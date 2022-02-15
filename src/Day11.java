import java.util.Scanner;

public class Day11 {
    /*
    Write a java program to print all even numbers from a given
range, from a to b. Input a and b from console.
     */
    public static void evenNumber(int a1, int b1) {
        for (int i = a1; i <= b1; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /*
    2.Print all numbers on the segment from a to b that give the
remainder of c when divided by d. If such numbers do not exist,
then you do not need to display anything.
     */
    public static void reminderNum(int a, int b, int c, int d) {
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }

    }

    /*
    Print all numbers on the segment from a to b that are exact
squares.
     */
    public static void exactSquare(int x, int y) {
        for (int i = x; i * i <= y; i++) {
            System.out.println((int) Math.pow(i, 2));
        }

    }
    /*
    Count and print one number - how many times the digit d occurs in
the representation of a natural number x.
     */

    public static void countDigit(int x, int d) {
        int count = 0;
        while (x > 0) {
            if (x % 10 == d) {
                count++;
            }
            x = x / 10;
        }
        System.out.println(count);
    }

    /*
     Given an integer number x
Print the number consisting of the digits of the given number x in reverse
order.
     */
    public static void reverseNum(int num) {
        int rnum = 0;
        while (num > 0) {
            rnum = rnum * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rnum);


    }

    /*
6.Given an integer number x
Find the smallest natural divisor of x other than 1 (2 &lt;= x &lt;= 30000).
     */
    public static void smallDivisor(int x) {
        if (x >= 2 && x <= 30000) {
            if (x % 2 == 0) {
                System.out.println(2);
            }
            for (int i = 3; i * i <= x; i += 2) {
                if (x % i == 0) {
                    System.out.println(i);
                    break;
                } else
                    System.out.println(x);

            }
        }
    }
    /*
    Print all natural divisors of the number x in ascending order (including 1
and the number itself).
     */
    public static void allDivisor(int x){
        for(int i=1;i<=x;i++){
            if(x%i==0){
                System.out.println(i);
            }
        }
    }
    /*
    Given an integer x
Count the number of natural divisors of x (including 1 and the number
itself; x≤2 ∗ 109).
     */
    public static void countDivisor(int x){
        if(x>=0&&x<=2*109){
            int count=0;
            for(int i=1;i<=x;i++){
                if(x%i==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    /*
    Write a Java program by using two for loops to produce the output
shown below:
1.Input N natural number, print picture like below in size N*N
     */
    public static void printPicture(int x){
        for(int i=1;i<x;i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
/*
.Write a program that prompts the user for the size (a non-negative
integer in int); and prints the following checkerboard pattern.
 */
    public static void checkerboardPattern(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print("\t");
            for (int j = 1; j <= x; j++) {
                if (i % 2 == 1 && j % 2 == 1 || i % 2 == 0 && j % 2 == 0) {
                    System.out.print("#" + " ");
                } else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
    public static void multiplicationTable(int n){
                String s="----------------------------------------------------";
                System.out.print("\t"+"*"+"\t"+"|");
                for(int i=1;i<=n;i++) {
                    System.out.print("\t" + i);
                }
                System.out.print("\n");

                for (int j=1;j<=n;j++){
                    System.out.println("\t"+j+"\t"+"|"+"\t"+j+"\t"+2*j+"\t"+3*j+"\t"+4*j+"\t"+5*j+
                            "\t"+6*j+"\t"+7*j+"\t"+8*j+"\t"+9*j+"\t"+10*j);}

                System.out.print("\t"+"\n"+s);
                System.out.println();
            }
            /*
            Write 4 programs (X = A, B, C, D) that prompts user for the
size (a non-negative integer in int); and prints each of the patterns as
shown:
             */
            public static void patternA(){
                for(int i=1;i<=4;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("#");
                    }

                    System.out.println();
                }
            }
    public static void patternB(){
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("#");
            }

            System.out.println();
        }
    }
    public static void patternC(){
        for(int i=4;i>=1;i--){
            for(int j=1;j<=4;j++){
                if(j>=i){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void patternD(){
        for(int i=1;i<=4;i++){
            for(int j=4;j>=1;j--){
                if(j<=i){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        evenNumber(a1, b1);

        Scanner sc = new Scanner(System.in);
        System.out.print("a" + "\t");
        int a = sc.nextInt();
        System.out.print("b" + "\t");
        int b = sc.nextInt();
        System.out.print("c" + "\t");
        int c = sc.nextInt();
        System.out.print("d" + "\t");
        int d = sc.nextInt();
        reminderNum(a, b, c, d);

        int x = sc.nextInt();
        int y = sc.nextInt();
        exactSquare(x, y);

        countDigit(x, d);
        int num = sc.nextInt();
        reverseNum(num);
        allDivisor(x);
        countDivisor(x);
        printPicture(x);
        checkerboardPattern(x);
        int n=scanner.nextInt();
        multiplicationTable(n);
        patternA();
        patternB();
        patternC();
        patternD();

    }
}
