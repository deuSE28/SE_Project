/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.notice;

/**
 *
 * @author 구본영
 */
public interface Publisher {
    public void add(Observer observer);
    public void delete(Observer observer);
    public void notifiyObserver();
}
