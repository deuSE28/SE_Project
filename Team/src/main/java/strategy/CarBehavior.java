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
class UpBehavior implements CarMoveBehavior{
    @Override public void action() {
        System.out.println("UP");
    }
}
class DownBehavior implements CarMoveBehavior{
    @Override public void action() {
        System.out.println("Down");
    }
}
class LeftBehavior implements CarMoveBehavior{
    @Override public void action() {
        System.out.println("Left");
    }
}
class RightBehavior implements CarMoveBehavior{
    @Override public void action() {
        System.out.println("Right");
    }
}
