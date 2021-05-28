/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.bbs;

/**
 * 가격을 추가하는 클래스
 * @author CHANG
 */
public class priceDecorator extends DisplayDecorator {
    // 기존 표시 클래스의 설정
    public priceDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }
    @Override
    public String board() {
        return super.board() + ",가격"; // 설정된 기존 표시 기능을 수행
    }
}
