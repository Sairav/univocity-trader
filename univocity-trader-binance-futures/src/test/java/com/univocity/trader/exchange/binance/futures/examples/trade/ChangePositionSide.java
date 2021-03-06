package com.univocity.trader.exchange.binance.futures.examples.trade;

import com.univocity.trader.exchange.binance.futures.RequestOptions;
import com.univocity.trader.exchange.binance.futures.SyncRequestClient;
import com.univocity.trader.exchange.binance.futures.examples.constants.PrivateConfig;

/**
 * @author : wangwanlu
 * @since : 2020/3/25, Wed
 **/
public class ChangePositionSide {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        System.out.println(syncRequestClient.changePositionSide(true));
    }
}
