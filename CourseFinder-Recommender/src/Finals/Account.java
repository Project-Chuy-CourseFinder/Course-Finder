package Finals;

public class Account {

    public String fullName;
    public String studentID;
    public String email;
    public String username;
    public String password; // encrypted (Caesar Cipher)

    // =========================
    // 🧾 Constructor
    // =========================
    public Account(String fullName, String studentID, String email, String username, String password) {
        this.fullName = fullName;
        this.studentID = studentID;
        this.email = email;
        this.username = username;

        // 🔐 Encrypt password before saving
        this.password = Utils.caesarEncrypt(password, 3);
    }

    // =========================
    // 🔓 Verify password (used in Login)
    // =========================
    public boolean checkPassword(String inputPassword) {
        String encryptedInput = Utils.caesarEncrypt(inputPassword, 3);
        return encryptedInput.equals(this.password);
    }

    // =========================
    // 💾 Save format (DO NOT CHANGE)
    // username|password|fullName|studentID|email
    // =========================
    @Override
    public String toString() {
        return username + "|" + password + "|" + fullName + "|" + studentID + "|" + email;
    }

    // =========================
    // 📂 Load from file
    // =========================
    public static Account fromString(String data) {
        String[] parts = data.split("\\|");
        if (parts.length != 5) return null;

        Account acc = new Account(
                parts[2], // fullName
                parts[3], // studentID
                parts[4], // email
                parts[0], // username
                ""         // password placeholder
        );

        // ⚠️ Override encrypted password from file
        acc.password = parts[1];
        return acc;
    }
}
