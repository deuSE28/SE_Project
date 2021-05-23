/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.search;

/**
 *
 * @author CHANG
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 각 검색 조건에 부합하는 게시글 표시
        Display boradWithElement = 
                new categoryDecorator(
                new locationDecorator(
                new priceDecorator(
                new statusDecorator(
                new boardDisplay()))));
        boradWithElement.board();
    }
}
