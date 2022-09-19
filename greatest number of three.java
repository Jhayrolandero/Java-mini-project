import java.util.Scanner;
class input{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.println("Enter first number: ");
        a = input.nextInt();
        System.out.println("Enter second number: ");
        b = input.nextInt();
        System.out.println("Enter third number: ");
        c = input.nextInt();



        if (a >= b && a >= c){
            System.out.println("The largest number is "+ a);
        }
        else if(b >= a && b >= c){
            System.out.println("The largest number is "+ b);
        }
        else if(c >= b && c >= a){
            System.out.println("The largest number is "+ c);
        }
        else{
            System.out.printf("Invalid input");
        }
    }
}
