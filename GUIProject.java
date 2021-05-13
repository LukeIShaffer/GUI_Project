/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT130;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
/**
 *
 * @author Luke Shaffer
 */
public class GUIProject extends JFrame{

    public static void main(String[] args){
        
        //JLabel label = new JLabel();
        //label.setText("Bro, do you even code?");
        ImageIcon image = new ImageIcon("Greenherb.png");
        //**Currently cannot attach image to buttons!!**

        //Setting Up The Frame
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("Resident Evil Inventory");
        frame.setResizable(false);
        frame.setLayout(new GridLayout(4,4,10,10));
        //Resident Evil has a 16 Square, 4x4 Inventory System, so this is why I chose these numbers specifically.
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        
        //Setting Up Our Buttons
        
        frame.add(new JButton("PISTOL"));
        frame.add(new JButton("AMMO"));
        frame.add(new JButton("BANDAGES"));
        frame.add(new JButton("KEYCARD"));
        frame.add(new JButton("CAR KEYS"));
        frame.add(new JButton("GRENADE"));
        frame.add(new JButton("UNUSUAL GEM"));
        frame.add(new JButton("GREEN HERB"));
        frame.add(new JButton("RED HERB"));
        frame.add(new JButton("BLUE HERB"));
        frame.add(new JButton("WRENCH"));
        frame.add(new JButton("X"));
        frame.add(new JButton("X"));
        frame.add(new JButton("X"));
        frame.add(new JButton("LOCKED SLOT"));
        frame.add(new JButton("LOCKED SLOT"));

        
        frame.setVisible(true);
    }
    
} // End of program
