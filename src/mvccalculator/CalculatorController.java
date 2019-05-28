/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvccalculator;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


/**
 *
 * @author Encryptor
 */
public class CalculatorController implements Initializable {

    @FXML
    private Label input;
    @FXML
    private Label prom;
    @FXML
    private JFXButton clear;
    @FXML
    private JFXButton seven;
    @FXML
    private JFXButton four;
    @FXML
    private JFXButton one;
    @FXML
    private JFXButton zero;
    @FXML
    private JFXButton eight;
    @FXML
    private JFXButton five;
    @FXML
    private JFXButton two;
    @FXML
    private JFXButton nine;
    @FXML
    private JFXButton six;
    @FXML
    private JFXButton three;
    @FXML
    private JFXButton point;
    @FXML
    private JFXButton add;
    @FXML
    private JFXButton division;
    @FXML
    private JFXButton multi;
    @FXML
    private JFXButton subs;
    @FXML
    private JFXButton equals;
    
    private double fnumber;
    private double snumber;
    private String operation;
    @FXML
    private JFXButton sin;
    @FXML
    private JFXButton cod;
    @FXML
    private JFXButton tan;
    @FXML
    private JFXButton doubleZero;
    CalculatorModel cm;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cm = new CalculatorModel();
    }    

    @FXML
    private void clearClick(ActionEvent event) {
        input.setText("");
        prom.setText("");
        this.fnumber=0;
        this.snumber=0;
        
    }

    @FXML
    private void sevenClick(ActionEvent event) {
        String oldValue=input.getText();
        String set="7";
        input.setText(oldValue+set);
    }

    @FXML
    private void fourClick(ActionEvent event) {
        String oldValue=input.getText();
        String set="4";
        input.setText(oldValue+set);
    }

    @FXML
    private void oneClick(ActionEvent event) {
        String oldValue=input.getText();
        String set="1";
        input.setText(oldValue+set);
    }

    @FXML
    private void zeroClick(ActionEvent event) {
        String oldValue=input.getText();
        String set="0";
        input.setText(oldValue+set);
    }

    @FXML
    private void eightClick(ActionEvent event) {
        String oldValue=input.getText();
        String set="8";
        input.setText(oldValue+set);
    }

    @FXML
    private void fiveClick(ActionEvent event) {
        String oldValue=input.getText();
        String set="5";
        input.setText(oldValue+set);
    }

    @FXML
    private void twoClick(ActionEvent event) {
        String oldValue=input.getText();
        String set="2";
        input.setText(oldValue+set);
    }

    @FXML
    private void nineClick(ActionEvent event) {
        String oldValue=input.getText();
        String set="9";
        input.setText(oldValue+set);
    }

    @FXML
    private void sixClick(ActionEvent event) {
        String oldValue=input.getText();
        String set="6";
        input.setText(oldValue+set);
    }

    @FXML
    private void threeClick(ActionEvent event) {
        String oldValue=input.getText();
        String set="3";
        input.setText(oldValue+set);
    }

    @FXML
    private void pointClick(ActionEvent event) {
        String oldValue=input.getText();
        String set=".";
        input.setText(oldValue+set);
    }

    @FXML
    private void addClick(ActionEvent event) {
        try{
            String value=input.getText();
            double valuenumber=Double.parseDouble(value);
            this.fnumber=valuenumber;
            input.setText("");
            prom.setText(value+"+");
            operation="+";
        }catch(Exception e){}
       
    }

    @FXML
    private void divisionClick(ActionEvent event) {
        try{
            String value=input.getText();
            double valuenumber=Double.parseDouble(value);
            this.fnumber=valuenumber;
            input.setText("");
            prom.setText(value+"/");
            operation="/";
        }catch(Exception e){}
        
    }

    @FXML
    private void multiClick(ActionEvent event) {
        try{
            String value=input.getText();
            double valuenumber=Double.parseDouble(value);
            this.fnumber=valuenumber;
            input.setText("");
            prom.setText(value+"x");
            operation="x";
        }catch(Exception e){}
        
    }

    @FXML
    private void subsClick(ActionEvent event) {
        try{
            String value=input.getText();
            double valuenumber=Double.parseDouble(value);
            this.fnumber=valuenumber;
            input.setText("");
            prom.setText(value+"-");
            operation="-";
        }catch(Exception e){}
        
    }

    @FXML
    private void equalsClick(ActionEvent event) {
        try{
            switch(operation){
                case "+":
                    String valueA=input.getText();
                    snumber=Double.parseDouble(valueA);
                    double resultA=cm.add(fnumber, snumber);
                    input.setText(String.valueOf(resultA));
                    prom.setText(prom.getText()+valueA);
                    break;
                case "-":
                    String valueS=input.getText();
                    snumber=Double.parseDouble(valueS);
                    double resultS=cm.substruct(fnumber, snumber);
                    input.setText(String.valueOf(resultS));
                    prom.setText(prom.getText()+valueS);
                    break;
                case "x":
                    String valueM=input.getText();
                    snumber=Double.parseDouble(valueM);
                    double resultM=cm.multiply(fnumber, snumber);
                    input.setText(String.valueOf(resultM));
                    prom.setText(prom.getText()+valueM);
                    break;
                case "/":
                    String valueD=input.getText();
                    snumber=Double.parseDouble(valueD);
                    double resultD=cm.divide(fnumber, snumber);
                    input.setText(String.valueOf(resultD));
                    prom.setText(prom.getText()+valueD);
                    break;
            }
        }catch(Exception e){}
        
    }

    @FXML
    private void findSin(ActionEvent event) {
        try{
            String value=input.getText();
            double number=Double.parseDouble(value);
            double result=cm.findSin(number);
            input.setText(String.valueOf(result));
        }catch(Exception e){}
        
        
    }

    @FXML
    private void findCos(ActionEvent event) {
        try{
            String value=input.getText();
            double number=Double.parseDouble(value);
            double result=cm.findCos(number);
            input.setText(String.valueOf(result));
        }catch(Exception e){}
        
    }

    @FXML
    private void fintan(ActionEvent event) {
        try{
            String value=input.getText();
            double number=Double.parseDouble(value);
            double result=cm.findTan(number);
            input.setText(String.valueOf(result));
        }catch(Exception e){}
        
    }

    @FXML
    private void doubleZeroClick(ActionEvent event) {
        String oldValue=input.getText();
        String set="00";
        input.setText(oldValue+set);
    }
    
}
