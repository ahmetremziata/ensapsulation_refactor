package com.replace_temp_version_3;

public class Main {

    public static void main(String[] args) throws Exception {
      Item item = new Item();
      item.setPrice(10.34);
      Order order = new Order(10, item);
      System.out.println("Total price:" + order.price());
    }
}

