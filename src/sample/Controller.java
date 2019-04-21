package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DateCell;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.StrokeLineCap;

public class Controller {
    double opr1 = 0;
    double opr2 = 0;
    boolean first_opr = true;
    String sign = "";

    @FXML
    private Button btnNum1;
    @FXML
    private Button btnNum2;
    @FXML
    private Button btnNum3;
    @FXML
    private Button btnNum4;
    @FXML
    private Button btnNum5;
    @FXML
    private Button btnNum6;
    @FXML
    private Button btnNum7;
    @FXML
    private Button btnNum8;
    @FXML
    private Button btnNum9;
    @FXML
    private Button btnNum0;
    @FXML
    private Button btnNum00;
    @FXML
    private Button btnPoint;
    @FXML
    private Button btnSum;
    @FXML
    private Button btnDif;
    @FXML
    private Button btnMul;
    @FXML
    private Button btnDiv;

    @FXML
    private TextField tfRes;

    @FXML
    public void NumClick1() {
        String str = tfRes.getText();
        str += btnNum1.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick2() {
        String str = tfRes.getText();
        str += btnNum2.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick3() {
        String str = tfRes.getText();
        str += btnNum3.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick4() {
        String str = tfRes.getText();
        str += btnNum4.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick5() {
        String str = tfRes.getText();
        str += btnNum5.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick6() {
        String str = tfRes.getText();
        str += btnNum6.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick7() {
        String str = tfRes.getText();
        str += btnNum7.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick8() {
        String str = tfRes.getText();
        str += btnNum8.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick9() {
        String str = tfRes.getText();
        str += btnNum9.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick() {
    }

    @FXML
    public void NumClick0() {
        String str = tfRes.getText();
        str += btnNum0.getText();
        tfRes.setText(str);
    }

    @FXML
    public void NumClick00() {
        String str = tfRes.getText();
        str += btnNum00.getText();
        tfRes.setText(str);
    }

    @FXML
    public void ClickPoint() {
        String str = tfRes.getText();

        if (str.contains("."))
            return;

        str += btnPoint.getText();

        if (str.length() == 1)
            str = "0" + str;
        tfRes.setText(str);
    }

    @FXML
    public void ClickSum() {
        sign = "+";
        Operation();
    }

    @FXML
    public void ClickDif() {
        sign = "-";
        Operation();
    }

    @FXML
    public void ClickMul() {
        sign = "*";
        Operation();
    }

    @FXML
    public void ClickDiv() {
        sign = "/";
        Operation();
    }

    @FXML
    public void ClickClear() {
        tfRes.setText("");
        first_opr = true;
        opr1 = 0;
        opr2 = 0;
    }

    public void Operation() {
        if (tfRes.getText().equals("")) return;

        if (first_opr) {
            opr1 = Double.parseDouble(tfRes.getText());
            tfRes.setText("");
        } else {
            opr2 = Double.parseDouble(tfRes.getText());
            switch (sign) {
                case "+":
                    tfRes.setText("" + (opr1 + opr2));
                    break;
                case "-":
                    tfRes.setText("" + (opr1 - opr2));
                    break;
                case "*":
                    tfRes.setText("" + (opr1 * opr2));
                    break;
                case "/":
                    tfRes.setText("" + (opr1 / opr2));
                    break;
            }

        }

        first_opr = !first_opr;
    }

    @FXML
    public void ClickDelete() {
//        String temp = tfRes.getText();
//        temp.substring(0, (temp.length()-2));
//        tfRes.setText(temp);
        if (tfRes.getText().length() == 0) return;

        tfRes.setText(
                tfRes.getText().substring(
                        0, (tfRes.getText().length() - 1)
                )
        );
    }

    @FXML
    public void ClickEquals() {
        if (sign.equals("")) return;
        Operation();
    }
}
