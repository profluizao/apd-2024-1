public class App {
    public static void main(String[] args) throws Exception {
        String urlServidor = "http://10.40.134.230:8185";
        ClienteRPC cliente = new ClienteRPC(urlServidor);
        System.out.println("Somar: " + cliente.Somar(10, 20));
        System.out.println("Subtrair: " + cliente.Subtrair(90, 20));
        System.out.println("Multiplicar: " + cliente.Multiplicar(50, 70));
        System.out.println("Dividir: " + cliente.Dividir(500, 10));
    }
}
