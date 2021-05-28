/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.search;

/**
 * 다양한 추가기능에 대한 공통 클래스
 * @author CHANG
 */
public abstract class DisplayDecorator extends Display {
    private Display decoratedDisplay;
    // '합성(composition)관계'를 통해 boardDisplay 객체에 대한 참조
    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }
    @Override
    public String board() {
        return decoratedDisplay.board();
    }
}
