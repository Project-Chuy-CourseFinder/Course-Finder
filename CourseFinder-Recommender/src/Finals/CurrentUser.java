package Finals;

import java.io.*;
import java.util.ArrayList;

public class CurrentUser {
    public static String fullName;
    public static String studentID;
    public static String email;
    public static String username;
    public static ArrayList<String> savedCourses = new ArrayList<>();

    private static final String COURSES_FILE = "saved_courses.txt";

    // Set current user
    public static void setUser(String fullName, String studentID, String email, String username) {
        CurrentUser.fullName = fullName;
        CurrentUser.studentID = studentID;
        CurrentUser.email = email;
        CurrentUser.username = username;

        // Load saved courses for this user from file
        loadCourses();
    }

    // Add a course for the current user
    public static void addCourse(String course) {
        if (course != null && !course.isEmpty() && !savedCourses.contains(course)) {
            savedCourses.add(course);
            saveCourses(); // save immediately after adding
        }
    }

    // Remove a course
    public static void removeCourse(String course) {
        if (savedCourses.remove(course)) {
            saveCourses(); // save after removal
        }
    }

    // Load courses from file
    private static void loadCourses() {
        savedCourses.clear();
        File file = new File(COURSES_FILE);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Format: username|course
                String[] parts = line.split("\\|");
                if (parts.length == 2 && parts[0].equals(username)) {
                    savedCourses.add(parts[1]);
                }
            }
        } catch (Exception e) {
        }
    }

    // Save courses to file
    private static void saveCourses() {
        // We rewrite the whole file to keep multiple users' courses
        ArrayList<String> allLines = new ArrayList<>();
        File file = new File(COURSES_FILE);

        // Read existing lines for other users
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("\\|");
                    if (parts.length == 2 && !parts[0].equals(username)) {
                        allLines.add(line);
                    }
                }
            } catch (Exception e) {
            }
        }

        // Add current user's courses
        for (String course : savedCourses) {
            allLines.add(username + "|" + course);
        }

        // Write back all lines
        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            for (String line : allLines) {
                pw.println(line);
            }
        } catch (Exception e) {
        }
    }
}
