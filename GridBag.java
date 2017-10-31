import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class GridBag extends JFrame{

   public static void main(String [] args){
      
      new GridBag();
   
   } //End of main
   
   public GridBag(){
      
      JPanel jpBoard;
      jpBoard = new JPanel(new GridLayout(9,9));
   
      for (int i = 0; i < 81; i++){
   
         JPanel jpSquare = new JPanel();; //one square is 4 players spaces
   
         JButton button;
         GridBagLayout gridbag = new GridBagLayout();
         jpSquare.setLayout(gridbag); 
         GridBagConstraints c = new GridBagConstraints(); 
             
         //player space   
         button = new JButton("Player");
         c.ipadx = 80; //x spacing
         c.ipady = 80; //y spacing
         c.gridx = 0; //0 x location
         c.gridy = 0; //0 y location
         gridbag.setConstraints(button, c);
         jpSquare.add(button);
         
         if( i != 81){
         
            //right wall
            if(((i+1) % 9) != 0){
            
               button = new JButton(""); 
               c.ipadx = 0;
               c.ipady = 95;
               c.gridx = 1;
               c.gridy = 0;
               gridbag.setConstraints(button, c);
               jpSquare.add(button);
            }
            
            
            if (i < 72){
            
               //bottom wall
               button = new JButton("");
               c.gridx = 0;
               c.gridy = 1;
               c.ipadx = 115;
               c.ipady = 20;
               gridbag.setConstraints(button, c);
               jpSquare.add(button);
               
               if(((i+1) % 9) != 0){
                  //center small button
                  button = new JButton("");
                  c.gridx = 1;
                  c.gridy = 1;
                  c.ipadx = 0;
                  c.ipady = 20;
                  gridbag.setConstraints(button, c);
                  jpSquare.add(button);
               }
               
            } //end of if i < 72
         
         } //end of if != 81
         
         jpBoard.add(jpSquare); //add the current square to the board
        
      }
           
      add(jpBoard);
            
      //Windows and visibility 
      setTitle("Quoridor Mini Project");
      pack();
      setLocationRelativeTo(null);
      setDefaultCloseOperation( EXIT_ON_CLOSE );
      setVisible(true); 
   
   
   }//End of constructor 


} //End of class GridBag