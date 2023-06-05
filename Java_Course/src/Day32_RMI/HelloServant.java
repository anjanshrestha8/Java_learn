package Day32_RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServant extends UnicastRemoteObject implements HelloService{
    protected HelloServant() throws RemoteException {
        super();
    }

    @Override
    public String printMessage() throws RemoteException {
        int a =10;
        int b = 20;
        int sum = a+b;
        return "The sum is " +sum +"." ;
    }
}
