package com.geektest.supermarket;

public class MerchandiseConstructor {
    private String name;
    private String id;
    private int count;
    private double soldPrice;
    private double purchasePrice;
    private MerchandiseConstructor gift;

    // >> ToDO 构造方法
    private MerchandiseConstructor() {
    }

    public MerchandiseConstructor(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

    public MerchandiseConstructor(String name, String id, int count, double soldPrice, double purchasePrice, MerchandiseConstructor gift) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
        this.gift = gift;
        this.describe();
    }

    private void describe() {
        System.out.println("商品名是" + name + "，商品ID为" + id
                + "，当前商品个数为" + count + "个，商品进价为" + purchasePrice
                + "，商品售价为" + soldPrice + "，商品净利润为" + (soldPrice - purchasePrice)
                + "，赠品是" + gift.name);
    }
}
