
package algoritmo_numprimo;

import java.util.Scanner;
public class Numero_Primos {
public Scanner Leerr=new Scanner(System.in);
public int NumeroIngresado;
  
    
    
    public Numero_Primos(){
        
    }
    
    
    public void Numero_primos(){
        
        System.out.println("Ingrese un numero natural para determinar los numeros primos que lo anteceden:");//SE INGRESA UN NUMERO PARA EVALUAR LOS PRIMOS QUE LO ANTECEDEN
        NumeroIngresado=Leerr.nextInt();//Sirve para Capturar la entrada realizada por el usuario
        if (NumeroIngresado>0) {
        boolean Marca[]=new boolean[NumeroIngresado+1];//VECTOR QUE SERVIRA PARA ALMACENAR SI EL TIPO DE NUMERO EVALUADO ES PRIMO O NO 
        for (int i = 2; i < Math.sqrt(NumeroIngresado); i++) {//SE UTILIZA EL ALGORITMO DE CRIBA DE ERATÓSTENES
            
            if (!Marca[i]) {//Mientras el Tamaño del vector es distinto de el contador i
                
                for (int j = i*2; j < NumeroIngresado; j+=i)
                {
                 
                    Marca[j]=true;//Marcara las casillas como True Cuando es un numero no Primo
                   
                }
                
            }
            
        }    
        
        
       System.out.println("Los Numero Primos hasta el numero natural ingresado "+NumeroIngresado+" son:");//Sirve de mensaje informativo
        for (int i = 2; i < Marca.length; i++) {//Este ciclo recorre el vector de tipo Boolean 
                if (Marca[i]==false) {//Condicion que se cumplira al encontrar casillas identificadas como False los cuales Seran los numeros Primos que Anteceden a N
                   
                        System.out.println(i);//Imprime los numeros Primos que anteceden al Numero Ingresado
                    
            }
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println("");//sirve para espaciado al final de cada ejecucion del programa
        }
        
       }
        else{
            System.out.println("Ingrese solo numeros naturales"+"\n");
            Numero_primos();
        }
        
    }
}
