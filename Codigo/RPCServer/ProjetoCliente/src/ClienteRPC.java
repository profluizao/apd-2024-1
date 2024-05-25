import java.net.URI;
import java.net.URL;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class ClienteRPC {
    private XmlRpcClient cliente;

    public ClienteRPC(String urlServidor){
        try {
            XmlRpcClientConfigImpl configCliente = new XmlRpcClientConfigImpl();
            URL url = new URI(urlServidor).toURL();
            configCliente.setServerURL(url);

            this.cliente = new XmlRpcClient();
            this.cliente.setConfig(configCliente);
        } catch (Exception e) {
            System.err.println("RPC Client: " + e);
        }
    }

    public int Somar(int x, int y) throws Exception{
        Object[] params = new Object[]{
            Integer.valueOf(x),
            Integer.valueOf(y)
        };
        Integer res = (Integer)this.cliente.execute("Calc.Adicao", params);
        return res;
    }

    public int Subtrair(int x, int y) throws Exception{
        Object[] params = new Object[]{
            Integer.valueOf(x),
            Integer.valueOf(y)
        };
        Integer res = (Integer)this.cliente.execute("Calc.Subtracao", params);
        return res;
    }

    public int Multiplicar(int x, int y) throws Exception{
        Object[] params = new Object[]{
            Integer.valueOf(x),
            Integer.valueOf(y)
        };
        Integer res = (Integer)this.cliente.execute("Calc.Multiplicacao", params);
        return res;
    }

    public int Dividir(int x, int y) throws Exception{
        Object[] params = new Object[]{
            Integer.valueOf(x),
            Integer.valueOf(y)
        };
        Integer res = (Integer)this.cliente.execute("Calc.Divisao", params);
        return res;
    }

}
