/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uml.sarah_oertly.stocktrader;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author yltre
 */
public interface StockService {
    StockTransaction getQuote(String symbol, Timestamp timeOfTransaction);
    List<StockTransaction> getQuote(String symbol, Calendar from,
            Calendar until);

    public int add(int i, int i0);
}


