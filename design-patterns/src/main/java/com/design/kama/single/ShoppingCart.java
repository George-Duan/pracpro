package com.design.kama.single;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Integer> productItemMap = new HashMap<>();

    private static ShoppingCart xiaoMingShoppingCart = new ShoppingCart();

    private ShoppingCart() {
    }

    public static ShoppingCart getXiaoMingShoppingCart(){
        return xiaoMingShoppingCart;
    }


    public void add(String productName){
        productItemMap.merge(productName, 1, Integer::sum);
    }

    public void add(String productName, int num){
        productItemMap.merge(productName, num, Integer::sum);
    }

    public void reduce(String productName){
        Integer existNum = productItemMap.get(productName);
        if(existNum == null || existNum == 0){
            throw new RuntimeException("购物车商品不存在");
        }else {
            productItemMap.put(productName, existNum - 1);
        }
    }

    public void reduce(String productName, int num){
        Integer existNum = productItemMap.get(productName);
        if(existNum == null || existNum == 0){
            throw new RuntimeException("购物车商品不存在");
        }else {
            productItemMap.put(productName, existNum - num);
        }
    }

    public void list(){
        productItemMap.keySet().forEach(key -> {
                    System.out.println(key + "\t" + productItemMap.get(key));
                }
        );
    }
}
