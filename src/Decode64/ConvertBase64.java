package Decode64;

import java.util.Base64;

public class ConvertBase64 {
    public static String decode(String to_decode) {
        try {
            if (to_decode.isBlank()) {
                throw new Exception();
            }
            Base64.Decoder Decoder = Base64.getDecoder();
            byte[] decodified_bytes = Decoder.decode(to_decode);
            String decodified_str = new String(decodified_bytes);
            return decodified_str;
        } catch (Exception e) {
            return "Entrada inválida (" + e.toString() + ")";
        }
    }
}
