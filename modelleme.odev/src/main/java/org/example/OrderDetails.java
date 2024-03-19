package org.example;

public class OrderDetails {
    private int id;
    private int orderId;
    private int bookId;
    private int quantity;
    private String cargoNo;
    private String orderStatus;
    private double price;
    private double discount;

    public OrderDetails() {
    }

    public OrderDetails(int id, int bookId,int orderId ,int quantity, String cargoNo, String orderStatus, double price, double discount) {
        this.id = id;
        this.orderId=orderId;
        this.bookId = bookId;
        this.quantity = quantity;
        this.cargoNo = cargoNo;
        this.orderStatus = orderStatus;
        this.price = price;
        this.discount = discount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCargoNo() {
        return cargoNo;
    }

    public void setCargoNo(String cargoNo) {
        this.cargoNo = cargoNo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
