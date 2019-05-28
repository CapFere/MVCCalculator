/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvccalculator;

/**
 *
 * @author Encryptor
 */
public class CalculatorModel {
    public double add(double fnumber,double snumber){
        return fnumber + snumber;
    }
    public double substruct(double fnumber,double snumber){
        return fnumber - snumber;
    }
    public double multiply(double fnumber,double snumber){
        return fnumber * snumber;
    }
    public double divide(double fnumber,double snumber){
        return fnumber / snumber;
    }
    public double findSin(double number){
        return Math.sin((number*Math.PI)/180);
    }
    public double findCos(double number){
        return Math.cos((number*Math.PI)/180);
    }
    public double findTan(double number){
        return Math.tan((number*Math.PI)/180);
    }
}
