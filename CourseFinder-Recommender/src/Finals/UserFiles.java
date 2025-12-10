package Finals;

import java.io.*;
import java.util.HashMap;

public class UserFiles {

    // Full path to your accounts file
    private static final String FILE_PATH = "C:\\Users\\user\\Course-Finder-2\\CourseFinder-Recommender\\src\\accounts.txt.txt";

    // Save accounts to file
    public static void saveAccounts(HashMap<String, String> accounts) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (String username : accounts.keySet()) {
                pw.println(username + "," + accounts.get(username));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Load accounts from file
    public static HashMap<String, String> loadAccounts() {
        HashMap<String, String> accounts = new HashMap<>();

        File file = new File(FILE_PATH);
        if (!file.exists()) return accounts;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    accounts.put(parts[0], parts[1]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return accounts;
    }
}
