import java.util.Scanner;

public class hackerrankexamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = 12;
        System.out.println("Please enter second number");
        int b = 13;
        System.out.println("Please enter the operator u wanna use : " +
                " [1-Add, 2-Substract , 3-Multiply, 4- Divide]");

        int op =  scanner.nextInt();
        if(op == 1){
            System.out.println(a+b);
        }else if(op == 2 ){
            System.out.println(a-b);
        }else if(op==3){
            System.out.println(a*b);
        }else if(op==4){
            System.out.println(a/b);
        } else {
            System.out.println("Invalid operator");
        }
    }

    }

