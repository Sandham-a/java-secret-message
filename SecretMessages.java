import java.util.Scanner;

public class SecretMessages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message to encode or decode:");
        String message = scan.nextLine();
        StringBuilder output = new StringBuilder();

        for(int x = message.length()-1; x >= 0; x--){
            output.append(message.charAt(x));
        }//end of for loop

        System.out.println(output);
    }//end of main method
}//end of SecretMessage Class