/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OORestraunts;

import javax.swing.JFrame;
import javax.swing.JOptionPane; 

/**
 *
 * @author Devshee
 */
public class SuperClass_Parent {
    
    public double ChholeTikkiya;
    public double ChholeBhature;
    public double ChilliPaneer;
    public double MasalaDosa;
    public double PavBhaji;
    
    public double Lassi;
    public double MasalaTea;
    public double ButterMilk;
    public double Coffee;
    public double OreoMK;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    
    
    public double GetAmount()
    {
        Meals = ChholeTikkiya + ChholeBhature + ChilliPaneer + MasalaDosa + PavBhaji;
        Drinks = Lassi + MasalaTea + ButterMilk + Coffee + OreoMK;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame =new Jframe("Exit");
        if(JoptionPane.ShowConfirmDialog(frame,"Click yes if you want to exit","Restraunt Billing System",JoptionPane.Yes_No_option) == JoptionPane.Yes_No_option) {
    } else {
            System.exit(0);
        }
    
            }
    //price

    public double pChholeTikkiya =30.0;
    public double pChholeBhature =45.0;
    public double pChilliPaneer =50.0;
    public double pMasalaDosa =60.0;
    public double pPavBhaji =35.0;
    
    public double pLassi =25.0;
    public double pMasalaTea =10.0;
    public double pButterMilk =20.0;
    public double pCoffee =20.0;
    public double pOreoMK =40.0;
    
    public double mcTax=0.90;
    public Double cFindTax(couble cAmount)
    {
        double FindTax =cAmount-(cAmount*mcTax);
        return FindTax;
    }
    
}


    


