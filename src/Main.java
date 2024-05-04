import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Calculadora.class);
        try {
            Calculadora calc = new Calculadora();
            System.out.println(calc.add(d, 10d));
            System.out.println(calc.sub(10d, 10d));
            System.out.println(calc.mul(10d, 10d));
            System.out.println(calc.div(10d, 0d));
        } catch (ExceptionCalculadora exceptionCalculadora) {
            logger.info("teste, isto é um log");
            throw new RuntimeException(exceptionCalculadora);
        }
    }
}