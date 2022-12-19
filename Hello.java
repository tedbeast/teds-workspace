import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        System.out.println("Please input a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("You inputted a positive number");
        }else if(number < 0){
            System.out.println("You inputted a negative number");
        }
    }
    
    /*
     * Today's topics - 
     * the main method,
     * the scanner class,
     * the system.out.println statement,
     * code compilation
     * if/else statement
     */
}