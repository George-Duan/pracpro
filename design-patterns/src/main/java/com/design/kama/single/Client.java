package com.design.kama.single;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {


//        ShoppingCart shoppingCart = ShoppingCart.getXiaoMingShoppingCart();
//        shoppingCart.add("Apple");
//        ShoppingCart shoppingCart2 = ShoppingCart.getXiaoMingShoppingCart();
//        shoppingCart2.add("Banana");
//        shoppingCart2.add("Banana");
//        shoppingCart2.add("Banana");
//
//        ShoppingCart shoppingCart3 = ShoppingCart.getXiaoMingShoppingCart();
//        shoppingCart3.add("Orange");
//        shoppingCart3.add("Orange");
//        shoppingCart3.add("Orange");
//        shoppingCart3.reduce("Banana");
//
//        shoppingCart3.list();

        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            String [] s = line.split(" ");
            ShoppingCart shoppingCart = ShoppingCart.getXiaoMingShoppingCart();
            shoppingCart.add(s[0], Integer.parseInt(s[1]));
        }
        ShoppingCart shoppingCart = ShoppingCart.getXiaoMingShoppingCart();
        shoppingCart.list();
    }
}
