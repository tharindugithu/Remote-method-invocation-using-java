
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;//create stub and skeliton
/*Stub − A stub is a representation (proxy) of the remote object at client.
It resides in the client system; it acts as a gateway for the client program.
 Skeleton − This is the object which resides on the server side. stub 
 communicates with this skeleton to pass request to the remote object.*/

//implemet of the inteface(AddI)

public class AddC extends UnicastRemoteObject implements AddI {

    protected AddC() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y) throws Exception {

        return x + y;
    }

}
