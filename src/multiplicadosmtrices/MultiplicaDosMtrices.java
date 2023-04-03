/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicadosmtrices;

/**
 *
 * @author jhonlaurens
 */
import java.util.Scanner;
public class MultiplicaDosMtrices {
public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);		
		System.out.println("************************************************************************************************************");
    	System.out.println("      					ESTA CALCULADORA MULTIPLICA 2 MATRICES TAMA O n x m									    ");
    	System.out.println("NOTA: El n mero de columnas de la matriz A debe coincidir con el n mero de filas de la matriz B");
    	System.out.println("************************************************************************************************************");
    	System.out.println("");        System.out.print("Numero de filas de la matriz    A : ");
        int filasMatrizA=sn.nextInt();        
        System.out.print("Numero de columnas de la matriz A : ");
        int columnasMatrizA=sn.nextInt();        
        System.out.println("Tama o Matriz A : "+filasMatrizA+"X"+columnasMatrizA);        
        System.out.println("");
        System.out.println("************************************************************");
        System.out.println("");        
        System.out.print("Numero de filas de la matriz    B : ");
        int filasMatrizB=sn.nextInt();        
        System.out.print("Numero de columnas de la matriz B : ");
        int columnasMatrizB=sn.nextInt();        
        System.out.println("Tama o Matriz B : "+filasMatrizB+"X"+columnasMatrizB);        
        System.out.println("");
        System.out.println("************************************************************"); 
        //Se debe cumplir condici n el n mero de columnas de A debe ser igual al n mero de filas de B para que el programa funcione.      
        if(columnasMatrizA==filasMatrizB){        	
        	int	[][]	matrizA		=new int[filasMatrizA][columnasMatrizA];
       		int	[][]	matrizB		=new int[filasMatrizB][columnasMatrizB];
       		int	[][]	resultado	=new int[filasMatrizA][columnasMatrizB];
        	//Ingresar variables de la matriz A.
        	System.out.println("");
        	System.out.println("-> Comienza matriz A");
        	System.out.println("");
        	for(int i=0;i<filasMatrizA;i++){
        		for(int j=0;j<columnasMatrizA;j++){
        			System.out.print("POSICION ("+i+","+j+") matriz A = ");
                	matrizA[i][j]=sn.nextInt();
                }
                
 			}
			//Recorrer matriz A.
			System.out.println("");
			for(int i=0;i<filasMatrizA;i++){
				for(int j=0;j<columnasMatrizA;j++){
					//Imprima matriz A.
					System.out.print(matrizA[i][j]+"   ");					
				}				
				System.out.println("");			
			}			
			//Ingresar variables de la matriz B.
			System.out.println("");
			System.out.println("-> Comienza matriz B");
			System.out.println("");
        	for(int i=0;i<filasMatrizB;i++){
        		for(int j=0;j<columnasMatrizB;j++){
        			System.out.print("POSICION ("+i+","+j+") matriz B = ");
                	matrizB[i][j]=sn.nextInt();
                }
   			}
			//Recorrer matriz B.
			System.out.println("");
			for(int i=0;i<filasMatrizB;i++){
				for(int j=0;j<columnasMatrizB;j++){
					//Imprima matriz B.
					System.out.print(matrizB[i][j]+"   ");
				}
				System.out.println("");
			}
			//Calcula de la multiplicaci n de la matriz a por la matriz B.
			System.out.println("");
			System.out.println("--Resultado de la Matriz A x B --");
			System.out.println("");
			for(int i=0;i<filasMatrizA;i++){
				for(int j=0;j<columnasMatrizB;j++){
					for(int k=0;k<columnasMatrizA;k++){
						resultado[i][j]+=matrizA[i][k]*matrizB[k][j];
					}
					//Imprima matriz equivalente.
					System.out.print(resultado[i][j]+"   ");
				}
				System.out.println("");	
				
			}  
			System.out.println("");	      	
 			System.out.println("Tama o Matriz resultado : "+filasMatrizA+"X"+columnasMatrizB);      
        }else{
        	//Si el n mero de columnas de la matriz A no coincide con el n mero de filas de la matriz B, imprima error.
        	System.out.println("ERROR : El n mero de columnas de la matriz A debe coincidir con el n mero de filas de la matriz B.");
         } 
         	System.out.println("************************************************************");
         	System.out.println("Gracias por utilizar nuestro servicio :)");       
	}
}