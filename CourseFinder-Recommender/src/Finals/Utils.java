package Finals;

public class Utils {

    

    // Caesar Cipher encryption
    public static String caesarEncrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();
        shift = shift % 26;

        for (int i = 0; i < plaintext.length(); i++) {
            char character = plaintext.charAt(i);
            if (character >= 'a' && character <= 'z') {
                char shiftedChar = (char) (character + shift);
                if (shiftedChar > 'z') shiftedChar = (char) (character - 26 + shift);
                ciphertext.append(shiftedChar);
            } else if (character >= 'A' && character <= 'Z') {
                char shiftedChar = (char) (character + shift);
                if (shiftedChar > 'Z') shiftedChar = (char) (character - 26 + shift);
                ciphertext.append(shiftedChar);
            } else {
                ciphertext.append(character);
            }
        }
        return ciphertext.toString();
    }

    // Caesar Cipher decryption
    public static String caesarDecrypt(String ciphertext, int shift) {
        StringBuilder decrypted = new StringBuilder();
        shift = shift % 26;

        for (int i = 0; i < ciphertext.length(); i++) {
            char character = ciphertext.charAt(i);
            if (character >= 'a' && character <= 'z') {
                char shiftedChar = (char) (character - shift);
                if (shiftedChar < 'a') shiftedChar = (char) (character + 26 - shift);
                decrypted.append(shiftedChar);
            } else if (character >= 'A' && character <= 'Z') {
                char shiftedChar = (char) (character - shift);
                if (shiftedChar < 'A') shiftedChar = (char) (character + 26 - shift);
                decrypted.append(shiftedChar);
            } else {
                decrypted.append(character);
            }
        }
        return decrypted.toString();
    }
}
