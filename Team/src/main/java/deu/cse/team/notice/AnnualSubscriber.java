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
public class AnnualSubscriber extends Show_Notice implements Observer{
    private String noticeString;
    private Publisher publisher;
    
    public AnnualSubscriber(Publisher publisher){
        this.publisher = publisher;
        publisher.add(this);
    }
    @Override
    public void update(String notice) {
        this.noticeString = notice;
        display(noticeString);
    }
    
    public String display(String noticeString){
        return noticeString;
    }
}
