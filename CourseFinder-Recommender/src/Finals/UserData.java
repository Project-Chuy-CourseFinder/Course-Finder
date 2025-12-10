package Finals;

import java.io.*;
import java.util.HashMap;

public class UserData {
private static final String FILE_PATH = "C:\\Users\\user\\Course-Finder-2\\CourseFinder-Recommender\\src\\accounts.txt";

    public static HashMap<String, Account> accounts = loadAccounts();

    public static HashMap<String, Account> loadAccounts() {
        HashMap<String, Account> map = new HashMap<>();
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
            e.printStackTrace();
        }
        return map;
    }

    public static void save() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Account acc : accounts.values()) {
                pw.println(acc.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
