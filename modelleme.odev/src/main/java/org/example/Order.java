package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Order {
    private int id;
    private int userId;
    private int shipperId;
    private int paymentTypeId;
    private int cargoNo;
    private LocalDate orderDate;
    private boolean isDelivered;
    private double totalPrice;

    public Order() {
    }

    public Order(int id, int userId, int shipperId, int paymentTypeId, int cargoNo, LocalDate orderDate, boolean isDelivered, double totalPrice) {
        this.id = id;
        this.userId = userId;
        this.shipperId = shipperId;
        this.paymentTypeId = paymentTypeId;
        this.cargoNo = cargoNo;
        this.orderDate = orderDate;
        this.isDelivered = isDelivered;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public int getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public int getCargoNo() {
        return cargoNo;
    }

    public void setCargoNo(int cargoNo) {
        this.cargoNo = cargoNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
