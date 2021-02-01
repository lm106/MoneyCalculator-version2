/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyCalculator_2;

/**
 *
 * @author Luzma
 * @version 16-10-2020
 * @since Práctica en Aula
 */

public class ExchangeRate {
    private final Currency from;
    private final Currency to;
    private final double rate;

    public ExchangeRate(Currency from, Currency to) {
        this.from = from;
        this.to = to;
        this.rate = getExchangeRate(from.getIsoCode(), to.getIsoCode());
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getRate() {
        return rate;
    }
    
    private static Double getExchangeRate(String from, String to){
        String line =  "{'USD_EUR':{'val': 0.860155} 'GBP_EUR':{'val': 0.860155}";
        line = "{'".concat(line.substring(line.indexOf(from)));
        String processed_line = line.substring(line.indexOf(to) + 12, line.indexOf("}"));
        return Double.parseDouble(processed_line);
                
    }
}
