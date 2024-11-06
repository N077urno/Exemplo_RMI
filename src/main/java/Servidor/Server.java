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
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException{
       try{
        //Cria uma instância do Objeto Remoto
        IContaCaracteres contador = new ContaCaracteres();
        
        //Inicializa o Registro RMI na porta 1099
        LocateRegistry.createRegistry(1099);
        
        //Vincula o objeto ao registro com um nome único
        Naming.rebind("rmi://localhost:1099/ContaCaracteres", contador);
        
        System.out.println("Servidor RMI iniciado na porta 1099. Aguardando Chamadas...");
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
