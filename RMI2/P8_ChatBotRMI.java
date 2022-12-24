import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Arrays;

public class P8_ChatBotRMI extends UnicastRemoteObject implements InterfaceRemota {
    
    public P8_ChatBotRMI() throws RemoteException{//constructor
        super();
    }
    
    public String task(String pregunta){
        String preguntas[]=new String[10]; //Arreglo de preguntas 
        String respuestas[]=new String[10]; //Arreglo de respuestas 
        /*Asignacion de las preguntas*/
        preguntas[0]="En que estado vives?";
        preguntas[1]="Que edad tienes?";
        preguntas[2]="En que escuela estudias?";
        preguntas[3]="Tienes pareja?";
        preguntas[4]="Cual es tu color favorito?";
        preguntas[5]="Salvaras el semestre?";
        preguntas[6]="Que tipo de musica escuchas?";        
        preguntas[7]="Tocas algun instrumento?";
        preguntas[8]="Te gusta cantar?";
        preguntas[9]="Adicto a Netflix?";
        /*Asignacion de las respuestas*/
        respuestas[0]="Estado de Mexico";
        respuestas[1]="19";
        respuestas[2]="ESCOM";
        respuestas[3]="No";
        respuestas[4]="Borgoña";
        respuestas[5]="Eso espero";
        respuestas[6]="Rock/Grunge";
        respuestas[7]="Si, la guitarra";
        respuestas[8]="Si";
        respuestas[9]="Mucho";
        
        String respuesta="";
        if(Arrays.asList(preguntas).contains(pregunta)){
            for(int i=0;i<preguntas.length;i++){
                if(pregunta.equals(preguntas[i])){
                        respuesta+=respuestas[i];
                }
            }
        }else{
                respuesta+="La pregunta es invalida"; 
            }
        return respuesta;
    }
    
    public static void main(String[] args) {
            try{
            Registry reg=LocateRegistry.createRegistry(4444);
            P8_ChatBotRMI c= new P8_ChatBotRMI();//registro abre el puerto 
            reg.rebind("Chat", c);//la instancia y el identificador
            System.out.println("SERVIDOR LISTO");
        }catch(RemoteException e){}
    }
}