/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author darlene
 */
public class Andre implements Observer{
    @Override
     public void update() {
        JOptionPane.showMessageDialog(null, "Andé foi notificad@!");
    }
}
