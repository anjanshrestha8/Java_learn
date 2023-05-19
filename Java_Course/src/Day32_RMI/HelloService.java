package Day32_RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {
    public String printMessage() throws RemoteException;
//    public String sayHi() throws RemoteException;
}
