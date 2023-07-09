package orderitp;


import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A.vipooshan
 */
public class Sales_T {
    public void numbersonly(java.awt.event.KeyEvent evt)
    {
        char inumber = evt.getKeyChar();
        if(!(Character.isDigit(inumber))
               ||(inumber == KeyEvent.VK_BACK_SPACE)
               ||(inumber == KeyEvent.VK_DELETE)){
            evt.consume();
            
        }
                
    }

    
    
}
