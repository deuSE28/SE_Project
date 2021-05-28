/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.search;

/**
 * 거래지역을 추가하는 클래스
 * @author CHANG
 */
public class locationDecorator extends DisplayDecorator {
    // 기존 표시 클래스의 설정
    public locationDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }
    @Override
    public void board() {
        super.board(); // 설정된 기존 표시 기능을 수행
        selectedLocation(); // 추가적으로 선택된 거래 지역을 표시
    }
    // 선택된 거래 지역을 표시하는 기능만 직접 제공
    private void selectedLocation() {
        System.out.println("선택된 거래지역 표시");
    }
}
