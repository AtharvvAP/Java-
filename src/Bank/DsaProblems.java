package Bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public  class DsaProblems{
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};

        int minimumPrice=prices[0];
        int maxProfit=0;

        for (int i=1; i<prices.length; i++){
            int currentPrices=prices[i];
            if(currentPrices < minimumPrice){
                minimumPrice=currentPrices;
            }
            int profit=currentPrices - minimumPrice;
            if(profit > maxProfit){
                maxProfit=profit;
            }
        }
        System.out.println("Maximum profit we can gain is " +maxProfit);
    }
}