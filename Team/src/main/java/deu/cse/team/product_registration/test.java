/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.product_registration;

import deu.cse.team.product_registration.Product;
import deu.cse.team.product_registration.CategoryComponent;
import deu.cse.team.product_registration.Category_composite;

/**
 *
 * @author qjqmf
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CategoryComponent category = new Category_composite("의류");
        CategoryComponent category2 = new Category_composite("전자제품");
  
        CategoryComponent categoryAll = new Category_composite("전체 카테고리");
        categoryAll.add(category);
        categoryAll.add(category2);
  
       /* category.add(new Product("스웨터", "10000"));
        category.add(new Product("청바지", "30000"));
        category.add(new Product("면바지", "2000"));
        category.add(new Product("가디건", "110000"));
 
        //앗 점퍼 카테고리..
        CategoryComponent category3 = new Category_composite("점퍼");
        category.add(category3);
        category3.add(new Product("지오다노 패딩 점퍼", "30000"));
        category3.add(new Product("니 패딩 점퍼", "50000"));
  
        category2.add(new Product("아이팟터치", "280000"));
        category2.add(new Product("디오스 냉장고", "2280000"));
        category2.add(new Product("에어컨", "1280000"));*/
  
        categoryAll.print();
    }
}
