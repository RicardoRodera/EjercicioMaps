public class Cuenta {
    private int numero;
    private int balance;

    public Cuenta(int numero, int balance) {
        this.numero = numero;
        this.balance = balance;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuenta[" +
                "numero=" + numero +
                ", balance=" + balance +
                ']';
    }
}
