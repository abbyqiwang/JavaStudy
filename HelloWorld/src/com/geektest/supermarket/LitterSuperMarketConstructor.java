package com.geektest.supermarket;

public class LitterSuperMarketConstructor {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerchandiseConstructor[] merchandiseConstructors;
    public int[] merchandiseSold;

    public LitterSuperMarketConstructor
            (String superMarketName, String address, int parkingCount, double incomingSum,int merchandisesCount) {
        this.superMarketName = superMarketName;
        this.address = address;
        this.parkingCount = parkingCount;
        this.incomingSum = incomingSum;
        this.merchandiseConstructors = new MerchandiseConstructor[merchandisesCount];
        this.merchandiseSold = new int[merchandiseConstructors.length];
    }
}
