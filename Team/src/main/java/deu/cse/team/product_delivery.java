/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.Delivery;

/**
 *
 * @author qjqmf
 */
public class product_delivery {
    public void deliveryproduct(){
        processing(); // 출고 준비중
        shipped(); // 출고 완료
        delivery(); // 배달중
        complete(); // 배달완료        
    }
    
    private void processing(){
        System.out.println(" -- 출고 준비중 -- ");
    }
    private void shipped(){
        System.out.println(" -- 출고 완료 -- ");
    }
    private void delivery(){
        System.out.println(" -- 배달중 -- ");
    }
    private void complete(){
        System.out.println(" -- 배달 완료 -- ");
    }
}
