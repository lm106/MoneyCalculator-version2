package MoneyCalculator_2;

import java.util.Scanner;

/**
 *
 * @author Luzma
 * @version 16-10-2020
 * @since Práctica en Aula
 */
public class MoneyCalculator {
    private Money money;
    private ExchangeRate exchangeRate;
    private Currency currency;

    public MoneyCalculator() {
    }
    public void control(){
        input();
        process();
        output();
    }
    private void input() {
        System.out.println("Introduce una cantidad en dolares: ");
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.next());
        System.out.println("Introduce una divisa: ");
        String isoCode = scanner.next();
        currency = new Currency(isoCode, "..", "...");
        money = new Money(amount, currency);
    }
    private void process(){
        exchangeRate =  new ExchangeRate(currency, new Currency("EUR", "...","..."));
    }
    private void output(){
        System.out.println(money.getAmount() + " " + currency.getIsoCode() + " equivale a " + money.getAmount()* exchangeRate.getRate() + "EUR");
    }
}
