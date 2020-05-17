
package pl.edu.wszib.jwd.homebudget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class HomeBudgetApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeBudgetApplication.class, args);


    /*    double stanKonta;
        double wydatki;
        double całkowiteWydatki = 0.0;
        double saldoKonta;

        Scanner wpiszDane = new Scanner(System.in);

        System.out.println("Wpisz swój dochód: ");

        stanKonta = wpiszDane.nextDouble();

        do {
            System.out.println("Wpisz sumę swoich wydatków: ");
            wydatki = wpiszDane.nextDouble();

            całkowiteWydatki += wydatki;

            System.out.println("Wpisz kolejne wydatki lub wpisz 0 by obliczyć swój końcowy stan konta: ");
        }
        while (wydatki > 0);

        saldoKonta = stanKonta - całkowiteWydatki;

        if (saldoKonta < 0) {
            System.out.println("Przekroczyłeś budżet o: " + saldoKonta);
            System.out.println("Po roku takiego trybu życia będziesz na minusie: " + 12*saldoKonta);
        } else if (saldoKonta > 0) {
            System.out.println("Jesteś poniżej budżetu. Pozostałe saldo konta to: " + saldoKonta);
            System.out.println("Po roku takiego trybu życia zaoszczędzisz: " + 12*saldoKonta);
        } else {
            System.out.println("Wydałeś cały budżet: " + saldoKonta);
            System.out.println("Po roku takiego trybu życia nie zaoszczędzisz nic." + 12*saldoKonta);
        }



    }

    */
    }
}
