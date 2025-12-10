package Finals;

import java.io.*;
import java.util.LinkedHashMap;

public class UserData {
    private static final String FILE_PATH = "C:\\Users\\user\\Course-Finder-2\\CourseFinder-Recommender\\src\\accounts.txt";

    // Key = username, Value = Account object
    public static LinkedHashMap<String, Account> accounts = loadAccounts();

    // Load all accounts from file
    private static LinkedHashMap<String, Account> loadAccounts() {
        LinkedHashMap<String, Account> map = new LinkedHashMap<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) return map;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                Account acc = Account.fromString(line);
                if (acc != null) {
                    map.put(acc.username, acc);
                }
            }
        } catch (Exception e) {
        }
        return map;
    }

    // Append a new account to the file
    public static void saveAccount(Account acc) {
        accounts.put(acc.username, acc);
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH, true))) { // append mode
            pw.println(acc.toString());
        } catch (Exception e) {
        }
    }
}
