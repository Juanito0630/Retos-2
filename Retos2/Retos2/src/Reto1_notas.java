import java.util.Scanner;
public class Reto_notas {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int Cant, Sum=0;
        System.out.println("Numero de notas a Calcular: ");
        Cant=teclado.nextInt();
        int []Nota=new int[Cant];

        for(int i=0;i<Cant;i++){
            System.out.println("Escribe la Nota: ");
            Nota[i]=teclado.nextInt();
            Sum=Sum+Nota[i];
        }

        float Prom=Sum/Nota.length;
        System.out.println("El Promedio del Estudiante es: "+Prom);
        
        if(Prom<3){
            System.out.println("El Estudiante Reprobo");
        } else if (Prom>=3.0 || Prom<=4.0){
            System.out.println("El Estudiante paso por poco");
        } else if (Prom>4.0){
            System.out.println("El Estudiante Aprobo");
        }
        teclado.close();
    }
}