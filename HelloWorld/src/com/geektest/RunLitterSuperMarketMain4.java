package com.geektest;

import com.geektest.supermarket.LitterSuperMarket;
import com.geektest.supermarket.Merchandise;

public class RunLitterSuperMarketMain4 {
    public static void main(String[] args) {
        //新建一个小超市
        LitterSuperMarket litterSuperMarket = new LitterSuperMarket();
        litterSuperMarket.address = "世纪大道666";
        litterSuperMarket.superMarketName = "我家超市";
        litterSuperMarket.parkingCount = 200;
        litterSuperMarket.merchandises = new Merchandise[200];
        litterSuperMarket.merchandiseSold = new int[litterSuperMarket.merchandises.length];

        Merchandise[] all = litterSuperMarket.merchandises;

        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + (i + 1);
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }

        System.out.println("LitterSuperMarket的方法是" + litterSuperMarket);
        System.out.println("利润最高的是");
        Merchandise m1 = litterSuperMarket.getBiggestProfitMerchandise();
        m1.describeMerchandise();
        System.out.println("利润最高的对象是" + m1);

        int toBeAdd = 300;
        if (!m1.hasEnoughCount(toBeAdd)) {
            System.out.println("补充库存");
            litterSuperMarket.incomingSum -= toBeAdd * m1.purchasePrice;
            m1.addCount(toBeAdd);
            System.out.println("当前超市剩余总收入为" + litterSuperMarket.incomingSum);
        }
    }
}
