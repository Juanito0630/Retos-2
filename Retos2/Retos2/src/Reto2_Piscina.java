import java.util.Scanner;
public class Reto2_Piscina {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int Cantidad;
    System.out.println("Digita la cantidad de Participantes: ");
    Cantidad=teclado.nextInt();
    String[] Nombre=new String[Cantidad];
    double[] Tiempo=new double[Cantidad];
    for(int i=0;i<Cantidad;i++) {
        System.out.println("Nombre Participante: ");
        Nombre[i]=teclado.next();
        System.out.println("Tiempo que duro:");
        Tiempo[i]=teclado.nextDouble();
    }
    for(int i=0;i<Cantidad;i++){
        System.out.println("El Participante: "+Nombre[i]+", obtuvo un Tiempo de: "+Tiempo[i]);
        
    
    if(Tiempo[i]<130){
        System.out.println("Felicidades");
    }else if(Tiempo[i]>10.0){
        System.out.println("Has Perdido");
    }teclado.close();
    }
    }
}