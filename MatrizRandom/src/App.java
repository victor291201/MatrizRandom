import java.util.function.Function;


public class App {
    public static void main(String[] args) throws Exception {
        int matriz[][] = new int[3][3];
        int num = 0;
        System.out.println("Bienvenido al algoritmo para encontrar la forma de ordenar 9 numeros enteros en orden aleatorio");
        for(int i = 0;i<3;i++){
            for(int e = 0; e<3;e++){
                if(i==0 && e==0){
                    matriz[0][0] = (int)Math.floor(Math.random()*10);
                    num = matriz[0][0];
                }
                else{
                    boolean reg = true;
                    while(reg){
                        if(i!=0 || e!=0){
                            int prueba = (int)Math.floor(Math.random()*10);
                            for(int j=0; j<=i;j++){
                                if(j==i){
                                    for(int k=0; k<e;k++){
                                        if(matriz[j][k]!=prueba && prueba!= num){
                                            matriz[i][e] = prueba;
                                            reg = false;
                                        }
                                        else{
                                            prueba = (int)Math.floor(Math.random()*10);
                                            i=0;
                                            e= 1;
                                        }
                                    } 
                                }
                                else{
                                    for(int k=0; k<3;k++){
                                        if(matriz[j][k]!=prueba && prueba!= num){
                                            matriz[i][e] = prueba;
                                            reg = false;
                                        }
                                        else{
                                            prueba = (int)Math.floor(Math.random()*10);
                                            i=0;
                                            e= 1;
                                        }
                                    } 
                                }
                            }
                            System.out.println("Buscando el mejor lugar para el "+prueba +" ...");
                        }   
                    }
                }
            }
        }for(int i = 0;i<3;i++){
            for(int e = 0; e<3;e++){
                System.out.print(matriz[i][e] + " ");
            }
            
            System.out.println("");
        }
    }
}
