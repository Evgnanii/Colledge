import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
/*
 * Created by JFormDesigner on Tue Aug 18 11:59:20 MSK 2020
 */


/**
 * @author evgnanii
 */


public class MainPanel extends JFrame {
    public MainPanel() {
        setVisible(true);
        initComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        fio = new JFormattedTextField();
        passport = new JFormattedTextField();
        date = new JFormattedTextField();
        address = new JFormattedTextField();
        phones = new JFormattedTextField();
        prof = new JFormattedTextField();
        birth = new JFormattedTextField();
        school = new JFormattedTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label15 = new JLabel();
        dad = new JFormattedTextField();
        dadAddress = new JFormattedTextField();
        stage = new JFormattedTextField();
        momAddress = new JFormattedTextField();
        mom = new JFormattedTextField();
        label12 = new JLabel();
        label13 = new JLabel();
        label14 = new JLabel();
        label19 = new JLabel();
        invalid = new JCheckBox();
        comboBox2 = new JComboBox();
        button1 = new JButton();
        sirot = new JCheckBox();
        chS = new JCheckBox();
        multiChild = new JCheckBox();
        domitory = new JCheckBox();
        btnGroup = new JButton();
        label16 = new JLabel();
        fioRod = new JFormattedTextField();
        btnForIzv = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
            .EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax
            .swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,
            12),java.awt.Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans
            .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.
            getPropertyName()))throw new RuntimeException();}});

            //---- label2 ----
            label2.setText("\u0410\u0434\u0440\u0435\u0441");

            //---- label3 ----
            label3.setText("\u0422\u0435\u043b\u0435\u0444\u043e\u043d\u044b");

            //---- label4 ----
            label4.setText("\u0414\u0430\u0442\u0430 \u043f\u043e\u0434\u0430\u0447\u0438");

            //---- label5 ----
            label5.setText("\u0413\u0440\u0443\u043f\u043f\u0430");

            //---- label6 ----
            label6.setText("\u0424\u0418\u041e");

            //---- label7 ----
            label7.setText("\u041f\u0430\u0441\u043f\u043e\u0440\u0442");

            //---- label8 ----
            label8.setText("\u041f\u0440\u043e\u0444\u0435\u0441\u0441\u0438\u044f");

            //---- label9 ----
            label9.setText("\u0414\u0430\u0442\u0430 \u0440\u043e\u0436\u0434\u0435\u043d\u0438\u044f");

            //---- label10 ----
            label10.setText("\u0423\u0447\u0440\u0435\u0436\u0434\u0435\u043d\u0438\u0435 \u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f");

            //---- label11 ----
            label11.setText("\u041e\u0442\u0435\u0446");

            //---- label12 ----
            label12.setText("\u0410\u0434\u0440\u0435\u0441 \u043c\u0430\u0442\u0435\u0440\u0438");

            //---- label13 ----
            label13.setText("\u041c\u0430\u0442\u044c");

            //---- label14 ----
            label14.setText("\u0410\u0434\u0440\u0435\u0441 \u043e\u0442\u0446\u0430");

            //---- label19 ----
            label19.setText("\u0421\u0442\u0430\u0436");

            //---- invalid ----
            invalid.setText("\u0418\u043d\u0432\u0430\u043b\u0438\u0434");

            //---- button1 ----
            button1.setText("\u0421\u043e\u0437\u0434\u0430\u0442\u044c \u0437\u0430\u044f\u0432\u043b\u0435\u043d\u0438\u0435");

            //---- sirot ----
            sirot.setText("\u0421\u0438\u0440\u043e\u0442\u0430");

            //---- chS ----
            chS.setText("\u0427\u0441");

            //---- multiChild ----
            multiChild.setText("\u041c\u043d\u043e\u0433\u043e\u0434\u0435\u0442\u043d\u044b\u0439");

            //---- domitory ----
            domitory.setText("\u041e\u0431\u0449\u0435\u0436\u0438\u0442\u0438\u0435");

            //---- btnGroup ----
            btnGroup.setText("\u0413\u0440\u0443\u043f\u043f\u044b");

            //---- label16 ----
            label16.setText("\u0424\u0418\u041e \u0440\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u0438\u0439 \u043f\u0430\u0434\u0435\u0436");

            //---- btnForIzv ----
            btnForIzv.setText("\u0414\u043b\u044f \u0438\u0437\u0432\u0435\u0449\u0435\u043d\u0438\u044f");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(83, Short.MAX_VALUE)
                        .addComponent(btnGroup)
                        .addGap(81, 81, 81)
                        .addComponent(button1)
                        .addGap(63, 63, 63)
                        .addComponent(btnForIzv)
                        .addGap(73, 73, 73))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label14, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label13, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label12, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label19, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(sirot)
                                    .addComponent(invalid))
                                .addGap(59, 59, 59)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label15, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(multiChild)
                                    .addComponent(chS)))
                            .addComponent(label16, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(fioRod, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(phones, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(school, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(birth, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(fio, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(momAddress, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(mom, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(dad, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(passport, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(prof, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(dadAddress, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(stage, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                            .addComponent(domitory))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(fioRod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label16))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(fio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(phones, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(school, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(birth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(prof, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(passport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label11)
                            .addComponent(dad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(dadAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label14))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(mom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label13))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(momAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label12))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label19)
                            .addComponent(stage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(sirot)
                            .addComponent(chS)
                            .addComponent(domitory))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(invalid)
                            .addComponent(multiChild))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(btnGroup)
                            .addComponent(btnForIzv))
                        .addGap(35, 35, 35)
                        .addComponent(label15))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        new Groups();
        btnForIzv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ForIzv();
            }
        });
        comboBoxModel = new DefaultComboBoxModel(Groups.getGroups().toArray());
        comboBox2.setModel(comboBoxModel);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createStatement();
            }
        });
        btnGroup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GroupSettings();

            }
        });
    }

    private void createStatement() {
        /*
        1 name
        2 specialty
        3 address
        4 birth
        5 date
        6 stage
        7 prof
        8 dormitory
        9 dad
        10 dadaddress
        11 mom
        12 momaddress
        13 passport
        14 sirot
        15 school
        16 phone
        17 chaes
        18 invalid
        19 manydet
        
        */

        try {
            String specialty = String.valueOf(comboBox2.getSelectedItem());
            System.out.println(specialty);
            String fio = this.fio.getText();
            String passport = this.passport.getText();
            String date = this.date.getText();
            String address = this.address.getText();
            String phones = this.phones.getText();
            String prof = this.prof.getText();
            String birth = this.birth.getText();
            String school = this.school.getText();
            String dad = this.dad.getText();
            String dadAddress = this.dadAddress.getText();
            String stage = this.stage.getText();
            String mom = this.mom.getText();
            String momAddress = this.momAddress.getText();


            List<String> values = new ArrayList<String>();
            values.add(fio);
            values.add(specialty);
            values.add(address);
            values.add(birth);
            values.add(date);
            values.add(stage);
            values.add(prof);
            if (domitory.isSelected()) {
                values.add("+");
            } else values.add("-");
            values.add(dad);
            values.add(dadAddress);
            values.add(mom);
            values.add(momAddress);
            values.add(passport);
            if (sirot.isSelected()) {
                values.add("+");
            } else values.add("-");
            values.add(school);
            values.add(phones);
            if (chS.isSelected()) {
                values.add("+");
            } else values.add("-");
            if (invalid.isSelected()) {
                values.add("+");
            } else values.add("-");
            if (multiChild.isSelected()) {
                values.add("+");
            } else values.add("-");

            Parser.addToStatement(values);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Введены не все обязательные поля!");
            e.printStackTrace();
        }
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JFormattedTextField fio;
    private JFormattedTextField passport;
    private JFormattedTextField date;
    private JFormattedTextField address;
    private JFormattedTextField phones;
    private JFormattedTextField prof;
    private JFormattedTextField birth;
    private JFormattedTextField school;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label15;
    private JFormattedTextField dad;
    private JFormattedTextField dadAddress;
    private JFormattedTextField stage;
    private JFormattedTextField momAddress;
    private JFormattedTextField mom;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label19;
    private JCheckBox invalid;
    private JComboBox comboBox2;
    private JButton button1;
    private JCheckBox sirot;
    private JCheckBox chS;
    private JCheckBox multiChild;
    private JCheckBox domitory;
    private JButton btnGroup;
    private JLabel label16;
    private JFormattedTextField fioRod;
    private JButton btnForIzv;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static DefaultComboBoxModel comboBoxModel;
}
