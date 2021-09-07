package com.primitive_version_3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
      List<Order> orders = new ArrayList<>();
      Order order = new Order();
      order.setOrderId(1);
      order.setPriority("high");
      Order order2 = new Order();
      order2.setOrderId(2);
      order2.setPriority("rush");
      Order order3 = new Order();
      order3.setOrderId(3);
      order3.setPriority("low");
      orders.add(order);
      orders.add(order2);
      orders.add(order3);
      var highPriorityCount = orders.
          stream().
          filter(it -> it.getPriorityString() == "high" || it.getPriorityString() == "rush").
          count();
      System.out.println("Total highPriorityCount count:" + highPriorityCount);
    }
}

