/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

/**
 *
 * @author nando
 */
import Interface.IContaCaracteres;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;


public class ContaCaracteres extends UnicastRemoteObject implements IContaCaracteres {
    protected ContaCaracteres() throws RemoteException{
        super();
    }

    @Override
    public int contacaracteres(String s) throws RemoteException {
        return(s.length());
    }
    
}
