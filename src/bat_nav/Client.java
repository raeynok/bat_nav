package bat_nav;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Remote {
	public int joueCoup(int x, int y) throws RemoteException;
	public int recoitCoup(int x, int y) throws RemoteException;
}