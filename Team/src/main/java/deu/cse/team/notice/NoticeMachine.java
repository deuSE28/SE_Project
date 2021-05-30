/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.notice;

import java.util.ArrayList;

/**
 *
 * @author 구본영
 */
public class NoticeMachine implements Publisher{
    private ArrayList<Observer> observers;
    private String notice;
    
    
    public NoticeMachine(){
        observers = new ArrayList<>();
    }
    
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        int index = observers.indexOf(observers);
        observers.remove(index);
    }

    @Override
    public void notifiyObserver() {
        for(Observer observer : observers) {
            observer.update(notice);
        }
    }
    
    public void setNoticeInfo(String notice){
        this.notice = notice;
        notifiyObserver();
    }
    
    public String getNotice(){
        return notice;
    }
}
