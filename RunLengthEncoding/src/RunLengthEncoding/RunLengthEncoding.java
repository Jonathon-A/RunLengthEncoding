package RunLengthEncoding;

import java.util.Scanner;

public class RunLengthEncoding {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("Input text that should be compressesd");
        String str = input.nextLine();

        String Compressedstr = "";

        char PrevCharacter = str.charAt(0);
        int Freq = 0;
        for (int i = 0; i < str.length(); i++) {
            if (PrevCharacter == str.charAt(i)) {
                Freq++;
            } else {
                Compressedstr += PrevCharacter + " " + Freq + " ";
                PrevCharacter = str.charAt(i);
                Freq = 1;
            }
        }
        Compressedstr += PrevCharacter + " " + Freq + " ";

        System.out.println("Compressed text:");
        System.out.println(Compressedstr);

    }

}
