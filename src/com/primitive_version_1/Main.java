package com.primitive_version_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
      List<Order> orders = new ArrayList<>();
      Order order = new Order();
      order.orderId = 1;
      order.priority = "high";
      Order order2 = new Order();
      order2.orderId = 1;
      order2.priority = "rush";
      Order order3 = new Order();
      order3.orderId = 1;
      order3.priority = "low";
      orders.add(order);
      orders.add(order2);
      orders.add(order3);
      var highPriorityCount = orders.
          stream().
          filter(it -> it.priority == "high" || it.priority == "rush").
          count();
      System.out.println("Total highPriorityCount count:" + highPriorityCount);
    }
}

