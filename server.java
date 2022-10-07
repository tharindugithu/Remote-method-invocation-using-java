import java.rmi.Naming;

public class server {
    public static void main(String[] args) throws Exception {
        AddC obj = new AddC();
        Naming.rebind("ADD", obj);
        System.out.println("server is STARTED!!! ");
    }
}
