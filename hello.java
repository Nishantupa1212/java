import java.util.*;
class HelloWorld {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=input.nextInt();
        int digit=0;
        while(n!=0)
        {
            n=n/10;
            digit++;
        }
        System.out.print("Number of digits are "+digit);
    }
}
