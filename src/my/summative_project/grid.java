/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.summative_project;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.Date;
import java.awt.Color;



/**
 *
 * @author spate8
 */
public class grid extends JButton{
    
    private Date date;
    private boolean title;
    
    public grid(){
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);
    }
    
    public void asTitle(){
        title = true;
    }
    
    public boolean isTitle(){
        return title;
    }
    public void currentMonth(boolean act){
        if(act){
            setForeground(new Color(68,68,68));
        }
        else{
            setForeground(new Color(198,200,68));
        }
    }
}
