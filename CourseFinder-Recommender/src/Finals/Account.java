package Finals;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Account {
    public String fullName;
    public String studentID;
    public String email;
    public String username;
    public String password; 

    public Account(String fullName, String studentID, String email, String username, String password) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.email = email;
        this.username = username;
        this.password = md5(password); 
    }

    @Override
    public String toString() {
        
        return username + "," + password + "," + fullName + "," + studentID + "," + email;
    }

    public static Account fromString(String data) {
        String[] parts = data.split(",");
        if (parts.length != 5) return null;
        Account acc = new Account(parts[2], parts[3], parts[4], parts[0], ""); 
        acc.password = parts[1]; 
        return acc;
    }

    // Encrypt string with MD5
    public static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    // Check if input password matches stored password
    public boolean checkPassword(String input) {
        return password.equals(md5(input));
    }
}
