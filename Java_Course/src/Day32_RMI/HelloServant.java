package Day32_RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServant extends UnicastRemoteObject implements HelloService{
    protected HelloServant() throws RemoteException {
        super();
    }

    @Override
    public String printMessage() throws RemoteException {
        return "Welcome to my Server";
    }
}
