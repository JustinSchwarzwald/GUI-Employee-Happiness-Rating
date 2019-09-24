import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.*;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JTextField;

public class Frame1
{
    int happyCount = 0;
    int upsetCount = 0;
    int okayCount = 0;
    int unhappyCount = 0;
    int neutralCount = 0;

    
    private JFrame frame;
    private JLabel lblHappyCount,lblUnhappyCount, lblOkayCount, lblUpsetCount, lblNeutral;
    private JLabel label;


    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    Frame1 window = new Frame1();
                    window.frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Frame1()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frame = new JFrame();
        frame.setBounds(100, 100, 1569, 769);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        // add a windowlistener event
        
        // Rate Happiness
        JLabel lblRateYourHappiness = new JLabel("Rate Your Happiness");
        lblRateYourHappiness.setForeground(Color.BLACK);
        lblRateYourHappiness.setBackground(Color.WHITE);
        lblRateYourHappiness.setFont(new Font("Leelawadee UI", Font.PLAIN, 53));
        lblRateYourHappiness.setBounds(368, 11, 492, 138);
        frame.getContentPane().add(lblRateYourHappiness);
        
        
        // Happy Sad Pic
        label = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/Capture.JPG")).getImage();
        label.setIcon(new ImageIcon(img));
        label.setBounds(182, 130, 950, 288);
        frame.getContentPane().add(label);
        
        // Okay
        JButton btnOkay = new JButton("Okay");
        btnOkay.setFont(new Font("Tahoma", Font.PLAIN, 40));
        btnOkay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                okayCount++;
                lblOkayCount.setText("Total Okay Count: " + okayCount);
            }
        });
        btnOkay.setBounds(398, 130, 141, 168);
        frame.getContentPane().add(btnOkay);
        
        lblOkayCount = new JLabel("Total Okay Count: " + okayCount);
        lblOkayCount.setBounds(304, 640, 217, 14);
        frame.getContentPane().add(lblOkayCount);
        
        btnOkay.setOpaque(false);
        btnOkay.setContentAreaFilled(false);
        btnOkay.setBorderPainted(false);
        
        // Unhappy
        JButton btnUnhappy = new JButton("Unhappy");
        btnUnhappy.setFont(new Font("Tahoma", Font.PLAIN, 40));
        btnUnhappy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                unhappyCount++;
                lblUnhappyCount.setText("Total Unhappy Count: " + unhappyCount);
            }
        });
        btnUnhappy.setBounds(707, 130, 148, 156);
        frame.getContentPane().add(btnUnhappy);
        
        lblUnhappyCount = new JLabel("Total Unhappy Count: " + unhappyCount);
        lblUnhappyCount.setBounds(845, 640, 229, 14);
        frame.getContentPane().add(lblUnhappyCount);  
        
        btnUnhappy.setOpaque(false);
        btnUnhappy.setContentAreaFilled(false);
        btnUnhappy.setBorderPainted(false);
        
        // Neutral
        JButton btnNeutral = new JButton("Neutral");
        btnNeutral.setFont(new Font("Tahoma", Font.PLAIN, 40));
        btnNeutral.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                neutralCount++;
                lblNeutral.setText("Total Neutral Count: " + neutralCount);
            }
        });
        btnNeutral.setBounds(549, 130, 148, 156);
        frame.getContentPane().add(btnNeutral);
        
        lblNeutral = new JLabel("Total Neutral Count: " + neutralCount);
        lblNeutral.setBounds(579, 640, 212, 14);
        frame.getContentPane().add(lblNeutral);
        
        btnNeutral.setOpaque(false);
        btnNeutral.setContentAreaFilled(false);
        btnNeutral.setBorderPainted(false);
        
        // Happy
        JButton btnHappy = new JButton("Happy");
        btnHappy.setFont(new Font("Tahoma", Font.PLAIN, 40));
        btnHappy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                happyCount++;
                lblHappyCount.setText("Total Happy Count: " + happyCount);
            }
        });
        btnHappy.setBounds(240, 130, 148, 168);
        frame.getContentPane().add(btnHappy);
        
        
        btnHappy.setOpaque(false);
        btnHappy.setContentAreaFilled(false);
        btnHappy.setBorderPainted(false);
        
        lblHappyCount = new JLabel("Total Happy Count: " + happyCount);
        lblHappyCount.setBounds(55, 640, 190, 14);
        frame.getContentPane().add(lblHappyCount);
        
        // Upset
        JButton btnUpset = new JButton("Upset");
        btnUpset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                upsetCount++;
                lblUpsetCount.setText("Total Upset Count: " + upsetCount);
            }
        });
        btnUpset.setFont(new Font("Tahoma", Font.PLAIN, 40));
        btnUpset.setBounds(865, 130, 141, 156);
        frame.getContentPane().add(btnUpset);
        
        btnUpset.setOpaque(false);
        btnUpset.setContentAreaFilled(false);
        btnUpset.setBorderPainted(false);
       
        lblUpsetCount = new JLabel("Total Upset Count : " + upsetCount);
        lblUpsetCount.setBounds(1138, 640, 210, 14);
        frame.getContentPane().add(lblUpsetCount);
        
    }
    
    
}
