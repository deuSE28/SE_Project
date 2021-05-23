/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.search;

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
    public void board() {
        super.board(); // 설정된 기존 표시 기능을 수행
        hasPrice(); // 추가적으로 입력된 가격을 표시
    }
    // 선택된 거래 지역을 표시하는 기능만 직접 제공
    private void hasPrice() {
        System.out.println("입력된 가격 표시");
    }
}
