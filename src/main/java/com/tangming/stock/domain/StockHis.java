package com.tangming.stock.domain;

import javax.persistence.Entity;

/**
 * 股票历史数据
 *
 * @author : 唐明
 * @date : Created in 17:54 2017/8/29
 * @modified By:
 */
@Entity
public class StockHis {
    //TODO: 完成该实体类
    private String code;
    private String date; //日期
    private String openingPri; //该日期开盘价
    private String closeingPri;//该日期收盘价
    private String priChg;//本日收盘价与昨日收盘价差值
    private String priChgPer;//本日收盘价与昨日收盘价涨跌百分比
    private String LowPri;//该日期最低价；
    private String HighPri;//该日期最高价；
    private String transNum;//成交的总股票数
    private String turnover;//成交总额
    private String turnoverRate;//换手率


}
