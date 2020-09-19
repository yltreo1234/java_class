/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uml.sarah_oertly.stocktrader;

import static com.sun.javafx.util.Utils.sum;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Double.sum;
import static java.lang.Float.sum;
import static java.lang.Integer.sum;
import static java.lang.Long.sum;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yltre
 */
public class StockTraderApp {

    private static Iterable<String> syms;
    
       
public static void main(String[] args) throws IOException {
    
        URL url = new URL("https://finance.yahoo.com/quote/SRNE?p=SRNE");
        URLConnection urlCon = url.openConnection();
        urlCon.addRequestProperty("User-Agent",
                "Mozilla/4.0 (compatible MSIE 6.0 windows NT 5.0)");
        InputStreamReader inStream = new InputStreamReader(
                urlCon.getInputStream());
        BufferedReader buff = new BufferedReader(inStream);
        String price = "fluctuates";
        String line = buff.readLine();
        while(line != null) {
    if(line.contains("[\"KO\",")) {
        System.out.println(line);
        int target = line.indexOf("[\"KO\",");
        int deci = line.indexOf(".", target);
        int start = deci;
        while(line.charAt(start) != '\"') {
            start--;
        }
        price = line.substring(start + 1, deci + 3);
}
    line = buff.readLine();
}
    System.out.println(price);

        String[] name = {"CL", "CNI", "GOOG", "APPL", "IBM",
    
        "AMZ", "TSLA", "GE", "SNRE"};

    
System.out.println("Total food money: " + price);


List<Stock> stocks = new ArrayList<Stock>();
List<Stock> deals = new ArrayList<Stock>();
List<Stock> infs = new ArrayList<Stock>();

for (String sym : syms) {
    stocks.add(new Stock(sym, 0));
}
for (Stock stock : stocks) {
            double total = 0;
            
    double DEAL_LIMIT = 0.0;
        
            stock.percentOfHigh = DEAL_LIMIT/total;
    total += stock.percentOfHigh;

    if (stock.percentOfHigh() <= DEAL_LIMIT){
        deals.add(stock);}
        else {
        infs.add(stock);
}
        

    
    System.out.println("commodity prices");

}
    
    }

    private static class Stock {

        private double percentOfHigh;
        
        int price;

        public Stock() {
        }

        private Stock(String sym, int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private double percentOfHigh() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        

        }
}

