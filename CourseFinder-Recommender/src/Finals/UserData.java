package Finals;

import java.io.*;
import java.util.LinkedHashMap;

public class UserData {

    // Use centralized file path from Utils
    private static final String FILE_DIR = "C:\\Users\\Dell\\OneDrive\\Documents\\CF-Project\\Course-Finder\\CourseFinder-Recommender\\Data";
    private static final String FILE_PATH = FILE_DIR + "\\accounts.txt";

    // Key = username, Value = Account object
    public static LinkedHashMap<String, Account> accounts = loadAccounts();


    // Load accounts from file
    private static LinkedHashMap<String, Account> loadAccounts() {
        LinkedHashMap<String, Account> map = new LinkedHashMap<>();

        try {
            File dir = new File(FILE_DIR);
            if (!dir.exists()) {
                dir.mkdirs(); // create folder if missing
            }

            File file = new File(FILE_PATH);
            if (!file.exists()) {
                file.createNewFile(); // create file if missing
            }

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    Account acc = Account.fromString(line);
                    if (acc != null) {
                        map.put(acc.username, acc);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }


    //  Save or update ONE account
    public static void saveAccount(Account acc) {
        accounts.put(acc.username, acc); // add or update
        saveAllAccounts();
    }

    // Overwrite all accounts to file
    private static void saveAllAccounts() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH, false))) {
            for (Account acc : accounts.values()) {
                pw.println(acc.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
