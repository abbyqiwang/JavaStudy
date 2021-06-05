package com.geektest.supermarket;

public class Merchandise {
    public String name;
    public String id;
    public int count;
    //商品销售价
    public double soldPrice;
    //商品进货价
    public double purchaseprice;

    public double buy(int countToBuy) {
        if (count < countToBuy) {
            System.out.println("库存不足");
            return -1;
        }
        System.out.println("商品单价为" + soldPrice);
        int fullPrice = countToBuy / 2 + countToBuy % 2;
        int halfPrice = countToBuy - fullPrice;
        double totalPrice = fullPrice * soldPrice + halfPrice * soldPrice / 2;
        count-=countToBuy;
        return totalPrice;
    }
}
