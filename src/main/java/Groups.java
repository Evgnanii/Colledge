import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Groups {
    public static List getGroups() {
        return groups;
    }

    public static void setGroups(List groups) {
        Groups.groups = groups;
    }

    public Groups() {
        Scanner sc = null;
        List<String> specialities;
        try {
            sc = new Scanner(new File("специальности.txt"));
            specialities = new ArrayList<String>();
            while (sc.hasNextLine()) {
                specialities.add(sc.nextLine());

            }
            groups = specialities;


        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Не найден файлы содержащий специальности!");
            ;
            System.exit(0);
        }
        finally {
            sc.close();
        }
    }

    private static List<String> groups;

}
