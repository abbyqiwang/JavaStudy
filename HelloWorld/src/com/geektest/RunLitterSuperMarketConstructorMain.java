package com.geektest;

import com.geektest.supermarket.LitterSuperMarketConstructor;
import com.geektest.supermarket.Merchandise;
import com.geektest.supermarket.MerchandiseConstructor;

import java.util.ArrayList;

public class RunLitterSuperMarketConstructorMain {
    public static void main(String[] args) {
        LitterSuperMarketConstructor litterSuperMarketConstructor = new LitterSuperMarketConstructor
                ("我家超市", "世纪大道666", 200, 0, 10);

        MerchandiseConstructor merchandiseGift1 = new MerchandiseConstructor
                ("赠品-面条", "GIFT1", 200, 5, 0.5);
        MerchandiseConstructor merchandiseGift2 = new MerchandiseConstructor
                ("赠品-碗", "GIFT2", 200, 5, 0.5);

        for (int i = 0; i < 10; i++) {
            MerchandiseConstructor merchandiseConstructor = new MerchandiseConstructor
                    ("商品" + (i + 1), "ID" + i, 10, (1 + Math.random()) * 200,
                            Math.random() * 200, merchandiseGift1);
        }
    }
}
