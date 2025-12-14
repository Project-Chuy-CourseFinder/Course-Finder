
package Finals;

import javax.swing.*;
import java.util.ArrayList;

public class GeneratingFrame extends javax.swing.JFrame {

    private ArrayList<String> recommendations; // Store recommendations

    // Constructor receiving recommendations
    public GeneratingFrame(ArrayList<String> recommendations) {
        this.recommendations = recommendations;
        initComponents();
        this.setLocationRelativeTo(null);

        // Start the generation animation and then open ResultsFrame
        startGeneration();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FlippingBookGIF = new javax.swing.JLabel();
        generating = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(825, 680));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        FlippingBookGIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon-book1.gif"))); // NOI18N

        generating.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ggg.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(FlippingBookGIF)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generating)
                .addGap(259, 259, 259))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(FlippingBookGIF, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generating, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Start the generation animation
    private void startGeneration() {
        // Use a Swing Timer to simulate a short delay
        Timer timer = new Timer(9000, e -> {
            ResultsFrame resultsFrame = new ResultsFrame();
            resultsFrame.setRecommendations(recommendations); // Pass recommendations
            resultsFrame.setVisible(true);
            this.dispose(); // Close GeneratingFrame
        });
        timer.setRepeats(false);
        timer.start();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GeneratingFrame(new ArrayList<>()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlippingBookGIF;
    private javax.swing.JLabel generating;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
