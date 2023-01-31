import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class server {
    public static void main(String[] args) throws Exception {
        AddC obj = new AddC();
        Naming.rebind("ADD", obj);
        System.out.println("server is STARTED!!! ");
        LocateRegistry.createRegistry(2020);
    }
}
// The RMI registry is a simple name server provided by the Java RMI (Remote
// Method Invocation) framework. It is used to store the names and references of
// remote objects in a way that enables clients to look up and invoke methods on
// those remote objects.

// The RMI registry runs on the server and listens on a well-known port for
// requests from clients. Clients can use the Naming class to bind remote
// objects to names in the registry, and then look up those objects using their
// names. Once a remote object has been looked up, a client can invoke its
// methods just as it would with a local object.

// The RMI registry is an important component of RMI-based systems, as it
// provides a central point for clients to find remote objects and allows for
// dynamic registration and deregistration of remote objects as the system
// evolves.