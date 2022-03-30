public class Principal {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.addCuenta("Manolo", 1, 56);
        banco.addCuenta("Will", 2, 9975);
        banco.addCuenta("Juana", 3, 446);
        
        banco.listarClientes();
//        banco.imprimirConEntrySet();
    }
}
