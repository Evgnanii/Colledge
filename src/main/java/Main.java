import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Aug 18 11:40:54 MSK 2020
 */



/**
 * @author unknown
 */
public class Main extends JPanel {
    public Main() {
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        textField1 = new JTextField();
        formattedTextField1 = new JFormattedTextField();
        panel1 = new JPanel();
        checkBox1 = new JCheckBox();
        toggleButton1 = new JToggleButton();
        formattedTextField2 = new JFormattedTextField();

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
            .EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax
            .swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,
            12),java.awt.Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans
            .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.
            getPropertyName()))throw new RuntimeException();}});

            //---- checkBox1 ----
            checkBox1.setText("text");

            //---- toggleButton1 ----
            toggleButton1.setText("text");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(checkBox1))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(toggleButton1))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(formattedTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(208, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(toggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(checkBox1)
                        .addGap(48, 48, 48)
                        .addComponent(formattedTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(80, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JTextField textField1;
    private JFormattedTextField formattedTextField1;
    private JPanel panel1;
    private JCheckBox checkBox1;
    private JToggleButton toggleButton1;
    private JFormattedTextField formattedTextField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
