package Finals;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class CatalogFrame extends javax.swing.JFrame {

    private ArrayList<String[]> courseList;

    // Add private fields to remember logged-in user info
    private String fullName;
    private String studentID;
    private String email;
    private String username;

    // Constructor that accepts user info
    public CatalogFrame(String fullName, String studentID, String email, String username) {
        this.courseList = new ArrayList<>();
        this.fullName = fullName;
        this.studentID = studentID;
        this.email = email;
        this.username = username;

        initComponents();
        loadCourses();
        displayCourses(courseList);
        this.setLocationRelativeTo(null);
    }

    public CatalogFrame() {
        this(CurrentUser.fullName, CurrentUser.studentID, CurrentUser.email, CurrentUser.username);
    }

    private void loadCourses() {
        courseList.clear();

        // ===== IT / CS =====
        // ===== IT / CS =====
        courseList.add(new String[]{"BSIT101", "Introduction to Computing", "Information Technology"});
        courseList.add(new String[]{"BSIT102", "Computer Programming 1", "Information Technology"});
        courseList.add(new String[]{"BSIT201", "Data Structures & Algorithms", "Information Technology"});
        courseList.add(new String[]{"BSIT202", "Database Management Systems", "Information Technology"});
        courseList.add(new String[]{"BSIT301", "Object-Oriented Programming", "Information Technology"});
        courseList.add(new String[]{"BSIT302", "Web Development", "Information Technology"});
        courseList.add(new String[]{"BSIT401", "Software Engineering", "Information Technology"});
        courseList.add(new String[]{"BSCS101", "Discrete Mathematics", "Computer Science"});
        courseList.add(new String[]{"BSCS205", "Computer Architecture", "Computer Science"});
        courseList.add(new String[]{"BSCS305", "Artificial Intelligence", "Computer Science"});
        courseList.add(new String[]{"BSCS310", "Machine Learning", "Computer Science"});
        courseList.add(new String[]{"BSCS315", "Operating Systems", "Computer Science"});

        // ===== Business / Management / Marketing =====
        courseList.add(new String[]{"BSBA101", "Principles of Management", "Business"});
        courseList.add(new String[]{"BSBA110", "Marketing Management", "Business"});
        courseList.add(new String[]{"BSBA201", "Organizational Behavior", "Business"});
        courseList.add(new String[]{"BSBA205", "Financial Management", "Business"});
        courseList.add(new String[]{"BSBA301", "Strategic Management", "Business"});
        courseList.add(new String[]{"BSBA310", "International Business", "Business"});
        courseList.add(new String[]{"BSBA315", "Entrepreneurship", "Business"});
        courseList.add(new String[]{"BSBA320", "Business Ethics", "Business"});
        courseList.add(new String[]{"BSBA325", "Business Analytics", "Business"});
        courseList.add(new String[]{"BSBA330", "Human Resource Management", "Business"});

        // ===== Education =====
        courseList.add(new String[]{"BSEd101", "Foundations of Education", "Education"});
        courseList.add(new String[]{"BSEd201", "Child & Adolescent Development", "Education"});
        courseList.add(new String[]{"BSEd301", "Curriculum Design", "Education"});
        courseList.add(new String[]{"BSEd305", "Educational Assessment", "Education"});
        courseList.add(new String[]{"BSEd401", "Instructional Technology", "Education"});
        courseList.add(new String[]{"BSEd405", "Special Education Methods", "Education"});
        courseList.add(new String[]{"BSEd410", "Classroom Management", "Education"});
        courseList.add(new String[]{"BSEd415", "Educational Psychology", "Education"});
        courseList.add(new String[]{"BSEd420", "Teaching Internship", "Education"});

        // ===== Hospitality / Tourism =====
        courseList.add(new String[]{"BSHM101", "Front Office Procedures", "Hospitality"});
        courseList.add(new String[]{"BSHM201", "Food & Beverage Services", "Hospitality"});
        courseList.add(new String[]{"BSHM301", "Hospitality Marketing", "Hospitality"});
        courseList.add(new String[]{"BSHM401", "Event Management", "Hospitality"});
        courseList.add(new String[]{"BSHM405", "Hotel Operations Management", "Hospitality"});
        courseList.add(new String[]{"BSHM410", "Travel and Tourism", "Hospitality"});
        courseList.add(new String[]{"BSHM415", "Customer Service Excellence", "Hospitality"});
        courseList.add(new String[]{"BSHM420", "Restaurant Management", "Hospitality"});

        // ===== Criminology =====
        courseList.add(new String[]{"CRIM101", "Introduction to Criminology", "Criminology"});
        courseList.add(new String[]{"CRIM205", "Forensic Photography", "Criminology"});
        courseList.add(new String[]{"CRIM301", "Criminal Law", "Criminology"});
        courseList.add(new String[]{"CRIM305", "Crime Scene Investigation", "Criminology"});
        courseList.add(new String[]{"CRIM401", "Criminal Psychology", "Criminology"});
        courseList.add(new String[]{"CRIM405", "Cybercrime Investigation", "Criminology"});
        courseList.add(new String[]{"CRIM410", "Juvenile Delinquency", "Criminology"});
        courseList.add(new String[]{"CRIM415", "Forensic Science Techniques", "Criminology"});

        // ===== Engineering / Architecture / Mechanical =====
        courseList.add(new String[]{"ARCH101", "Introduction to Architecture", "Engineering"});
        courseList.add(new String[]{"ARCH201", "Building Materials and Construction", "Engineering"});
        courseList.add(new String[]{"MECH101", "Mechanical Engineering Basics", "Engineering"});
        courseList.add(new String[]{"ENGR201", "Statics and Dynamics", "Engineering"});
        courseList.add(new String[]{"ENGR301", "Thermodynamics", "Engineering"});
        courseList.add(new String[]{"ENGR305", "Fluid Mechanics", "Engineering"});
        courseList.add(new String[]{"ENGR310", "Electrical Circuits", "Engineering"});
        courseList.add(new String[]{"ENGR315", "Engineering Design", "Engineering"});
        courseList.add(new String[]{"ARCH305", "Urban Planning", "Engineering"});
        courseList.add(new String[]{"MECH305", "Heat Transfer", "Engineering"});

        // ===== Arts / Creative Design =====
        courseList.add(new String[]{"ART101", "Fundamentals of Drawing", "Arts"});
        courseList.add(new String[]{"ART201", "Digital Illustration", "Arts"});
        courseList.add(new String[]{"ART301", "Graphic Design Principles", "Arts"});
        courseList.add(new String[]{"ART305", "Photography Basics", "Arts"});
        courseList.add(new String[]{"ART401", "Advanced Visual Arts", "Arts"});
        courseList.add(new String[]{"ART405", "3D Modeling and Animation", "Arts"});
        courseList.add(new String[]{"ART410", "Creative Portfolio Development", "Arts"});
        courseList.add(new String[]{"ART415", "Typography and Layout", "Arts"});

        // ===== Social Science =====
        courseList.add(new String[]{"SOC101", "Introduction to Sociology", "Social Science"});
        courseList.add(new String[]{"PSY101", "General Psychology", "Social Science"});
        courseList.add(new String[]{"ANT101", "Cultural Anthropology", "Social Science"});
        courseList.add(new String[]{"SOC201", "Social Research Methods", "Social Science"});
        courseList.add(new String[]{"PSY205", "Developmental Psychology", "Social Science"});
        courseList.add(new String[]{"ANT205", "Ethnographic Studies", "Social Science"});
        courseList.add(new String[]{"SOC305", "Political Sociology", "Social Science"});
        courseList.add(new String[]{"PSY310", "Cognitive Psychology", "Social Science"});
        courseList.add(new String[]{"ANT310", "Global Cultural Studies", "Social Science"});
        
        bubbleSortCourses(courseList);
    }

    private void displayCourses(ArrayList<String[]> list) {
        DefaultTableModel model = (DefaultTableModel) tblCourses.getModel();
        model.setRowCount(0); // clear table
        for (String[] course : list) {
            model.addRow(course);
        }
    }

    // Search courses by keyword (matches code, title, or category)
    private ArrayList<String[]> searchCourses(String keyword) {
        ArrayList<String[]> results = new ArrayList<>();
        keyword = keyword.toLowerCase();
        for (String[] course : courseList) {
            if (course[0].toLowerCase().contains(keyword)
                    || course[1].toLowerCase().contains(keyword)
                    || course[2].toLowerCase().contains(keyword)) {
                results.add(course);
            }
        }
        return results;
    }
    
    // BUBBLE SORT IMPLEMENTATION
    private void bubbleSortCourses(ArrayList<String[]> list) {
        int n = list.size();
        boolean swapped;

    public static void main(String[] args) {
        // Set a sample user (for testing)
        CurrentUser.setUser("John Mark", "2025001", "john@example.com", "johnmark");

        java.awt.EventQueue.invokeLater(() -> {
            new CatalogFrame().setVisible(true);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        SearchPanel = new javax.swing.JPanel();
        lblSearchCourse = new javax.swing.JLabel();
        txtSearchCourse = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        CoursesPanel = new javax.swing.JPanel();
        scrollPaneCourses = new javax.swing.JScrollPane();
        tblCourses = new javax.swing.JTable();
        FooterPanel = new javax.swing.JPanel();
        btnBackToDashboard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        HeaderPanel.setBackground(new java.awt.Color(0, 102, 204));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(900, 110));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Course Catalog");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/course-logo (1).png"))); // NOI18N

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitle)
                .addContainerGap(525, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTitle))
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SearchPanel.setBackground(new java.awt.Color(255, 255, 255));
        SearchPanel.setPreferredSize(new java.awt.Dimension(900, 140));

        lblSearchCourse.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSearchCourse.setForeground(new java.awt.Color(0, 102, 204));
        lblSearchCourse.setText("Search Course:");

        txtSearchCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCourseActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 102, 204));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(lblSearchCourse)
                .addGap(18, 18, 18)
                .addComponent(txtSearchCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchCourse)
                    .addComponent(txtSearchCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(39, 39, 39))
        );

        CoursesPanel.setBackground(new java.awt.Color(255, 255, 255));

        tblCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"BSIT101", "Introduction to Computing", "IT"},
                {"BSIT102", "Computer Programming 1", "IT"},
                {"BSIT201", "Data Structures & Algorithms", "IT"},
                {"BSIT202", "Database Management Systems", "IT"},
                {"BSIT301", "Object-Oriented Programming", "IT"},
                {"BSIT302", "Web Development", "IT"},
                {"BSCS101", "Discrete Mathematics", "CS"},
                {"BSCS205", "Computer Architecture", "CS"},
                {"BSEd101", "Foundations of Education", "Education"},
                {"BSEd201", "Child & Adolescent Development", "Education"},
                {"BSBA101", "Principles of Management", "Business"},
                {"BSBA110", "Marketing Management", "Business"},
                {"BSHM101", "Front Office Procedures", "Hospitality"},
                {"BSHM201", "Food & Beverage Services", "Hospitality"},
                {"CRIM101", "Introduction to Criminology", "Criminology"},
                {"CRIM205", "Forensic Photography", "Criminology"}
            },
            new String [] {
                "Code", "Course Title", "Category"
            }
        ));
        scrollPaneCourses.setViewportView(tblCourses);

        javax.swing.GroupLayout CoursesPanelLayout = new javax.swing.GroupLayout(CoursesPanel);
        CoursesPanel.setLayout(CoursesPanelLayout);
        CoursesPanelLayout.setHorizontalGroup(
            CoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CoursesPanelLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(scrollPaneCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        CoursesPanelLayout.setVerticalGroup(
            CoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CoursesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        FooterPanel.setBackground(new java.awt.Color(255, 255, 255));
        FooterPanel.setPreferredSize(new java.awt.Dimension(900, 100));

        btnBackToDashboard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBackToDashboard.setForeground(new java.awt.Color(0, 102, 204));
        btnBackToDashboard.setText("BACK TO DASHBOARD");
        btnBackToDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackToDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FooterPanelLayout = new javax.swing.GroupLayout(FooterPanel);
        FooterPanel.setLayout(FooterPanelLayout);
        FooterPanelLayout.setHorizontalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackToDashboard)
                .addGap(303, 303, 303))
        );
        FooterPanelLayout.setVerticalGroup(
            FooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnBackToDashboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CoursesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SearchPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FooterPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CoursesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackToDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToDashboardActionPerformed
        new DashboardFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackToDashboardActionPerformed

    private void txtSearchCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCourseActionPerformed
        btnSearchActionPerformed(evt);
    }//GEN-LAST:event_txtSearchCourseActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String keyword = txtSearchCourse.getText().trim();

        if (keyword.isEmpty()) {
            displayCourses(courseList);
            return;
        }

        ArrayList<String[]> searchResult = searchCourses(keyword);
        displayCourses(searchResult);
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CoursesPanel;
    private javax.swing.JPanel FooterPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton btnBackToDashboard;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSearchCourse;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollPaneCourses;
    private javax.swing.JTable tblCourses;
    private javax.swing.JTextField txtSearchCourse;
    // End of variables declaration//GEN-END:variables
}
