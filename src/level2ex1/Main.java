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
        input = Input.readInt("Enter a integer [ range -2147483648 to 2147483647 ]");
        System.out.println("Your input is : " + input + "\n");
    }

    public static void main(String args[]){
        readByteCheck();
        readIntCheck();

    }
}
