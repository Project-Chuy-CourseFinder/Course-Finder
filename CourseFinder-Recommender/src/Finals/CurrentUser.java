package Finals;

public class CurrentUser {
    public static String fullName;
    public static String studentID;
    public static String email;
    public static String username;

    // Set the current user when logging in
    public static void setUser(String fullName, String studentID, String email, String username) {
        CurrentUser.fullName = fullName;
        CurrentUser.studentID = studentID;
        CurrentUser.email = email;
        CurrentUser.username = username;
    }
}
