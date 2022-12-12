/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author darlene
 */
public class Grupo implements Observable {
    
    List<String> mensagens = new ArrayList<>();
    List<Observer> contatos = new ArrayList<>();

    public String getMensagens() {
        String mensagensShow="";
        for(String m : mensagens){
            mensagensShow = mensagensShow.concat("\n"+m);
        }
        return mensagensShow;
    }
    
    public void enviarMensagem(String mensagem){
        mensagens.add(mensagem);
        notificarObserver();
        
    }
    
    @Override
    public void addObserver(Observer obs) {
        if(!contatos.contains(obs)){
            contatos.add(obs);
        }
    }

    @Override
    public void removerObserver(Observer obs) {
        contatos.remove(obs);
    }

    @Override
    public void notificarObserver() {
        contatos.forEach((contato)->{
            contato.update();
        });
    }
}
