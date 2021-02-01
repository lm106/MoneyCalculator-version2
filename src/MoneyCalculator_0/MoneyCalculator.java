package MoneyCalculator_0;

import java.util.Scanner;

/**
 *
 * @author Luzma
 * @version 16-10-2020
 * @since Práctica en Aula
 * @version 0
 * 
 * Es código espaghetti
 */
public class MoneyCalculator {

    public static void main(String[] args) {
        System.out.println("Introduce una cantidad en dolares: ");
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.next());
        double exchangeRate = getExchangeRate("USD", "EUR");
        System.out.println(amount + " USD equivale a " + amount * exchangeRate + " EUR");
        
    }
    private static Double getExchangeRate(String from, String to){
        String line = "{'USD_EUR':{'val': 0.860155}";
        String processed_line = line.substring(line.indexOf(to) + 12, line.indexOf("}"));
        return Double.parseDouble(processed_line);
    }
    
}
