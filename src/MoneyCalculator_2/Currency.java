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

public class Currency {
    private final String isoCode;
    private final String name;
    private final String symbol;

    public Currency(String isoCode, String name, String symbol) {
        this.isoCode = isoCode;
        this.name = name;
        this.symbol = symbol;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
    
}
