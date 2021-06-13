package com.geektest;

import com.geektest.supermarket.LitterSuperMarket;
import com.geektest.supermarket.Merchandise;

public class RunLitterSuperMarketMain3 {
    public static void main(String[] args) {
        //实例化一个小超市
        LitterSuperMarket litterSuperMarket = new LitterSuperMarket();
        //给超市的参数赋值
        litterSuperMarket.address = "世纪大道666";
        litterSuperMarket.superMarketName = "我家超市";
        litterSuperMarket.parkingCount = 200;
        //给超市定义商品个数
        litterSuperMarket.merchandises = new Merchandise[5];
        //统计用的数组
        litterSuperMarket.merchandiseSold = new int[litterSuperMarket.merchandises.length];
        //商品数组的引用
        Merchandise[] all = litterSuperMarket.merchandises;

        Merchandise giftNoodle = new Merchandise();
        giftNoodle.name = "赠品-面条";
        giftNoodle.id = "GIFT001";
        giftNoodle.count = 2000;
        giftNoodle.soldPrice = 5;
        giftNoodle.purchasePrice = 0.05;

        Merchandise giftBowl = new Merchandise();
        giftBowl.name = "赠品-碗";
        giftBowl.id = "GIFT002";
        giftBowl.count = 1000;
        giftBowl.soldPrice = 8;
        giftBowl.purchasePrice = 0.08;

        //给商品赋值
        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + (i + 1);
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
            m.gift = giftNoodle;
            m.describe();
        }

        int index = 0;
        Merchandise m1 = all[index];
        Merchandise paramRef = all[2];

        int paramPrime = 7;
        System.out.println("调用前");
        System.out.println(paramPrime);
        System.out.println(paramRef);

        m1.willOutsideChangePrime(paramPrime);
        m1.willOutsideChangeRef(paramRef);
        System.out.println("调用后");
        System.out.println(paramPrime);
        System.out.println(paramRef);

        m1.gift = giftBowl;
        System.out.println("gift变换前");
        m1.describe();
        paramRef.describe();
        m1.changeToGift(paramRef);
        System.out.println("gift变换后");
        paramRef.describe();

        Merchandise gitOfM;
        m1.describe();
        gitOfM = m1.getGift();
        gitOfM.purchasePrice = gitOfM.purchasePrice * 10;
        System.out.println("修改后");
        m1.describe();
    }
}
