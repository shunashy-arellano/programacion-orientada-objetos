import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class P8_ChatBotRMICliente {
    public static void main(String args[]){
        try{
            Registry reg=LocateRegistry.getRegistry("localhost", 4444); //(hostname,port)
            InterfaceRemota n=(InterfaceRemota) reg.lookup("Chat");//Acceder a los objetos
            //n un objeto de una clase que implementara la interfaz InterfaceRemota
            Scanner entrada= new Scanner(System.in);
            while(true){
                System.out.println("Ingrese la pregunta\n");
                String pregunta=entrada.nextLine();;
                System.out.println("La respuesta a tu pregunta es: "+n.task(pregunta));
            }
        }catch(NotBoundException|RemoteException e ){
            System.out.println("Exception: " +e);
        }
    }
}