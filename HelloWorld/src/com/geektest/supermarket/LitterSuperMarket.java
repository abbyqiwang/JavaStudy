package com.geektest.supermarket;

public class LitterSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    //超市总收入
    public double incomingSum;
    public Merchandise[] merchandises;
    public int[] merchandiseSold;

    public Merchandise getBiggestProfitMerchandise() {
        System.out.println("LitterSuperMarket的getBiggestProfitMerchandise的方法是" + this);
        Merchandise curr = null;
        for (int i = 0; i < merchandises.length; i++) {
            Merchandise m = merchandises[i];
            if (curr == null || curr.calculateProfit() < m.calculateProfit()) {
                curr = m;
            }
        }
        return curr;
    }

}
