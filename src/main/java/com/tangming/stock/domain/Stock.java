package com.tangming.stock.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 股票实体类
 *
 * @author : 唐明
 * @date : Created in 10:42 2017/8/28
 * @modified By:
 */
@Entity
public class Stock {
    @Id
    private String id;
    private String stockName; //股票名称
    private String openingPri; //今日开盘价
    private String yesterdayClosingPri;//昨日收盘价
    private String currentPri;//当前价格
    private String dayHighPri;//今日最高价；
    private String dayLowPri;//今日最低价；
    private String competitivePri;//竞买价，即“买一”报价；
    private String reservePri;//竞卖价，即“卖一”报价；
    private String transNum;//成交的股票数，由于股票交易以一百股为基本单位，所以在使用时，通常把该值除以一百；
    private String turnover;//成交金额，单位为“元”，为了一目了然，通常以“万元”为成交金额的单位，所以通常把该值除以一万；

    private String buyOneNum;//“买一”申请4695股，即47手；
    private String buyOnePri;//“买一”报价；
    private String buyTwoNum;//“买二”股数
    private String buyTwoPri;//“买二”报价
    private String buyThreeNum;//“买三”股数
    private String buyThreePri;//“买三”报价
    private String buyFourNum;//“买四”股数
    private String buyFourPri;//“买四”报价
    private String buyFiveNum;//“买五”股数
    private String buyFivePri;//“买五”报价

    private String sellOneNum;//“卖一”股数
    private String sellOnePri;//“卖一”报价；
    private String sellTwoNum;//“卖二”股数
    private String sellTwoPri;//“卖二”报价
    private String sellThreeNum;//“卖三”股数
    private String sellThreePri;//“卖三”报价
    private String sellFourNum;//“卖四”股数
    private String sellFourPri;//“卖四”报价
    private String sellFiveNum;//“卖五”股数
    private String sellFivePri;//“卖五”报价
    private String date;//日期；
    private String time;//时间；

    protected Stock(){

    }

    public Stock(String stockName, String openingPri) {
        this.stockName = stockName;
        this.openingPri = openingPri;

    }

    public Stock(String stockName, String openingPri, String yesterdayClosingPri, String currentPri, String
            dayHighPri, String dayLowPri, String competitivePri, String reservePri, String transNum, String turnover,
                 String buyOneNum, String buyOnePri, String buyTwoNum, String buyTwoPri, String buyThreeNum, String
                         buyThreePri, String buyFourNum, String buyFourPri, String buyFiveNum, String buyFivePri,
                 String sellOneNum, String sellOnePri, String sellTwoNum, String sellTwoPri, String sellThreeNum,
                 String sellThreePri, String sellFourNum, String sellFourPri, String sellFiveNum, String sellFivePri,
                 String date, String time) {
        this.stockName = stockName;
        this.openingPri = openingPri;
        this.yesterdayClosingPri = yesterdayClosingPri;
        this.currentPri = currentPri;
        this.dayHighPri = dayHighPri;
        this.dayLowPri = dayLowPri;
        this.competitivePri = competitivePri;
        this.reservePri = reservePri;
        this.transNum = transNum;
        this.turnover = turnover;
        this.buyOneNum = buyOneNum;
        this.buyOnePri = buyOnePri;
        this.buyTwoNum = buyTwoNum;
        this.buyTwoPri = buyTwoPri;
        this.buyThreeNum = buyThreeNum;
        this.buyThreePri = buyThreePri;
        this.buyFourNum = buyFourNum;
        this.buyFourPri = buyFourPri;
        this.buyFiveNum = buyFiveNum;
        this.buyFivePri = buyFivePri;
        this.sellOneNum = sellOneNum;
        this.sellOnePri = sellOnePri;
        this.sellTwoNum = sellTwoNum;
        this.sellTwoPri = sellTwoPri;
        this.sellThreeNum = sellThreeNum;
        this.sellThreePri = sellThreePri;
        this.sellFourNum = sellFourNum;
        this.sellFourPri = sellFourPri;
        this.sellFiveNum = sellFiveNum;
        this.sellFivePri = sellFivePri;
        this.date = date;
        this.time = time;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getOpeningPri() {
        return openingPri;
    }

    public void setOpeningPri(String openingPri) {
        this.openingPri = openingPri;
    }

    public String getYesterdayClosingPri() {
        return yesterdayClosingPri;
    }

    public void setYesterdayClosingPri(String yesterdayClosingPri) {
        this.yesterdayClosingPri = yesterdayClosingPri;
    }

    public String getCurrentPri() {
        return currentPri;
    }

    public void setCurrentPri(String currentPri) {
        this.currentPri = currentPri;
    }

    public String getDayHighPri() {
        return dayHighPri;
    }

    public void setDayHighPri(String dayHighPri) {
        this.dayHighPri = dayHighPri;
    }

    public String getDayLowPri() {
        return dayLowPri;
    }

    public void setDayLowPri(String dayLowPri) {
        this.dayLowPri = dayLowPri;
    }

    public String getCompetitivePri() {
        return competitivePri;
    }

    public void setCompetitivePri(String competitivePri) {
        this.competitivePri = competitivePri;
    }

    public String getReservePri() {
        return reservePri;
    }

    public void setReservePri(String reservePri) {
        this.reservePri = reservePri;
    }

    public String getTransNum() {
        return transNum;
    }

    public void setTransNum(String transNum) {
        this.transNum = transNum;
    }

    public String getTurnover() {
        return turnover;
    }

    public void setTurnover(String turnover) {
        this.turnover = turnover;
    }

    public String getBuyOneNum() {
        return buyOneNum;
    }

    public void setBuyOneNum(String buyOneNum) {
        this.buyOneNum = buyOneNum;
    }

    public String getBuyOnePri() {
        return buyOnePri;
    }

    public void setBuyOnePri(String buyOnePri) {
        this.buyOnePri = buyOnePri;
    }

    public String getBuyTwoNum() {
        return buyTwoNum;
    }

    public void setBuyTwoNum(String buyTwoNum) {
        this.buyTwoNum = buyTwoNum;
    }

    public String getBuyTwoPri() {
        return buyTwoPri;
    }

    public void setBuyTwoPri(String buyTwoPri) {
        this.buyTwoPri = buyTwoPri;
    }

    public String getBuyThreeNum() {
        return buyThreeNum;
    }

    public void setBuyThreeNum(String buyThreeNum) {
        this.buyThreeNum = buyThreeNum;
    }

    public String getBuyThreePri() {
        return buyThreePri;
    }

    public void setBuyThreePri(String buyThreePri) {
        this.buyThreePri = buyThreePri;
    }

    public String getBuyFourNum() {
        return buyFourNum;
    }

    public void setBuyFourNum(String buyFourNum) {
        this.buyFourNum = buyFourNum;
    }

    public String getBuyFourPri() {
        return buyFourPri;
    }

    public void setBuyFourPri(String buyFourPri) {
        this.buyFourPri = buyFourPri;
    }

    public String getBuyFiveNum() {
        return buyFiveNum;
    }

    public void setBuyFiveNum(String buyFiveNum) {
        this.buyFiveNum = buyFiveNum;
    }

    public String getBuyFivePri() {
        return buyFivePri;
    }

    public void setBuyFivePri(String buyFivePri) {
        this.buyFivePri = buyFivePri;
    }

    public String getSellOneNum() {
        return sellOneNum;
    }

    public void setSellOneNum(String sellOneNum) {
        this.sellOneNum = sellOneNum;
    }

    public String getSellOnePri() {
        return sellOnePri;
    }

    public void setSellOnePri(String sellOnePri) {
        this.sellOnePri = sellOnePri;
    }

    public String getSellTwoNum() {
        return sellTwoNum;
    }

    public void setSellTwoNum(String sellTwoNum) {
        this.sellTwoNum = sellTwoNum;
    }

    public String getSellTwoPri() {
        return sellTwoPri;
    }

    public void setSellTwoPri(String sellTwoPri) {
        this.sellTwoPri = sellTwoPri;
    }

    public String getSellThreeNum() {
        return sellThreeNum;
    }

    public void setSellThreeNum(String sellThreeNum) {
        this.sellThreeNum = sellThreeNum;
    }

    public String getSellThreePri() {
        return sellThreePri;
    }

    public void setSellThreePri(String sellThreePri) {
        this.sellThreePri = sellThreePri;
    }

    public String getSellFourNum() {
        return sellFourNum;
    }

    public void setSellFourNum(String sellFourNum) {
        this.sellFourNum = sellFourNum;
    }

    public String getSellFourPri() {
        return sellFourPri;
    }

    public void setSellFourPri(String sellFourPri) {
        this.sellFourPri = sellFourPri;
    }

    public String getSellFiveNum() {
        return sellFiveNum;
    }

    public void setSellFiveNum(String sellFiveNum) {
        this.sellFiveNum = sellFiveNum;
    }

    public String getSellFivePri() {
        return sellFivePri;
    }

    public void setSellFivePri(String sellFivePri) {
        this.sellFivePri = sellFivePri;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
