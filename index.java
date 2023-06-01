import java.util.Scanner;

class index {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String args[]) {
        int x, y;
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter a number");
                String input = scan.nextLine();

                try {
                    x = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input!!");
                }
            }
            while (true) {
                System.out.println("Enter your second number");
                String input = scan.nextLine();
            
            try {
                y = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!!");
            }
   }
        }

        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Division");

        try (Scanner ne = new Scanner(System.in)) {
        int z=ne.nextInt();

        if(z==1){
        int result=add(x,y);
        System.out.println("The sum is "+ result);
        }

        else if(z==2){
        int result=sub(x, y);
        System.out.println("The difference is "+result);
        }
        else if(z==3){
        int result=div(x,y);
        System.out.println("The division is "+result);
        }
        else {
        System.out.println("Invalid");
        }
        }

    }
}