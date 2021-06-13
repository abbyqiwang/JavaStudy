package com.geektest.supermarket;

public class Merchandise {
    public String name;
    public String id;
    public int count;
    //商品销售价
    public double soldPrice;
    //商品进货价
    public double purchasePrice;
    //赠品
    public Merchandise gift;

    // >> TODO 参数的传递
    public double buy(int countToBuy) {
        if (count < countToBuy) {
            System.out.println("库存不足");
            return -1;
        }
        System.out.println("商品单价为" + soldPrice);
        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalPrice = fullPriceCount * soldPrice + halfPriceCount * soldPrice / 2;
        count -= countToBuy;
        return totalPrice;
    }

    public boolean totalValueBigger(Merchandise merchandise) {
        return count * purchasePrice > merchandise.purchasePrice * merchandise.count;
    }

    public boolean isTheBiggerTotalValue(LitterSuperMarket litterSuperMarket) {
        double totalValue = count * purchasePrice;
        for (int i = 0; i < litterSuperMarket.merchandises.length; i++) {
            Merchandise m = litterSuperMarket.merchandises[i];
            double newTotalValue = m.count * m.purchasePrice;
            if (totalValue < newTotalValue) {
                return false;
            }
        }
        return true;
    }

    public double buyAndPrint(int countToBuy, boolean printLeft) {
        if (count < countToBuy) {
            System.out.println("库存不足");
            if (printLeft) {
                System.out.println("剩余库存为：" + count);
            }
            return -1;
        }
        System.out.println("商品单价为" + soldPrice);
        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalPrice = fullPriceCount * soldPrice + halfPriceCount * soldPrice / 2;
        count -= countToBuy;
        if (printLeft) {
            System.out.println("剩余库存为：" + count);
        }
        return totalPrice;
    }

    public void willOutsideChangeRef(Merchandise m) {
        m = gift;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void willOutsideChangePrime(int intVal) {
        intVal = 999999;
    }

    public void describe() {
        System.out.println("商品名是" + name + "，商品单价为" + soldPrice
                + "，赠品为" + gift.name + "，赠品进价为" + gift.purchasePrice);
    }

    public void changeToGift(Merchandise m1) {
        m1.gift = gift;
    }

    public Merchandise getGift() {
        return gift;
    }
}
