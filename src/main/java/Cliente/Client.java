/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

/**
 *
 * @author nando
 */

import Interface.IContaCaracteres;
import java.net.MalformedURLException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import javax.swing.JOptionPane;

public class Client {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException{
        try{
            String s;
            int count;
            
            s = JOptionPane.showInputDialog("Entre com a String para contar a quantidade de letras do Token");
            
            //Localiza o serviço remoto
            IContaCaracteres token = (IContaCaracteres) Naming.lookup("rmi://localhost:1099/ContaCaracteres");
            
            //Invoca o método Remoto
            count = token.contacaracteres(s);
            
            //Imprime o resultado devolvido pelo servidor
            JOptionPane.showMessageDialog(null,"O total de caracteres do Token é..: "+count);
            System.out.println("O total de caracteres do Token eh..: "+count);
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
