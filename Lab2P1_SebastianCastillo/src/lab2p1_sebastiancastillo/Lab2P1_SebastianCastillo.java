package lab2p1_sebastiancastillo;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Lab2P1_SebastianCastillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        int opcion;      
        System.out.println("Ingrese una opcion");
        System.out.println("1. Dibujando Triangulos");
        System.out.println("2. Area de figuras");
        System.out.println("3. Evaluando Numeros");
        System.out.println("4. Salir del programa");
        opcion=leer.nextInt();
        while(opcion<4&&opcion>0){
        if (opcion==1){
            System.out.println("Ingrese longitud a");
            int long_a=leer.nextInt();
            System.out.println("Ingrese longitud b");
            int long_b=leer.nextInt();
            System.out.println("Ingrese longitud c");
            int long_c=leer.nextInt();
            if(long_a<0||long_b<0||long_c<0){
                System.out.println("Las longitudes no puden ser negativas");
            }
            else if(long_a+long_b>long_c&&long_a+long_c>long_b&&long_c+long_b>long_a){
                System.out.println("Es un triangulo");
            }
            else{
                System.out.println("No es un triangulo");
            }
        }//fin opcion 1
        if (opcion==2){
            int figura;
            char respuesta;
            respuesta='S';
            while(respuesta=='s'||respuesta=='S'){
            System.out.println("Ingrese la figura que desea calcular");
            System.out.println("1. rectangulo");
            System.out.println("2. Triangulo");
            System.out.println("3. Ciculo");
            figura=leer.nextInt();
                if(figura==1){
                    System.out.println("Ingrese la base del rectangulo");
                    int base=leer.nextInt();
                    System.out.println("Ingrese la altura del rectangulo");
                    int altura=leer.nextInt();
                    double area=base*altura;
                    System.out.println("El area de la figura es: "+area);
                }
                if(figura==2){
                    System.out.println("Ingrese la base del triangulo");
                    int base=leer.nextInt();
                    System.out.println("Ingrese la altura del triangulo");
                    int altura=leer.nextInt();
                    double area=1/2*base*altura;
                    System.out.println("El area de la figura es: "+area);
                }
                if(figura==3){
                    System.out.println("Ingrese el radio del circulo");
                    int radio=leer.nextInt();
                    double area=Math.PI*Math.pow(radio,2);
                    System.out.println("El area de la figura es:"+area);
                }
                System.out.println("Desea calcular otra figura[S/N]");
                respuesta=leer.next().charAt(0);
            }
        }//fin opcion 2
        if(opcion==3){
            System.out.println("Ingrese el numero que desea evaluar");
            int num=leer.nextInt();
            int num2=1;
            int cont_prim=0;
            while(num2<=num){
                if(num%num2==0){
                    cont_prim=cont_prim+1;
                }
                num2=num2+1;
            }
            if(cont_prim==2&&num%2==0){
                System.out.println(num+" El numero es primo y es par");
            }
            else if (cont_prim==2&&num%2!=0){
                System.out.println(num+" El numero es primo y es impar");
            }
            else if (cont_prim!=2&&num%2==0){
                System.out.println(num+" El numero no es primo y par");
            }
            else{
                System.out.println(num+" El numero no es primo y no es par");
            }
        }//fin opcion 3
        System.out.println("Ingrese una opcion");
        System.out.println("1. Dibujando Triangulos");
        System.out.println("2. Area de figuras");
        System.out.println("3. Evaluando Numeros");
        System.out.println("4. Salir del programa");
        opcion=leer.nextInt();
      }//fin while
    }
    
}
