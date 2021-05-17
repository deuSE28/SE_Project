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
public class Car {
    private CarMoveBehavior carMoveBehavior;
    
    public Car(CarMoveBehavior carMoveBehavior) {
        this.carMoveBehavior = carMoveBehavior;
    }
    
    public void move(){
        carMoveBehavior.action();
    }
    
    public void setMoveBehavior(CarMoveBehavior carMoveBehavior){
        this.carMoveBehavior = carMoveBehavior;
    }
}
