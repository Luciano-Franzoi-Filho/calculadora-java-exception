public class ExceptionLetra extends Exception {
    public ExceptionLetra(String message) {
        super(message);
    }

    public ExceptionCalculadora erroAoInformarLetra() {
        return new ExceptionCalculadora("Não faço conta com numeros");
    }
}
