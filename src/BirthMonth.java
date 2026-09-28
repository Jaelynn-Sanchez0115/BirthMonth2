import java.util.Scanner;
public class BirthMonth {
    static void main() {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        IO.print("Enter your birth month [1-12]: ");

        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine(); //clear the newline from the buffer

            if (birthMonth >= 1 && birthMonth <= 12) {

                IO.println("You said your birth month is " + birthMonth);
            } else {
                IO.println("You entered an incorrect value: " + birthMonth);
                IO.println("Run the program again and try with a value in range.");
            }
        } else {
            trash = in.nextLine();
            IO.println("You must enter a valid number in range [1-12], not " + trash);
        }
    }
}
