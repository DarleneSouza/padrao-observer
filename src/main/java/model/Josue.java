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
public class Josue implements Observer {

    @Override
    public void update() {
        JOptionPane.showMessageDialog(null, "Josué foi notificad@!");
    }
    
    
}
