package com.tangming.stock.controller;

import com.tangming.stock.domain.Stock;
import com.tangming.stock.service.GetRealtimeDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取实时数据api
 *
 * @author : 唐明
 * @date : Created in 17:46 2017/8/29
 * @modified By:
 */
@RestController
public class GetRealtimeDateController {
    @Autowired
    private GetRealtimeDateService getRealtimeDateService;


    /**
     * 获取一只股票实时数据
     *
     * @param stockCode
     * @return
     */
    @GetMapping
    public Stock getRealtimeDateApi(String stockCode) {
        return getRealtimeDateService.getOneRealtimeDate(stockCode);
    }


}
