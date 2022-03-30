import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Banco {
    Map<String, Cuenta> cuentasBancarias = new HashMap<String, Cuenta>();

    public void addCuenta(String nombre, int numCuenta, int balance) {
        Cuenta cuenta = new Cuenta(numCuenta, balance);
        this.cuentasBancarias.put(nombre, cuenta);
    }

    public Cuenta getCuenta(String nombre) {
        return this.cuentasBancarias.get(nombre);
    }

    public void listarClientes() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Set<String> clientes = this.cuentasBancarias.keySet();
        for (String nombre : clientes) {
            sb.append(nombre);
            sb.append(" ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public void imprimirConKeySet() {
        StringBuilder sb = new StringBuilder();
        Set<String> clientes = this.cuentasBancarias.keySet();
        for (String nombre : clientes) {
            sb.append(nombre);
            sb.append(" -> ");
            sb.append(this.cuentasBancarias.get(nombre));
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public void imprimirConEntrySet() {
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<String, Cuenta>> clientes = this.cuentasBancarias.entrySet();
        for(Map.Entry<String, Cuenta> cliente: clientes){
            sb.append(cliente.getKey());
            sb.append(" -> ");
            sb.append(cliente.getValue());
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
