//Simple Calculator using switchcase

import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        do
        {
        System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division\n");
        int n=sc.nextInt();
        switch(n){
            case 1:int sum=a+b;
                   System.out.println("Sum of two numbers is :"+sum);
                   break;
            case 2:int sub=a-b;
                   System.out.println("Sum of two numbers is :"+sub);
                   break;
            case 3:int mul=a*b;
                   System.out.println("Sum of two numbers is :"+mul);
                   break;
            case 4:int div=a/b;
                   System.out.println("Sum of two numbers is :"+div);
                   break;
                   
        }
        System.out.println("\nenter i if yopu want to continue :");
        c=sc.nextInt();
        }while(c==1);
       
    }
}
