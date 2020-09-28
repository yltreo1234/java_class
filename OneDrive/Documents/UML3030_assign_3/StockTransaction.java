/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uml.sarah_oertly.stocktrader;
import java.math.BigDecimal;
import java.sql.Timestamp;
/**
 *
 * @author yltre
 */
public class StockTransaction {
    private BigDecimal price;
    private StockSymbolType stockSymbol;
    private Timestamp time;
    
    public StockTransaction(BigDecimal price, StockSymbolType stockSymbol,
            Timestamp time) {
        this.price = price;
        this.stockSymbol = stockSymbol;
        this.time = time;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public StockSymbolType getStockSymbol() {
        return stockSymbol;
    }
    public String toString() {
        return "StockQuote{" +"price=" + price + ", stockSymbol='"
    + stockSymbol + '\'' + ", time=" + time + '}';
    }
}

