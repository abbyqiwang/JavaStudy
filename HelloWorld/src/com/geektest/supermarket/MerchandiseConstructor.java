package com.geektest.supermarket;

public class MerchandiseConstructor {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;
    public MerchandiseConstructor gift;

    // >> ToDO 构造方法
    public MerchandiseConstructor(int merchandiseCount, double priceFloat, int count) {
        for (int i = 0; i < merchandiseCount; i++) {
            this.name = "商品" + (i + 1);
            this.id = "ID" + i;
            this.count = count;
            this.purchasePrice = Math.random() * priceFloat;
            this.soldPrice = (1 + Math.random()) * priceFloat;
        }
    }
 }
