/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author CHANG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("스트래티지패턴");
        
        Car car1 = new Car(new UpBehavior());
        car1.move();
        
        Car car2 = new Car(new DownBehavior());
        car2.move();
        
        car2.setMoveBehavior(new LeftBehavior());
        car2.move();
        
        car2.setMoveBehavior(new RightBehavior());
        car2.move();
    }
    
}
