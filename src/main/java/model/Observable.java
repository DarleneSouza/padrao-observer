/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author darlene
 */
public interface Observable {
    void addObserver(Observer obs);
    void removerObserver(Observer obs);
    void notificarObserver();
}

    