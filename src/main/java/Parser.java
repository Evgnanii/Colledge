import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.*;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*Последовательность данных в List:

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
14 privileges

*/
public class Parser {
    private static String name;
    private static String specialty;
    private static String address;
    private static String education;
    private static String birth;
    private static String date;
    private static String stage;
    private static String prof;
    private static String dormitory;
    private static String dad;
    private static String mom;
    private static String momAddress;
    private static String dadAddress;
    private static String passportFull;
    private static String passportNumber;
    private static String passportCode;
    private static String sirot;
    private static String phoneNumber;
    private static String chaes;
    private static String invalid;
    private static String manydet;

    static void createRasp(List<String> data) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).equals("")) {
                JOptionPane.showMessageDialog(null, "Заполнены не все поля!");
                return;
            }
        }
        XWPFDocument doc;
        XWPFDocument document;
        try {
            doc = new XWPFDocument(OPCPackage.open("src/main/resources/temp/raspis.docx"));

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy MM dd 'at' HH mm ss z");
            Date date1 = new Date(System.currentTimeMillis());
            System.out.println(formatter.format(date1));
            FileOutputStream fileOutputStream = new FileOutputStream("Расписка временная " + name + ".docx");
            doc.write(fileOutputStream);
            fileOutputStream.close();
            doc.close();
            document = new XWPFDocument(OPCPackage.open("Расписка временная " + name + ".docx"));

            for (XWPFParagraph p : document.getParagraphs()) {
                List<XWPFRun> runs = p.getRuns();
                if (runs != null) {
                    for (XWPFRun r : runs) {
                        String text = r.getText(0);

                        if (text != null && text.contains("specialty")) {
                            text = text.replace("specialty", specialty);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("address")) {
                            text = text.replace("address", address);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("name")) {
                            text = text.replace("name", name);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("phone")) {
                            text = text.replace("phone", phoneNumber);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("education")) {
                            text = text.replace("education", education);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("birth")) {
                            text = text.replace("birth", birth);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("stage")) {
                            text = text.replace("stage", stage);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("prof")) {
                            text = text.replace("prof", prof);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("dormitory")) {
                            text = text.replace("dormitory", dormitory);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("dad")) {
                            text = text.replace("dad", dad);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("mom")) {
                            text = text.replace("mom", mom);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("dadsaddress")) {
                            text = text.replace("dadsaddress", dadAddress);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("momsaddress")) {
                            text = text.replace("momsaddress", momAddress);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("privileges")) {
                            String stringBuilder = new String(" ");
                            if (sirot.equals("+")) {
                                stringBuilder = stringBuilder.concat(" сирота");
                            }

                            if (chaes.equals("+")) {
                                if (!stringBuilder.equals(" ")) {
                                    stringBuilder = stringBuilder.concat(",");
                                }
                                stringBuilder = stringBuilder.concat(" ЧАЭС");
                            }
                            if (manydet.equals("+")) {
                                if (!stringBuilder.equals(" ")) {
                                    stringBuilder = stringBuilder.concat(",");
                                }
                                stringBuilder = stringBuilder.concat(" многодетный");
                            }
                            if (invalid.equals("+")) {
                                if (!stringBuilder.equals(" ")) {
                                    stringBuilder = stringBuilder.concat(",");
                                }
                                stringBuilder = stringBuilder.concat(" инвалид");
                            }
                            if (stringBuilder.equals(" ")) {
                                stringBuilder = stringBuilder.concat("-.");
                            }
                            text = text.replace("privileges", stringBuilder);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("passport")) {
                            text = text.replace("passport", passportFull);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("date")) {
                            text = text.replace("date", date);
                            r.setText(text, 0);
                        }
                    }
                }
            }

            for (XWPFTable tbl : document.getTables()) {
                {
                    for (XWPFTableRow row : tbl.getRows()) {
                        for (XWPFTableCell cell : row.getTableCells()) {
                            for (XWPFParagraph p : cell.getParagraphs()) {
                                for (XWPFRun r : p.getRuns()) {
                                    String text = r.getText(0);
                                    System.out.println(text);
                                    if (text != null && text.contains("specialty")) {
                                        text = text.replace("specialty", specialty);
                                        r.setText(text, 0);
                                    }
                                }
                            }
                        }
                    }
                }


            }
            FileOutputStream fileOutputStream1 = new FileOutputStream("Расписка " + name + ".docx");
            document.write(fileOutputStream1);
            document.close();
            File myObj = new File("Расписка временная " + name + ".docx");
            myObj.delete();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }

    }

    static void addToStatement(List<String> data) {
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
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).equals("")) {
                JOptionPane.showMessageDialog(null, "Заполнены не все поля!");
                return;
            }
        }
        name = data.get(0);
        specialty = data.get(1);
        address = data.get(2);
        birth = data.get(3);
        date = data.get(4);
        stage = data.get(5);
        prof = data.get(6);
        dormitory = data.get(7);
        dad = data.get(8);
        dadAddress = data.get(9);
        mom = data.get(10);
        momAddress = data.get(11);
        try {
            passportCode = data.get(12).substring(0, 8);
            passportNumber = data.get(12).substring(10, 25);
        } catch (StringIndexOutOfBoundsException q) {
            JOptionPane.showMessageDialog(null, "Строка с паспортом слишком короткая");
            q.printStackTrace();
            return;
        }
        passportFull = data.get(12);
        sirot = data.get(13);
        education = data.get(14);
        phoneNumber = data.get(15);
        chaes = data.get(16);
        invalid = data.get(17);
        manydet = data.get(18);

        XWPFDocument doc = null;
        XWPFDocument document = null;

        try {
            doc = new XWPFDocument(OPCPackage.open("src/main/resources/temp/temp.docx"));

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy MM dd 'at' HH mm ss z");
            Date date1 = new Date(System.currentTimeMillis());
            System.out.println(formatter.format(date1));
            FileOutputStream fileOutputStream = new FileOutputStream("Заявление временный " + name + ".docx");
            doc.write(fileOutputStream);
            fileOutputStream.close();
            doc.close();
            document = new XWPFDocument(OPCPackage.open("Заявление временный " + name + ".docx"));

            for (XWPFParagraph p : document.getParagraphs()) {
                List<XWPFRun> runs = p.getRuns();
                if (runs != null) {
                    for (XWPFRun r : runs) {
                        String text = r.getText(0);

                        if (text != null && text.contains("specialty")) {
                            text = text.replace("specialty", specialty);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("address")) {
                            text = text.replace("address", address);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("name")) {
                            text = text.replace("name", name);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("phone")) {
                            text = text.replace("phone", phoneNumber);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("education")) {
                            text = text.replace("education", education);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("birth")) {
                            text = text.replace("birth", birth);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("stage")) {
                            text = text.replace("stage", stage);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("prof")) {
                            text = text.replace("prof", prof);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("dormitory")) {
                            text = text.replace("dormitory", dormitory);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("dad")) {
                            text = text.replace("dad", dad);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("mom")) {
                            text = text.replace("mom", mom);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("dadsaddress")) {
                            text = text.replace("dadsaddress", dadAddress);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("momsaddress")) {
                            text = text.replace("momsaddress", momAddress);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("privileges")) {
                            String stringBuilder = new String(" ");
                            if (sirot.equals("+")) {
                                stringBuilder = stringBuilder.concat(" сирота");
                            }

                            if (chaes.equals("+")) {
                                if (!stringBuilder.equals(" ")) {
                                    stringBuilder = stringBuilder.concat(",");
                                }
                                stringBuilder = stringBuilder.concat(" ЧАЭС");
                            }
                            if (manydet.equals("+")) {
                                if (!stringBuilder.equals(" ")) {
                                    stringBuilder = stringBuilder.concat(",");
                                }
                                stringBuilder = stringBuilder.concat(" многодетный");
                            }
                            if (invalid.equals("+")) {
                                if (!stringBuilder.equals(" ")) {
                                    stringBuilder = stringBuilder.concat(",");
                                }
                                stringBuilder = stringBuilder.concat(" инвалид");
                            }
                            if (stringBuilder.equals(" ")) {
                                stringBuilder = stringBuilder.concat("-.");
                            }
                            text = text.replace("privileges", stringBuilder);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("passport")) {
                            text = text.replace("passport", passportFull);
                            r.setText(text, 0);
                        }
                        if (text != null && text.contains("date")) {
                            text = text.replace("date", date);
                            r.setText(text, 0);
                        }
                    }
                }
            }

            for (XWPFTable tbl : document.getTables()) {
                {
                    for (XWPFTableRow row : tbl.getRows()) {
                        for (XWPFTableCell cell : row.getTableCells()) {
                            for (XWPFParagraph p : cell.getParagraphs()) {
                                for (XWPFRun r : p.getRuns()) {
                                    String text = r.getText(0);
                                    System.out.println(text);
                                    if (text != null && text.contains("specialty")) {
                                        text = text.replace("specialty", specialty);
                                        r.setText(text, 0);
                                    }
                                }
                            }
                        }
                    }
                }


            }
            FileOutputStream fileOutputStream1 = new FileOutputStream("Заявление " + name + ".docx");
            document.write(fileOutputStream1);
            document.close();
            File myObj = new File("Заявление временный " + name + ".docx");
            myObj.delete();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }

    }


}
