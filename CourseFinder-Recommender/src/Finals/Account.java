package Finals;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Account {
    public String fullName;
    public String studentID;
    public String email;
    public String username;
    public String password; // hashed

    public Account(String fullName, String studentID, String email, String username, String password) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.email = email;
        this.username = username;
        this.password = hashPassword(password); 
    }

    
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            return password; 
        }
    }

    @Override
    public String toString() {
        // Format: student|hashedPassword|FullName|StudentID|Email
        return "student | " + password + " | " + fullName + " | " + studentID + " | " + email;
    }

    public static Account fromString(String data) {
        String[] parts = data.split("\\|");
        if (parts.length != 5) return null;
        // The second param is hashed password; assign directly
        Account acc = new Account(parts[2], parts[3], parts[4], parts[0], "");
        acc.password = parts[1]; 
        return acc;
    }
}
