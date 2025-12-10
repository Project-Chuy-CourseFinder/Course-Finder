package Finals;

import java.security.MessageDigest;

public class Account {
    public String fullName;
    public String studentID;
    public String email;
    public String username;
    public String password; // stored as hashed

    // Constructor for new accounts (hashes password)
    public Account(String fullName, String studentID, String email, String username, String password) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.email = email;
        this.username = username;
        this.password = hashPassword(password); // hash password for new accounts
    }

    // Constructor for loading accounts from file (password already hashed)
    public Account(String fullName, String studentID, String email, String username, String password, boolean isHashed) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.email = email;
        this.username = username;
        this.password = isHashed ? password : hashPassword(password);
    }

    // Hash password using MD5
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return password; // fallback
        }
    }

    @Override
    public String toString() {
        // Format for accounts.txt: student|hashedPassword|FullName|StudentID|Email
        return "student|" + password + "|" + fullName + "|" + studentID + "|" + email;
    }

    // Create an Account object from a line in accounts.txt
    public static Account fromString(String data) {
        String[] parts = data.split("\\|"); // split by |
        if (parts.length != 5) return null;
        // parts[1] = hashed password, so use constructor with isHashed=true
        return new Account(parts[2], parts[3], parts[4], parts[0], parts[1], true);
    }
}
