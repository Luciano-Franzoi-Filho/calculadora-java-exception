public class ExceptionCalculadora extends Exception {

    public ExceptionCalculadora(String message) {
        super(message);
    }
    public ExceptionCalculadora erroAoDividirPorZero() {
        return new ExceptionCalculadora("Não posso divir por zero");
    }
}
