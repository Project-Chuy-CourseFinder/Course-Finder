package Finals;

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
        this.password = password; 
    }

    @Override
    public String toString() {
        return username + "|" + password + "|" + fullName + "|" + studentID + "|" + email;
    }

    public static Account fromString(String data) {
        String[] parts = data.split("\\|");
        if (parts.length != 5) return null;
        return new Account(parts[2], parts[3], parts[4], parts[0], parts[1]);
    }
}
