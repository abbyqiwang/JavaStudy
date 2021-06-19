package com.geektest.supermarket;

public class LitterSuperMarketConstructor {
    private String superMarketName;
    private String address;
    private int parkingCount;
    private double incomingSum;
    private MerchandiseConstructor[] merchandiseConstructors;
    private int[] merchandiseSold;

    private LitterSuperMarketConstructor() {
    }

    public LitterSuperMarketConstructor
            (String superMarketName, String address, int parkingCount, double incomingSum, int merchandisesCount) {
        this.superMarketName = superMarketName;
        this.address = address;
        this.parkingCount = parkingCount;
        this.incomingSum = incomingSum;
        this.merchandiseConstructors = new MerchandiseConstructor[merchandisesCount];
        this.merchandiseSold = new int[merchandiseConstructors.length];
        this.describe();
    }

    private void describe() {
        System.out.println("超市名是" + superMarketName + "，超市地址为" + address
                + "，超市停车位共有" + parkingCount + "个，当前超市收入为" + incomingSum);
    }
}
