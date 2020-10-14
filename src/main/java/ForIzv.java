
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.plaf.basic.BasicSliderUI;
/*
 * Created by JFormDesigner on Thu Sep 10 10:27:49 MSK 2020
 */


/**
 * @author unknown
 */
public class ForIzv extends JFrame {
    public ForIzv() {
        initComponents();
        setVisible(true);

        pack();
    }

    private void initComponents() {


        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        edDoc = new JComboBox();
        zayava = new JCheckBox();
        med = new JCheckBox();
        ct = new JCheckBox();
        family = new JCheckBox();
        photo = new JCheckBox();
        privil = new JCheckBox();
        label2 = new JLabel();
        tvDocs = new JTextField();
        label3 = new JLabel();
        comboBox2 = new JComboBox();
        label4 = new JLabel();
        tvName = new JTextField();
        label5 = new JLabel();
        spec = new JComboBox();
        label6 = new JLabel();
        numbergroup = new JTextField();
        btnCreateRaspisky = new JButton();
        tvPriv = new JTextField();
        label7 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 \u043e\u0431 \u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u0438");

        //---- zayava ----
        zayava.setText("\u0417\u0430\u044f\u0432\u043b\u0435\u043d\u0438\u0435");

        //---- med ----
        med.setText("\u041c\u0435\u0434. \u0421\u043f\u0440\u0430\u0432\u043a\u0430");

        //---- ct ----
        ct.setText("\u0421\u0435\u0440\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u044b \u0426\u0422");

        //---- family ----
        family.setText("\u0421\u043f\u0440\u0430\u0432\u043a\u0430 \u043e \u0441\u043e\u0441\u0442\u0430\u0432\u0435 \u0441\u0435\u043c\u044c\u0438");

        //---- photo ----
        photo.setText("\u0424\u043e\u0442\u043e\u0433\u0440\u0430\u0444\u0438\u0438");

        //---- privil ----
        privil.setText("\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u044b (\u043a\u043e\u043f\u0438\u0438), \u043f\u043e\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0430\u044e\u0449\u0438\u0435 \u043f\u0440\u0430\u0432\u043e \u043d\u0430 \u043b\u044c\u0433\u043e\u0442\u044b ");

        //---- label2 ----
        label2.setText("\u0414\u0440\u0443\u0433\u0438\u0435 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u044b");

        //---- label3 ----
        label3.setText("\u041f\u0440\u0438\u043d\u044f\u043b \u0441\u0435\u043a\u0440\u0435\u0442\u0430\u0440\u044c");

        //---- label4 ----
        label4.setText("\u0418\u043c\u044f(\u0440\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u0438\u0439 \u043f\u0430\u0434\u0435\u0436)");

        //---- label5 ----
        label5.setText("\u0421\u043f\u0435\u0446\u0438\u0430\u043b\u044c\u043d\u043e\u0441\u0442\u044c");

        //---- label6 ----
        label6.setText("\u041d\u043e\u043c\u0435\u0440/\u0433\u0440\u0443\u043f\u043f\u0430");

        //---- btnCreateRaspisky ----
        btnCreateRaspisky.setText("\u0421\u043e\u0437\u0434\u0430\u0442\u044c \u0440\u0430\u0441\u043f\u0438\u0441\u043a\u0443");

        //---- label7 ----
        label7.setText("\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u044b \u043e \u043b\u044c\u0433\u043e\u0442\u0430\u0445");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tvName, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(numbergroup, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edDoc, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(contentPaneLayout.createParallelGroup()
                                            .addComponent(zayava)
                                            .addComponent(ct)
                                            .addComponent(family)
                                            .addComponent(photo)
                                            .addComponent(privil)
                                            .addComponent(med)))
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spec, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tvPriv, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(tvDocs)
                                        .addComponent(comboBox2))))
                            .addGap(21, 21, 21))))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(251, 251, 251)
                    .addComponent(btnCreateRaspisky)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(tvName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(edDoc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(3, 3, 3)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(numbergroup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(tvPriv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label7))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(spec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(zayava)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ct)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(family)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(photo)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(privil)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(med)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(tvDocs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                    .addComponent(btnCreateRaspisky)
                    .addGap(17, 17, 17))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        String[] docs = new String[]{"аттестат о высшем образовании",
                "диплом с выпиской",
                "аттестата об общем среднем образовании , диплом с выпиской",
                "свидетельство об общем базовом образовании"};
        String[] tchs = new String[]{"Ю.А. Колесникович",
                "О.П. Застровская",
                "Р.В. Маркевич"};
        DefaultComboBoxModel comboBoxModel2 = new DefaultComboBoxModel(tchs);
        comboBox2.setModel(comboBoxModel2);
        DefaultComboBoxModel comboBoxModel1 = new DefaultComboBoxModel(docs);
        comboBox1.setModel(comboBoxModel1);
        DefaultComboBoxModel comboBoxModel3 = new DefaultComboBoxModel(Groups.getGroups().toArray());
        comboBox3.setModel(comboBoxModel3);
        btnCreateRaspisky.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                1 name
                2 document
                3 group
                4 privileges
                5 zayav
                6 ct
                7 family
                8 photo
                9 isPrivil
                10 med
                11 other
                12 sectret
                 */
                List<String> raspis = new ArrayList<String>();
                raspis.add()

            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JComboBox edDoc;
    private JCheckBox zayava;
    private JCheckBox med;
    private JCheckBox ct;
    private JCheckBox family;
    private JCheckBox photo;
    private JCheckBox privil;
    private JLabel label2;
    private JTextField tvDocs;
    private JLabel label3;
    private JComboBox comboBox2;
    private JLabel label4;
    private JTextField tvName;
    private JLabel label5;
    private JComboBox spec;
    private JLabel label6;
    private JTextField numbergroup;
    private JButton btnCreateRaspisky;
    private JTextField tvPriv;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
