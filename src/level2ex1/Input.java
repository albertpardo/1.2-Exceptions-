package level2ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    //InputMismatchException
    public static byte readByte(String message) {
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
        return inputByte;
    }

    public static int readInt(String message) {
        return 0;
    }

    public static float readFloat(String message) {
        return 0.0f;
    }

    public static double readDouble(String message) {
        return 0.0;
    }

    // personalException
    public static char readChar(String message) throws personalException{
        return '2';
    }

    public static String readString(String message) throws personalException{
        return "2";
    }

    public static boolean readYesNo(String message) {
        return false;
    }
}
