package level2ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    //InputMismatchException
    public static byte readByte(String message) {
        //Scanner scanner = new Scanner(System.in);
        byte inputByte = 0;
        boolean goodInput = false;

        while (!goodInput){
            try {
                System.out.println(message);
                inputByte = scanner.nextByte();
                goodInput = true;
            } catch (InputMismatchException e){
                System.err.println("- EXCEPTION : It's not a byte [" + e + "].");
            }
            scanner.nextLine();
        }
        return inputByte;
    }

    public static int readInt(String message) {
        //Scanner scanner = new Scanner(System.in);
        int inputInt = 0;
        boolean goodInput = false;

        while (!goodInput){
            try {
                System.out.println(message);
                inputInt = scanner.nextInt();
                goodInput = true;
            } catch (InputMismatchException e) {
                System.err.println("- EXCEPTION : It's no an int [" + e + "].");
            }
            scanner.nextLine();
        }
        return inputInt;
    }

    public static float readFloat(String message) {
        float inputFloat = 0.0f;
        boolean goodInput = false;

        while (!goodInput) {
            try {
                System.out.println(message);
                inputFloat = scanner.nextFloat();
                goodInput = true;
            } catch (InputMismatchException e) {
                System.err.println("- EXCEPTION : Format Error. It's no float [" + e + "].");
            }
            scanner.nextLine();
        }
        return inputFloat;
    }

    public static double readDouble(String message) {
        double inputDouble = 0.0f;
        boolean goodInput = false;

        while (!goodInput) {
            try {
                System.out.println(message);
                inputDouble = scanner.nextDouble();
                goodInput = true;
            } catch (InputMismatchException e) {
                System.err.println("- EXCEPTION : Format Error. It's no double [" + e + "].");
            }
            scanner.nextLine();
        }
        return inputDouble;
    }

    // personalException
    public static char readChar(String message) throws PersonalException {
        char inputChar = '\0';
        boolean goodInput = false;

        while (!goodInput) {
            try {
                String inputString;

                System.out.println(message);
                inputString = scanner.nextLine();
                if (inputString.length() == 1) {
                    inputChar = inputString.charAt(0);
                    goodInput = true;
                }
                else
                    throw new PersonalException("No valid input as char");
            } catch (PersonalException e) {
                System.err.println("- EXCEPTION : It's not a char [" + e + "].");
            }
        }

        return inputChar;
    }

    public static String readString(String message) throws PersonalException {
        return "2";
    }

    public static boolean readYesNo(String message) {
        return false;
    }
}
