package com.tangming.stock.service;

import com.tangming.stock.domain.Stock;
import com.tangming.stock.utils.HttpConnectionUtil;
import org.springframework.stereotype.Service;

/**
 * 获取股票实时数据
 *
 * @author : 唐明
 * @date : Created in 15:57 2017/8/29
 * @modified By:
 */
@Service
public class GetRealtimeDateService {
    //新浪股票接口URL
    private static final String SINA_URL = "http://hq.sinajs.cn/list=";//TODO: 改为配置文件方式

    /**
     * 从新浪获取股票实时数据
     *
     * @param stockCode 如：sh600728
     * @return
     */
    public Stock getOneRealtimeDate(String stockCode) {
        String lines = HttpConnectionUtil.requestMethod("GET", SINA_URL + stockCode, null, "GBK");
        lines = lines.substring(lines.indexOf("\"") + 1, lines.lastIndexOf("\""));
        System.out.println(lines);//TODO: 测试打印
        stockCode = stockCode.substring(2);
        String[] subLines = lines.split(",");
        return new Stock(stockCode, subLines[0], subLines[1], subLines[2], subLines[3], subLines[4], subLines[5],
                subLines[6], subLines[7], subLines[8], subLines[9], subLines[10], subLines[11], subLines[12],
                subLines[13], subLines[14], subLines[15], subLines[16], subLines[17], subLines[18], subLines[19],
                subLines[20], subLines[21], subLines[22], subLines[23], subLines[24], subLines[25], subLines[26],
                subLines[27], subLines[28], subLines[29], subLines[30], subLines[31]);
    }

    //TODO: 测试程序
    public static void main(String[] args) {
//        GetRealtimeDateService getRealtimeDate = new GetRealtimeDateService();
//        System.out.println(getRealtimeDate.getOneRealtimeDate("sh600728"));
        String s = "sh600728";
        System.out.println(s.substring(2));
    }

}
