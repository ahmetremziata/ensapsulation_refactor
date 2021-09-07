package com.replace_temp_version_1;

public class Order {
  private  Integer quantity;
  private Item item;

  public Order(Integer quantity, Item item) {
    this.item = item;
    this.quantity = quantity;
  }

  public Double price() {
    var basePrice =  this.quantity * this.item.getPrice();
    var discountFactor = 0.98;
    if (basePrice > 100) {
      discountFactor -= 0.03;
    }
    return basePrice * discountFactor;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }
}
