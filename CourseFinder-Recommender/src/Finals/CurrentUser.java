package Finals;

import java.util.ArrayList;

public class CurrentUser {
    public static String fullName;
    public static String studentID;
    public static String email;
    public static String username;
    public static ArrayList<String> savedCourses = new ArrayList<>();

    public static void setUser(String fullName, String studentID, String email, String username) {
        CurrentUser.fullName = fullName;
        CurrentUser.studentID = studentID;
        CurrentUser.email = email;
        CurrentUser.username = username;
        if (CurrentUser.savedCourses == null) {
            CurrentUser.savedCourses = new ArrayList<>();
        }
    }

    public static void addCourse(String course) {
        if (course != null && !course.isEmpty() && !savedCourses.contains(course)) {
            savedCourses.add(course);
        }
    }
}
