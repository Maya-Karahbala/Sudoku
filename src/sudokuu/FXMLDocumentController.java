/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuu;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

import javafx.scene.control.ToggleGroup;

import javafx.scene.paint.Paint;

import javafx.scene.text.Font;

/**
 *
 * @author evrim
 */
public class FXMLDocumentController implements Initializable {

    public static cell[] cells;
    public static cell[] bosaltilanSoduku;

    //
    public static ArrayList<JFXTextField> txtFields = new ArrayList<>();
    static ArrayList<Integer> selectedIdes = new ArrayList<>();//difficlt 28
    int count = 0;

    public void setColor(ActionEvent ae) {

        count++;
//        System.out.println("" + count);

    }
    int helpCounter = 3;
    ArrayList<Integer> helpIdes = new ArrayList();

    public void help(ActionEvent ae) {

        if (focusedId != -1 && helpCounter > 0 && !helpIdes.contains(focusedId)) {
            helpCounter--;
            txtCounter1.setText(String.valueOf(helpCounter));
            txtCounter1.setEditable(false);
            txtFields.get(focusedId).setText(String.valueOf(cells[focusedId].value));
            helpIdes.add(focusedId);
            txtFields.get(focusedId).setStyle("-fx-text-fill:#DDA0DD;");
            txtFields.get(focusedId).setEditable(false);
            txtFields.get(focusedId).setFont(new Font("bolder", 30));
        }
    }

    public void NewGame(ActionEvent ae) {
        JFXRadioButton btn = (JFXRadioButton) group.getSelectedToggle();
        for (int i = 0; i < selectedIdes.size(); i++) {
            selectedIdes.remove(i);
        }

        NewGame_holes(btn.getText());

    }
    @FXML
    private JFXButton btnHelp;
    @FXML
    private JFXTextField txtCounter1;
    @FXML
    private JFXRadioButton radNormal;

    @FXML
    private JFXRadioButton radEasy;

    @FXML
    private JFXRadioButton RadHard;
    @FXML
    private JFXTextField txt0;

    @FXML
    private JFXTextField txt9;

    @FXML
    private JFXTextField txt1;

    @FXML
    private JFXTextField txt10;

    @FXML
    private JFXTextField txt18;

    @FXML
    private JFXTextField txt19;

    @FXML
    private JFXTextField txt2;

    @FXML
    private JFXTextField txt11;

    @FXML
    private JFXTextField txt20;

    @FXML
    private JFXTextField txt3;

    @FXML
    private JFXTextField txt12;

    @FXML
    private JFXTextField txt4;

    @FXML
    private JFXTextField txt13;

    @FXML
    private JFXTextField txt21;

    @FXML
    private JFXTextField txt22;

    @FXML
    private JFXTextField txt5;

    @FXML
    private JFXTextField txt14;

    @FXML
    private JFXTextField txt23;

    @FXML
    private JFXTextField txt6;

    @FXML
    private JFXTextField txt15;

    @FXML
    private JFXTextField txt7;

    @FXML
    private JFXTextField txt16;

    @FXML
    private JFXTextField txt24;

    @FXML
    private JFXTextField txt25;

    @FXML
    private JFXTextField txt8;

    @FXML
    private JFXTextField txt17;

    @FXML
    private JFXTextField txt26;

    @FXML
    private JFXTextField txt27;

    @FXML
    private JFXTextField txt36;

    @FXML
    private JFXTextField txt28;

    @FXML
    private JFXTextField txt37;

    @FXML
    private JFXTextField txt45;

    @FXML
    private JFXTextField txt46;

    @FXML
    private JFXTextField txt29;

    @FXML
    private JFXTextField txt38;

    @FXML
    private JFXTextField txt47;

    @FXML
    private JFXTextField txt30;

    @FXML
    private JFXTextField txt39;

    @FXML
    private JFXTextField txt31;

    @FXML
    private JFXTextField txt40;

    @FXML
    private JFXTextField txt48;

    @FXML
    private JFXTextField txt49;

    @FXML
    private JFXTextField txt32;

    @FXML
    private JFXTextField txt41;

    @FXML
    private JFXTextField txt50;

    @FXML
    private JFXTextField txt33;

    @FXML
    private JFXTextField txt42;

    @FXML
    private JFXTextField txt34;

    @FXML
    private JFXTextField txt43;

    @FXML
    private JFXTextField txt51;

    @FXML
    private JFXTextField txt52;

    @FXML
    private JFXTextField txt35;

    @FXML
    private JFXTextField txt44;

    @FXML
    private JFXTextField txt53;

    @FXML
    private JFXTextField txt54;

    @FXML
    private JFXTextField txt63;

    @FXML
    private JFXTextField txt55;

    @FXML
    private JFXTextField txt64;

    @FXML
    private JFXTextField txt72;

    @FXML
    private JFXTextField txt73;

    @FXML
    private JFXTextField txt56;

    @FXML
    private JFXTextField txt65;

    @FXML
    private JFXTextField txt74;

    @FXML
    private JFXTextField txt57;

    @FXML
    private JFXTextField txt66;

    @FXML
    private JFXTextField txt58;

    @FXML
    private JFXTextField txt67;

    @FXML
    private JFXTextField txt75;

    @FXML
    private JFXTextField txt76;

    @FXML
    private JFXTextField txt59;

    @FXML
    private JFXTextField txt68;

    @FXML
    private JFXTextField txt77;

    @FXML
    private JFXTextField txt60;

    @FXML
    private JFXTextField txt69;

    @FXML
    private JFXTextField txt61;

    @FXML
    private JFXTextField txt70;

    @FXML
    private JFXTextField txt78;

    @FXML
    private JFXTextField txt79;

    @FXML
    private JFXTextField txt62;

    @FXML
    private JFXTextField txt71;

    @FXML
    private JFXTextField txt80;

    ToggleGroup group = new ToggleGroup();

    //
    public static boolean ExistAtSameRow(int ran, int RowCount, cell[] cells) {
        boolean sonuc = false;
        for (int i = 0; i < 81; i++) {
            if (cells[i].rowNo == RowCount && ran == cells[i].value && cells[i].value != 0) {
                sonuc = true;
                break;

            }
        }
        return sonuc;
    }

    public static boolean ExistAtSameColum(int ran, int ColumCount, cell[] cells) {
        boolean sonuc = false;
        for (int i = 0; i < 81; i++) {
            if (cells[i].columNo == ColumCount && ran == cells[i].value && cells[i].value != 0) {
                sonuc = true;
                break;
            }
        }
        return sonuc;
    }

    public static boolean ExistAtSamebox(int ran, int BoxNo, cell[] cells) {
        boolean sonuc = false;
        for (int i = 0; i < 81; i++) {
            if (cells[i].boxNo == BoxNo && ran == cells[i].value && cells[i].value != 0) {
                sonuc = true;
                break;
            }
        }
        return sonuc;
    }

    public static void yeniSoduko() {
        // deger vermek
        Random r = new Random();
        int counter = 0;
        int counter2 = 0;
        int counter3 = 0;
        for (int i = 0; i < 9; i++) {//satir

            dis:
            for (int j = 0; j < 9; j++) {//sutun
                int ran = r.nextInt(9) + 1;
                //System.out.println(""+ran);
                counter2 = 0;
                // counter3 = 0;
                while (true) {
                    if (ExistAtSameRow(ran, i, cells) || ExistAtSameColum(ran, j, cells) || ExistAtSamebox(ran, cells[counter].boxNo, cells)) {
                        ran = r.nextInt(9) + 1;
                        counter2++;

                        if (counter2 > 50) {
                            counter3++;
                            counter2 = 0;
                            counter -= j;
                            // System.out.print("0");
                            //
                            for (int k = 0; k < 81; k++) {
                                if (cells[k].rowNo == i) {
                                    cells[k].value = 0;

                                }
                            }
                            //
                            i--;
                            //

                            if (counter3 > 200) {
                                //System.out.println("xxxxxxxx");
                                counter3 = 0;
                                counter2 = 0;
                                counter = 0;

                                sifirala();
                                i = -1;
                                j = 0;

                                break dis;
                            }
                            //
                            break dis;
                        }

                    } else {
                        break;
                    }
                }
                cells[counter++].value = ran;

                //System.out.print(cells[counter++].value + " ");
                // System.out.println(""+ran);
            }
            // System.out.println("");

        }
        // System.out.println("****************");

    }

    public static void sifirala() {
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cells[counter].value = 0;
                bosaltilanSoduku[counter++].value = 0;
            }
        }

    }

    public static void printSoduku() {
        int counter3 = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(cells[counter3++].value + " ");
            }
            System.out.println("");
        }
        System.out.println("------------------");
    }

    public static void basla() {
        cells = new cell[81];
        bosaltilanSoduku = new cell[81];
        int counter = 0;
        while (counter < 81) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    cells[counter] = new cell();
                    bosaltilanSoduku[counter] = new cell();
                    cells[counter].rowNo = i;
                    cells[counter].columNo = j;
                    //
                    bosaltilanSoduku[counter].rowNo = i;
                    bosaltilanSoduku[counter].columNo = j;
                    //
                    cells[counter].id = counter;
                    bosaltilanSoduku[counter].id = counter;
                    if (cells[counter].rowNo < 3 && cells[counter].columNo < 3) {
                        cells[counter].boxNo = 1;
                        bosaltilanSoduku[counter].boxNo = 1;
                    } else if (cells[counter].rowNo < 3 && cells[counter].columNo < 6) {
                        cells[counter].boxNo = 2;
                        bosaltilanSoduku[counter].boxNo = 2;
                    } else if (cells[counter].rowNo < 3 && cells[counter].columNo < 9) {
                        cells[counter].boxNo = 3;
                        bosaltilanSoduku[counter].boxNo = 3;
                    } else if (cells[counter].rowNo < 6 && cells[counter].columNo < 3) {
                        cells[counter].boxNo = 4;
                        bosaltilanSoduku[counter].boxNo = 4;
                    } else if (cells[counter].rowNo < 6 && cells[counter].columNo < 6) {
                        cells[counter].boxNo = 5;
                        bosaltilanSoduku[counter].boxNo = 5;
                    } else if (cells[counter].rowNo < 6 && cells[counter].columNo < 9) {
                        cells[counter].boxNo = 6;
                        bosaltilanSoduku[counter].boxNo = 6;
                    } else if (cells[counter].rowNo < 9 && cells[counter].columNo < 3) {
                        cells[counter].boxNo = 7;
                        bosaltilanSoduku[counter].boxNo = 7;
                    } else if (cells[counter].rowNo < 9 && cells[counter].columNo < 6) {
                        cells[counter].boxNo = 8;
                        bosaltilanSoduku[counter].boxNo = 8;
                    } else if (cells[counter].rowNo < 9 && cells[counter].columNo < 9) {
                        cells[counter].boxNo = 9;
                        bosaltilanSoduku[counter].boxNo = 9;
                    }
                    counter++;
                }
            }

        }
    }

    public static void diggindHoles(String difficlityLevel) {

        selectedIdes.clear();

        //
        int GivenCells = 0;
        int totalGivenCells = 0;
        int LowerBoundAtRow = 0;
        if (difficlityLevel.equals("Easy")) {
            //number of total given cells is 49
            GivenCells = 45;   //45 cellse populated regulary 5 cells at eachroe
            LowerBoundAtRow = 4;
            totalGivenCells = 49;
        } else if (difficlityLevel.equals("Normal")) {
            GivenCells = 36;
            LowerBoundAtRow = 3;
            totalGivenCells = 36;
        } else if (difficlityLevel.equals("Hard")) {
            GivenCells = 27;
            LowerBoundAtRow = 2;
            totalGivenCells = 29;
        }

        Random rn = new Random();

        int counter = 0;
        int counter2 = 0;
        Integer sayi = 0;

        while (selectedIdes.size() < GivenCells) {
            do {
                sayi = ((Integer) rn.nextInt(9) + counter);
            } while (selectedIdes.contains(sayi));
            // cells.get(counter++).
            selectedIdes.add(sayi);
            counter2++;
            if (counter2 > LowerBoundAtRow) {//checking if at lest there is three random number at each row
                counter += 9;
                counter2 = 0;
            }

        }
        // additional cells
        while (selectedIdes.size() < totalGivenCells) {
            do {
                sayi = ((Integer) rn.nextInt(81));
            } while (selectedIdes.contains(sayi));
            selectedIdes.add(sayi);
        }

    }

    public void NewGame_holes(String difficultyLevel) {
        count = 0;
        focusedId = -1;
        helpIdes.clear();
        helpCounter = 3;
        txtCounter1.setText(String.valueOf(helpCounter));
        basla();
        sifirala();
        yeniSoduko();

        diggindHoles(difficultyLevel);
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                bosaltilanSoduku[counter++].value = 0;

            }

        }
        for (int i = 0; i < selectedIdes.size(); i++) {
            bosaltilanSoduku[selectedIdes.get(i)].value = cells[selectedIdes.get(i)].value;
        }
        counter = 0;
        for (int i = 0; i < 81; i++) {
            if (bosaltilanSoduku[i].value == 0) {

                txtFields.get(i).setText("");
                txtFields.get(i).setEditable(true);
                txtFields.get(i).setFont(new Font("normal", 20));
                txtFields.get(i).setUnFocusColor(Paint.valueOf("Crimson"));
                txtFields.get(i).setFocusColor(Paint.valueOf("Chartreuse"));

            } else {

                txtFields.get(i).setText(String.valueOf(bosaltilanSoduku[i].value));
                txtFields.get(i).setEditable(false);
                txtFields.get(i).setFont(new Font("bolder", 30));
                txtFields.get(i).setUnFocusColor(Paint.valueOf("black"));
                txtFields.get(i).setFocusColor(Paint.valueOf("black"));
                txtFields.get(i).setStyle("-fx-text-fill:#000000;");

            }
        }

        printSoduku();
//           
    }

    //
//
    public void setText(ActionEvent ae) {
        System.out.println("txt");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtCounter1.setText(String.valueOf(helpCounter));
        txtCounter1.setEditable(false);
        String[] txtString = new String[81];
        boolean[] focusedIdes = new boolean[81];
        radEasy.setToggleGroup(group);
        RadHard.setToggleGroup(group);
        radNormal.setToggleGroup(group);
        txtFields.add(txt0);
        txtFields.add(txt1);
        txtFields.add(txt2);
        txtFields.add(txt3);
        txtFields.add(txt4);
        txtFields.add(txt5);
        txtFields.add(txt6);
        txtFields.add(txt7);
        txtFields.add(txt8);
        txtFields.add(txt9);
        txtFields.add(txt10);
        txtFields.add(txt11);
        txtFields.add(txt12);
        txtFields.add(txt13);
        txtFields.add(txt14);
        txtFields.add(txt15);
        txtFields.add(txt16);
        txtFields.add(txt17);
        txtFields.add(txt18);
        txtFields.add(txt19);
        txtFields.add(txt20);
        txtFields.add(txt21);
        txtFields.add(txt22);
        txtFields.add(txt23);
        txtFields.add(txt24);
        txtFields.add(txt25);
        txtFields.add(txt26);
        txtFields.add(txt27);
        txtFields.add(txt28);
        txtFields.add(txt29);
        txtFields.add(txt30);
        txtFields.add(txt31);
        txtFields.add(txt32);
        txtFields.add(txt33);
        txtFields.add(txt34);
        txtFields.add(txt35);
        txtFields.add(txt36);
        txtFields.add(txt37);
        txtFields.add(txt38);
        txtFields.add(txt39);
        txtFields.add(txt40);
        txtFields.add(txt41);
        txtFields.add(txt42);
        txtFields.add(txt43);
        txtFields.add(txt44);
        txtFields.add(txt45);
        txtFields.add(txt46);
        txtFields.add(txt47);
        txtFields.add(txt48);
        txtFields.add(txt49);
        txtFields.add(txt50);
        txtFields.add(txt51);
        txtFields.add(txt52);
        txtFields.add(txt53);
        txtFields.add(txt54);
        txtFields.add(txt55);
        txtFields.add(txt56);
        txtFields.add(txt57);
        txtFields.add(txt58);
        txtFields.add(txt59);
        txtFields.add(txt60);
        txtFields.add(txt61);
        txtFields.add(txt62);
        txtFields.add(txt63);
        txtFields.add(txt64);
        txtFields.add(txt65);
        txtFields.add(txt66);
        txtFields.add(txt67);
        txtFields.add(txt68);
        txtFields.add(txt69);
        txtFields.add(txt70);
        txtFields.add(txt71);
        txtFields.add(txt72);
        txtFields.add(txt73);
        txtFields.add(txt74);
        txtFields.add(txt75);
        txtFields.add(txt76);
        txtFields.add(txt77);
        txtFields.add(txt78);
        txtFields.add(txt79);
        txtFields.add(txt80);
        count = 0;

        for (int i = 0; i < 81; i++) {

            txtFields.get(i).textProperty().addListener(new ChangeListener<String>() {
                boolean result = true;
                boolean sonuc = false;

                @Override
                public void changed(ObservableValue<? extends String> ov, String t, String t1) {
 try {

                    count++;
                    if (count > 40) {
                        sonuc = true;
                        for (int j = 0; j < 81; j++) {
                            txtString[j] = txtFields.get(j).getText();

                            if (txtString[j].equals("")) {
                                sonuc = false;
                                break;
                            }

                        }
                    }
                   
                      //  System.out.println("" + t1 + "  " + t1.length());

                        if (!t1.equals("") && focusedId != -1) {
                            if (ExistAtSameRow(Integer.parseInt(t1), bosaltilanSoduku[focusedId].rowNo, bosaltilanSoduku)
                                    || ExistAtSameColum(Integer.parseInt(t1), bosaltilanSoduku[focusedId].columNo, bosaltilanSoduku)
                                    || ExistAtSamebox(Integer.parseInt(t1), bosaltilanSoduku[focusedId].boxNo, bosaltilanSoduku)) {

                                txtFields.get(focusedId).setStyle("-fx-text-fill:#FF0000;");
                            }
                            if (t1.length() > 1) {
                                txtFields.get(focusedId).setText(t1.substring(0,1));
                            }
                        } else if (t1.equals("")) {
                            txtFields.get(focusedId).setStyle("-fx-text-fill:#000000;");
                        }

                    } catch (IllegalArgumentException ee) {//to stop yhe ability of entering chaaracters
                        txtFields.get(focusedId).setText("");
                    }
                    catch(java.lang.ArrayIndexOutOfBoundsException e){
                        
                    }

                    if (sonuc) {
                        result = true;

                        for (int j = 0; j < 10; j++) {
                            if (!String.valueOf(cells[j].value).equals(txtFields.get(j).getText())) {
                                // System.out.println(cells[j].value + "  " + txtFields.get(j).getText()
                                // );
                                result = false;
                                break;
                            }
                        }

                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        if (result) {
                            alert.setContentText("congratulations you won the game");
                            alert.setTitle("congratulations");

                        } else {
                            alert.setContentText("game over");

                        }
                        alert.show();
                        result = false;
                        count = 0;
                        sonuc = false;

                        JFXRadioButton selected = (JFXRadioButton) group.getSelectedToggle();
                        NewGame_holes(selected.getText());

                    }
                }
            });
        }

        for (int i = 0; i < 81; i++) {
            txtFields.get(i).focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {

                focusState(newValue);
                focusedTxt(newValue);
            }
            );
            //  focused=i;

        }

        //
        NewGame_holes("Normal");

    }
    int focusedId = -1;

    private void focusedTxt(boolean value) {

        if (value) {

            for (int i = 0; i < 81; i++) {
                if (txtFields.get(i).isFocused() && txtFields.get(i).getText().equals("")) {

                    focusedId = i;
                    break;
                } else {
                    focusedId = -1;
                }
            }
            // System.out.println(" " + focusedId);
        }
    }

    private void focusState(boolean value) {

        if (value) {

            String s = "";
            for (int i = 0; i < 81; i++) {
                if (txtFields.get(i).isFocused()) {
                    s = txtFields.get(i).getText();
                    break;
                }
            }

            for (int i = 0; i < 81; i++) {

                if (txtFields.get(i).getText().equals(s) && !s.equals("")) {
                    txtFields.get(i).setStyle("-fx-text-fill:	#32CD32;");

                } else {
                    txtFields.get(i).setStyle("-fx-text-fill:#000000;");
                }
            }

        } else {

            for (int i = 0; i < 81; i++) {
                txtFields.get(i).setStyle("-fx-text-fill:#000000;");
            }
        }
    }

}
