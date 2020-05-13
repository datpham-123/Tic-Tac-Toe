import java.util.Scanner;

public class Validate {
    public int verifyIntegerNumber(String notifyInput, int start, int end) {
        Scanner scan = new Scanner(System.in);
        while (true) { //
            System.out.print(notifyInput);
            String inputInteger = scan.nextLine().trim();
            if (inputInteger.isEmpty()) {
                System.out.println("Please enter data");
            } else {
                try {
                    int input = 0;
                    input = Integer.parseInt(inputInteger);
                    if (input >= start && input <= end) {
                        return input;
                    }
                    System.out.println("You must enter data >0");

                } catch (NumberFormatException e) {
                    if (inputInteger.matches("^[0-9]+([\\.\\,][0-9]+)?$")) {
                        System.out.println("You can't enter double number");
                    } else {
                        System.out.println("You must enter data is number");
                    }

                }
            }
        }
    }
}
