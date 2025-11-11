package level2ex1;

public class Main {

    private static void readByteCheck(){
        byte input;

        System.out.println("--- Byte part ---");
        input = Input.readByte("Enter a byte  [in range -128 to 127]: ");
        System.out.println("Your input is : " + input + "\n");
    }

    private static void readIntCheck(){
        int input;

        System.out.println("--- Int part ---");
        input = Input.readInt("Enter a integer [ range -2147483648 to 2147483647 ]: ");
        System.out.println("Your input is : " + input + "\n");
    }

    private static void readFloatCheck() {
        float input;

        System.out.println("--- Float part ---");
        input = Input.readFloat("Enter a float (Depending on Regional Configuration in your system, you might need to enter '.' or ',' . Examples : \"4.5\" or \"4,5\" (depending on your System' Regional Configuration)");
        System.out.println("Your input is : " + input + "\n");
    }

    private static void readDoubleCheck(){
        double input;

        System.out.println("--- Double part ---");
        input = Input.readDouble("Enter a double (Depending on Regional Configuration in your system, you might need to enter '.' or ',' . Examples : \"4.5\" or \"4,5\" (depending on your System' Regional Configuration)");
        System.out.println("Your input is : " + input + "\n");
    }

    private static void readCharCheck(){
        char input;

        System.out.println("--- Char part ---");
        input = Input.readChar("Enter a char : ");
        System.out.println("Your input is : " + input + "\n");
    }

    private static void readStringCheck(){
        String input;

        System.out.println("--- String part ---");
        input = Input.readString("Enter a String : ");
        System.out.println("Your input is : " + input + "\n");
    }

    private static void readYesNoCheck(){
        boolean input;

        System.out.println("--- Boolean part ---");
        input = Input.readYesNo("Answer (y/n): ");
        System.out.print("Your input is : ");
        if (input)
            System.out.println("'y'\n");
        else
            System.out.println("'n'\n");
    }

    public static void main(String args[]){

        readByteCheck();
        readIntCheck();
        readFloatCheck();
        readDoubleCheck();
        readCharCheck();
        readStringCheck();
        readYesNoCheck();
    }
}
