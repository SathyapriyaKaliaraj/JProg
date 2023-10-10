//Finding Factors of fiven number

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf("Factors of %d is",n);
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
