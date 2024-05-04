import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jdi.CharType;

public class Calculadora {

    private Logger logger;

    public Calculadora() {
    }

    public Double add(Double par1, Double par2) {
        if (isNotNumeric(par1) || isNotNumeric(par2)) {
            throw new erroAoInformarLetra("Não faço conta com letras");
        } else {
            return par1 + par2;
        }
    }

    public Double sub(Double par1, Double par2) {
        if (isNotNumeric(par1) || isNotNumeric(par2)) {
            throw new erroAoInformarLetra("Não faço conta com letras");
        } else {
            return par1 - par2;
        }
    }

    public Double mul(Double par1, Double par2) {
        if (isNotNumeric(par1) || isNotNumeric(par2)) {
            throw new erroAoInformarLetra("Não faço conta com letras");
        } else {
            return par1 * par2;
        }
    }

    public Double div(Double par1, Double par2) throws ExceptionCalculadora {
        if (isNotNumeric(par1) || isNotNumeric(par2)) {
            throw new erroAoInformarLetra("Não faço conta com letras");
        } else if (par2 == 0) {
            throw new ExceptionCalculadora("Não posso dividir por zero");
        } else {
            return par1 / par2;
        }
    }

    private boolean isNotNumeric(Double value) {
        if (value == null) return true; // Verificar se o valor é nulo
        return Double.isNaN(value); // Verificar se não é um número
    }
}