package com.tangming.stock.repository;

import com.tangming.stock.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 股票实体接口
 *
 * @author : 唐明
 * @date : Created in 16:49 2017/8/28
 * @modified By :
 */
public interface StockRepository extends JpaRepository<Stock,String>{
}
