import java.util.Scanner;
import Decode64.ConvertBase64;

public class Main {
    public static void main(String[] args) {
        String decodified_string_or_error;
        if (args.length > 0) {
            String to_decode = args[0];
            decodified_string_or_error = ConvertBase64.decode(to_decode);
        } else {
            Scanner Reader = new Scanner(System.in);
            System.out.print("Insira o texto codificado: ");
            String in_base64String = Reader.nextLine();
            decodified_string_or_error = ConvertBase64.decode(in_base64String);
            Reader.close();
        }
        System.out.println(decodified_string_or_error);
    }
}
