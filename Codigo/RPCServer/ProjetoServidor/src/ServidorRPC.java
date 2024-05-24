import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.webserver.WebServer;

public class ServidorRPC {
    
    public ServidorRPC(){
        try {
            WebServer ws = new WebServer(8185);
            XmlRpcServer servidor = ws.getXmlRpcServer();
            PropertyHandlerMapping map = new PropertyHandlerMapping();
            map.addHandler("Calc", Calculadora.class);
            servidor.setHandlerMapping(map);
            ws.start();
            System.out.println("Servidor iniciado com sucesso.");
        } catch (Exception e) {
            System.err.println("RPC Server: " + e);
        }
    }
}
