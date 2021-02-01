package MoneyCalculator_1;

import java.util.Scanner;

/**
 *
 * @author Luzma
 * @version 16-10-2020
 * @since Práctica en Aula
 */

public class MoneyCalculator {
    private double amount;
    private double exchangeRate;
    String currency;
    
    public MoneyCalculator(){
        
    }
    public void control(){
        input();
        process();
        output();
    }
    private static Double getExchangeRate(String from, String to){
        String line = "{'USD_EUR':{'val': 0.860155} 'GBP_EUR':{'val': 0.860155}";
        line = "{'".concat(line.substring(line.indexOf(from)));
        String processed_line = line.substring(line.indexOf(to) + 12, line.indexOf("}"));
        return Double.parseDouble(processed_line);
    }
    private void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una divisa: ");
        currency = scanner.next();
        System.out.println("Introduce una cantidad en " + currency + ": ");
        this.amount = Double.parseDouble(scanner.next());
    }
    private void process(){
        this.exchangeRate = getExchangeRate(currency, "EUR");
    }
    private void output(){
        System.out.println(amount + " " + currency + " equivale a " + amount*exchangeRate + "EUR");
    }
}
