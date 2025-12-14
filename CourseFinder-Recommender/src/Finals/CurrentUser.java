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

    // Set the current user and load their saved courses
    public static void setUser(String fullName, String studentID, String email, String username) {
        CurrentUser.fullName = fullName;
        CurrentUser.studentID = studentID;
        CurrentUser.email = email;
        CurrentUser.username = username;
        savedCourses.clear();
        loadCourses();
    }

    // Add a course and save immediately
    public static void addCourse(String course) {
        if (course != null && !course.isEmpty() && !savedCourses.contains(course)) {
            savedCourses.add(course);
            saveCourses();
        }
    }

    // Remove a course and save immediately
    public static void removeCourse(String course) {
        if (savedCourses.remove(course)) {
            saveCourses();
        }
    }

    // Load courses from file for this user
    private static void loadCourses() {
        savedCourses.clear();
        File file = new File(COURSES_FILE);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 2 && parts[0].equals(username)) {
                    savedCourses.add(parts[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Failed to load courses: " + e.getMessage());
        }
    }

    // Save courses to file for all users
    private static void saveCourses() {
        ArrayList<String> allLines = new ArrayList<>();
        File file = new File(COURSES_FILE);

        // Keep courses of other users
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("\\|");
                    if (parts.length == 2 && !parts[0].equals(username)) {
                        allLines.add(line);
                    }
                }
            } catch (IOException e) {
                System.err.println("Failed to read existing courses: " + e.getMessage());
            }
        }

        // Add current user's courses
        for (String course : savedCourses) {
            allLines.add(username + "|" + course);
        }

        // Write all courses back
        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            for (String line : allLines) {
                pw.println(line);
            }
        } catch (IOException e) {
            System.err.println("Failed to save courses: " + e.getMessage());
        }
    }
}
