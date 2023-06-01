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

    static int checkvalidinteger(Scanner scan, String message) {
        int number;
        while (true) {
            System.out.print(message);
            String input = scan.nextLine();

            try {
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!!");
            }
        }
        return number;
    }

    public static void main(String args[]) {
        int x, y;
        try (Scanner scan = new Scanner(System.in)) {
            x = checkvalidinteger(scan, "Enter first number");
            y = checkvalidinteger(scan, "Enter Second number");
        }

        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Division");

        try (Scanner sc = new Scanner(System.in)) {
            int z = sc.nextInt();

            if (z == 1) {
                int result = add(x, y);
                System.out.println("The sum is " + result);
            }

            else if (z == 2) {
                int result = sub(x, y);
                System.out.println("The difference is " + result);
            }
             else if (z == 3) {
                int result = div(x, y);
                System.out.println("The division is " + result);
            } 
            else {
                System.out.println("Invalid");
            }
        }

    }
}
