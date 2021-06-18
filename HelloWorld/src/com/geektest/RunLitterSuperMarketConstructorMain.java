package com.geektest;

import com.geektest.supermarket.LitterSuperMarketConstructor;
import com.geektest.supermarket.MerchandiseConstructor;

public class RunLitterSuperMarketConstructorMain {
    public static void main(String[] args) {
        LitterSuperMarketConstructor litterSuperMarketConstructor = new LitterSuperMarketConstructor
                ("我家超市", "世纪大道666", 200, 0, 10);
        MerchandiseConstructor merchandiseConstructor = new MerchandiseConstructor(10, 200, 200);
    }
}
