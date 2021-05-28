/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.search;

/**
 * 카테고리를 추가하는 클래스
 * @author CHANG
 */
public class categoryDecorator extends DisplayDecorator {
    // 기존 표시 클래스의 설정
    public categoryDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }
    @Override
    public String board() {
        return super.board() + ",카테고리";
    }
}
