/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

/**
 *
 * @author nando
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IContaCaracteres extends Remote{
    int contacaracteres(String s) throws RemoteException;
}
