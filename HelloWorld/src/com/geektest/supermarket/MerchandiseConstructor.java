package com.geektest.supermarket;

public class MerchandiseConstructor {
    private String name;
    private String id;
    private int count;
    private double soldPrice;
    private double purchasePrice;
    public MerchandiseConstructor gift;

    // >> ToDO 构造方法
    private MerchandiseConstructor() {
    }

    public MerchandiseConstructor(int merchandiseCount, double priceFloat, int count) {
        MerchandiseConstructor[] all = new MerchandiseConstructor[merchandiseCount];
        for (int i = 0; i < merchandiseCount; i++) {
            MerchandiseConstructor m = new MerchandiseConstructor();
            m.name = "商品" + (i + 1);
            m.id = "ID" + i;
            m.count = count;
            m.purchasePrice = Math.random() * priceFloat;
            m.soldPrice = (1 + Math.random()) * priceFloat;
            all[i] = m;
            m.describe();
        }
    }

    private void describe() {
        System.out.println("商品名是" + name + "，商品ID为" + id
                + "，当前商品个数为" + count + "个，商品进价为" + purchasePrice
                + "，商品售价为" + soldPrice + "，商品净利润为" + (soldPrice - purchasePrice));
    }
}
