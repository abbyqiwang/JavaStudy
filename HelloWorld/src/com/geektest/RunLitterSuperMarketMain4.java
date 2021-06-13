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
    }
}
