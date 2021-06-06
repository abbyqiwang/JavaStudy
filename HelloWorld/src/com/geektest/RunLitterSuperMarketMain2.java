package com.geektest;

import com.geektest.supermarket.LitterSuperMarket;
import com.geektest.supermarket.Merchandise;

import java.util.Scanner;

public class RunLitterSuperMarketMain2 {
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

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("第二件半价，请输入需要购买的商品：");
            int index = scanner.nextInt() - 1;
            if (index == -1) {
                System.out.println("欢迎下次光临！");
                break;
            } else if (index >= 0 && index < all.length) {
                System.out.println("请输入你需要购买的商品个数：");
                Merchandise m = all[index];
                Merchandise m0 = all[0];
                int buyCount = scanner.nextInt();
//                double totalCost = m.buy(buyCount);
                double totalCost = m.buyAndPrint(buyCount, true);
                boolean m0Bigger = m0.totalValueBigger(m);
                boolean m1Bigger = m.isTheBiggerTotalValue(litterSuperMarket);
                System.out.println("商品1的总价值比用户选择的要大：" + m0Bigger);
                System.out.println(m.name + "是商品总价值最高的：" + m1Bigger);
                System.out.println("商品总价是" + totalCost);
            } else {
                System.out.println("您输入的商品编号有误，请重新输入。");
                continue;
            }
        }
    }
}
