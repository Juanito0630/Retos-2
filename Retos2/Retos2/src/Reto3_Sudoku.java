import java.util.Scanner;
public class Reto3_Sudoku {
    public static void main(String[] args){
        Scanner teclado=new Scanner (System.in);
        int Cant1;
        int Cant2;
        int Suma=0;
        int [][] Sudoku=new int [6][6];
        
        for (int F=0;F<9;F++){
            for (int C=0;C<9;C++){
                System.out.println("Escribe un Numero del 1 al 9: ");
                Sudoku[F][C]=teclado.nextInt();
            }
        }
        for (int C=0;C<9;C++){
            for (int F=0;F<9;F++){
                System.out.println(Sudoku[F][C]);
            }
            System.out.println("");
        }

        System.out.println("Escribe la cantidad de numeros a Sumar: ");
        Cant1=teclado.nextInt();
        int [] Suma2=new int[Cant1];
        for (int j=0;j<Cant1;j++){
            System.out.println("Ingrese el valor: " +j);
            Suma=teclado.nextInt();
            Suma=Suma+Suma2[j];
        }
        
        System.out.println("Escribe la cantidad de numeros a Sumar: ");
        Cant2=teclado.nextInt();
        for (int i=0;i<Cant2;i++){
            System.out.println("Ingrese el valor: " +i);
            Suma=teclado.nextInt();
            Suma=Suma+Suma2[i];
        }
        System.out.println("La suma es:" +Suma);
        teclado.close();
    }  
}