package com.geektest;

import com.geektest.person.Customer;
import com.geektest.supermarket.LitterSuperMarket;
import com.geektest.supermarket.Merchandise;

import java.util.Scanner;

public class RunLitterSuperMarketMain {
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
            m.purchaseprice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }
        
        System.out.println("超市开门了！");

        boolean open = true;
        Scanner scanner = new Scanner(System.in);

        while (open) {
            System.out.println("本店叫做" + litterSuperMarket.superMarketName);
            System.out.println("本店地址" + litterSuperMarket.address);
            System.out.println("本店共有停车位" + litterSuperMarket.parkingCount);
            System.out.println("今天营业额为" + litterSuperMarket.incomingSum);
            System.out.println("共有商品" + litterSuperMarket.merchandises.length + "种");

            //定义客户信息
            Customer customer = new Customer();
            customer.name = "客户编号" + (int) (Math.random() * 10000);
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;
            System.out.println(customer.name + "带了" + customer.money);

            if (customer.isDrivingCar) {
                if (litterSuperMarket.parkingCount > 0) {
                    System.out.println("欢迎" + customer.name + "驾车而来，本店已准备停车位，停车免费！");
                    litterSuperMarket.parkingCount--;
                } else {
                    System.out.println("非常抱歉，本店停车位已满，欢迎下次光临！");
                    continue;
                }
            } else {
                System.out.println("欢迎" + customer.name + "光临本店！");
            }

            //客户购买总金额
            double totalCount = 0;
            //客户购买金额临时统计
            double tempCount = 0;
            while (true) {
                System.out.println("本店提供" + all.length + "种商品，请输入商品编号（输入0则退出购物）：");
                int index = scanner.nextInt() - 1;
                if (index == -1) {
                    System.out.println("欢迎下次光临！");
                    break;
                } else if (index >= 0 && index <= all.length) {
                    Merchandise m = all[index];
                    System.out.println("您选择的商品是" + m.name + ",该商品售价为：" + m.soldPrice + "，请问你需要多少个？");
                    int numToBuy = scanner.nextInt();
                    if (numToBuy <= 0) {
                        System.out.println("不买看看也好，欢迎继续挑选。");
                        continue;
                    }
                    if (numToBuy > m.count) {
                        System.out.println("当前商品库存不足，欢迎继续挑选。");
                        continue;
                    }
                    tempCount += m.soldPrice * numToBuy;
                    //当购买的商品总金额超过客户所带现金则购物停止，否则允许继续购物
                    if (tempCount <= customer.money) {
                        //统计该客户当前购买所有商品的总金额
                        totalCount += m.soldPrice * numToBuy;
                        //统计该商品剩余个数
                        m.count -= numToBuy;
                        //统计该商品累计销售个数
                        litterSuperMarket.merchandiseSold[index] += numToBuy;
                    } else {
                        System.out.println("您所带的金额不足，欢迎继续挑选。");
                        continue;
                    }
                } else {
                    System.out.println("您输入的商品编号有误，请重新输入.");
                    continue;
                }
            }

            customer.money -= totalCount;
            if (customer.isDrivingCar) {
                litterSuperMarket.parkingCount++;
            }

            System.out.println("顾客" + customer.name + "共消费了" + totalCount);
            litterSuperMarket.incomingSum += totalCount;

            System.out.println("是否继续营业？");
            open = scanner.nextBoolean();
        }
        System.out.println("超市关门了！");
        System.out.println("今天的销售总额是" + litterSuperMarket.incomingSum + ",销售情况如下：");

        for (int i = 0; i < all.length; i++) {
            Merchandise m = all[i];
            int numsold = litterSuperMarket.merchandiseSold[i];
            if (numsold > 0) {
                double incomming = m.soldPrice * numsold;
                double netIncomming = (m.soldPrice - m.purchaseprice) * numsold;
                System.out.println(m.name + "共销售了" + numsold + "个，销售额为" + incomming + "，净利润为" + netIncomming);
            }
        }
    }
}
