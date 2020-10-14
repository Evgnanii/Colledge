import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/*
 * Created by JFormDesigner on Fri Aug 28 12:18:26 MSK 2020
 */


/**
 * @author unknown
 */
public class GroupSettings extends JFrame {
    public GroupSettings() {
        initComponents();
        setVisible(true);
    }

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    private void initComponents() {
        listModel = new DefaultListModel();
        for (int i = 0; i < Groups.getGroups().size(); i++) {
            listModel.add(i, Groups.getGroups().get(i));
        }
        listGroups = new JList(listModel
        );


        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        createUIComponents();

        btnAdd = new JButton();
        btnDelete = new JButton();
        btnChange = new JButton();
        scrollPane1 = new JScrollPane();
        text = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();

        //---- btnAdd ----
        btnAdd.setText("\u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c");

        //---- btnDelete ----
        btnDelete.setText("\u0423\u0434\u0430\u043b\u0438\u0442\u044c");

        //---- btnChange ----
        btnChange.setText("\u0417\u0430\u043c\u0435\u043d\u0438\u0442\u044c");

        //======== scrollPane1 ========
        {

            //---- listGroups ----
            listGroups.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            scrollPane1.setViewportView(listGroups);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(text, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(btnAdd)
                                                                .addGap(74, 74, 74)
                                                                .addComponent(btnDelete)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                                                .addComponent(btnChange)))
                                                .addContainerGap())))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAdd)
                                        .addComponent(btnChange)
                                        .addComponent(btnDelete))
                                .addContainerGap(12, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addGroup();
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete();
            }
        });
        btnChange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
            }
        });

    }

    private void delete() {
    if (listGroups.isSelectionEmpty()) {
        JOptionPane.showMessageDialog(null, "Нужен выбор!");
        return;
    }
        int index = listGroups.getSelectedIndex();
        String outputLine = (String) listGroups.getModel().getElementAt(index);
        System.out.println(outputLine);
        try {
            File sourceFile = new File("специальности.txt");
            File outputFile = new File("Dictio2.txt");
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = null;
            writer = new BufferedWriter(new FileWriter(outputFile));
            String line = null;
            while ((line = reader.readLine()) != null) {

                if (!line.equals(outputLine) && !line.equals("")) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            reader.close();
            writer.close();
            boolean qwe = sourceFile.delete();
            boolean qwe1 = outputFile.renameTo(sourceFile);
            System.out.println(qwe + " " + qwe1);
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, "Проблемы с файлом для записи  или файлом специальности");
            exception.printStackTrace();
        }
        Groups.getGroups().remove(index);
        listModel.remove(index);
        MainPanel.comboBoxModel.removeElement(outputLine);
        System.out.println(Groups.getGroups());

    }

    private void addGroup() {
        String groupName = text.getText();
        if (groupName.equals("")) {
            JOptionPane.showMessageDialog(null, "Имя группые не должно быть пустым!");
            return;
        }
        Groups.getGroups().add(groupName);
        try {
            Files.write(Paths.get("специальности.txt"), ("\n" + groupName).getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Проблемы с файлом специальности.txt");
            return;
            //exception handling left as an exercise for the reader
        }
        listModel.add(listModel.getSize(), text.getText());
        MainPanel.comboBoxModel.addElement(groupName);

    }

    private void update() {
        delete();
        addGroup();
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnChange;
    private JScrollPane scrollPane1;
    private JList listGroups;
    private JTextField text;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    DefaultListModel listModel;
}
