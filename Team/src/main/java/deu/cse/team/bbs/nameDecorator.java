/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.bbs;

/**
 * 제품명을 추가하는 클래스
 * @author CHANG
 */
public class nameDecorator extends DisplayDecorator {
    // 기존 표시 클래스의 설정
    public nameDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }
    @Override
    public String board() {
        return super.board() + "제품명";
    }
}
