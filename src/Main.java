import java.util.Scanner;

public class Main {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Suma de 5 numeros");
            System.out.println("2. Promedio de 8 numeros");
            System.out.println("3. Rotar 5 numeros a la derecha");
            System.out.println("4. Ordenar 7 numeros de forma ascendente");
            System.out.println("5. Suma de vectores");
            System.out.println("6. Encontrar nombre en una lista");
            System.out.println("7. Encontrar el mayor y el menor en una lista de 10 numeros");
            System.out.println("8. Eliminacion de duplicados en una lista   ");
            System.out.println("9. Multiplicacion de una matriz");
            System.out.println("10. transpuesta de una matriz");
            System.out.println("11. Salir");
            System.out.println("Escoja una opcion del menu:");
            num = leer.nextInt();
            switch (num) {
                case 1:
                    System.out.println("La suma de estos 5 numeros es: " + suma());
                    break;
                case 2:
                    System.out.println("El promedio de estos numeros es: " + prom());
                    break;
                case 3: {
                    System.out.println("Diga 5 numeros para rotarlos");
                    int[] numeros = new int[5];
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Numero: " + (i + 1));
                        numeros[i] = leer.nextInt();
                    }
                    rotarDerecha(numeros);
                    System.out.println("Este es su arreglo rotado:");
                    mostro(numeros);
                    break;
                }
                case 4: {
                    System.out.println("Diga 7 numeros para ordenarlos");
                    int[] numeros = new int[7];
                    for (int i = 0; i < 7; i++) {
                        System.out.println("Numero: " + (i + 1));
                        numeros[i] = leer.nextInt();
                    }
                    burbuja(numeros);
                    System.out.println("Este es su arreglo ordenado en forma ascendente: ");
                    mostrobur(numeros);
                    break;
                }
                case 5:
                int[] vec1=new int[3];
                    System.out.println("Agregue el valor en el eje x del primer vector");
                    vec1[0]= leer.nextInt();
                    System.out.println("Agregue el valor en el eje y del primer vector");
                    vec1[1]= leer.nextInt();
                    System.out.println("Agregue el valor en el eje z del primer vector");
                    vec1[2]= leer.nextInt();
                int[] vec2=new int [3];
                    System.out.println("Agregue el valor en el eje x del segundo vector");
                    vec2[0]= leer.nextInt();
                    System.out.println("Agregue el valor en el eje y del segundo vector");
                    vec2[1]= leer.nextInt();
                    System.out.println("Agregue el valor en el eje z del segundo vector");
                    vec2[2]= leer.nextInt();
                    sumv(vec1,vec2);

                    break;
                case 6:
                    System.out.println("Escriba de cuantos nombres es la lista");
                    int n= leer.nextInt();
                    leer.nextLine();
                    String[]nom=new String[n];
                    for (int i=0;i<n;i++){
                        System.out.println("Escriba el nombre numero " +(i+1));
                        nom [i]=leer.nextLine();
                    }
                    buscnom(nom,n);
                    break;
                case 7:
                    System.out.println("Ingrese 10 valores para determinar el mayor y el menor");
                    int[] mayo=new int[10];
                    for(int i=0;i<10;i++){
                        System.out.println("Numero : " + (i+1));
                        mayo[i]=leer.nextInt();
                    }
                    int mayor=may(mayo);
                    int menor=men(mayo);
                    System.out.println("El numero mayor de esta lista es : "+ mayor);
                    System.out.println("El numero menor de esta lista es : "+menor);
                    break;
                case 8:
                    System.out.println("Ingrese 10 valores ");
                    int[] rep=new int[10];
                    for(int i=0;i<10;i++){
                        System.out.println("Numero : " + (i+1));
                        rep[i]=leer.nextInt();
                    }
                    duplicado(rep);
                    break;
                case 9: {
                    int[][] matriz1 = new int[4][4];
                    int[][] matriz2 = new int[4][4];
                    int[][] resultado = new int[4][4];
                    System.out.println("Ingrese los valores para la primera matriz 4x4:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print("Valor para la posicion [" + (i + 1) + "][" + (j + 1) + "]: ");
                            matriz1[i][j] = leer.nextInt();
                        }
                    }
                    System.out.println("Ingrese los valores para la segunda matriz 4x4:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print("Valor para la posicion [" + (i + 1) + "][" + (j + 1) + "]: ");
                            matriz2[i][j] = leer.nextInt();
                        }
                        mult(matriz1, matriz2, resultado);

                    }
                    System.out.println("Resultado de la multiplicación:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(resultado[i][j] + "\t");
                        }
                        System.out.println();
                    }
                }
                    break;
                case 10:
                    int[][] matriz = new int[3][3];
                    int[][] trans= new int[3][3];
                    System.out.println("Ingrese los valores para la  matriz 3x3:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Valor para la posicion [" + (i + 1) + "][" + (j + 1) + "]: ");
                            matriz[i][j] = leer.nextInt();
                        }
                        trans(matriz,trans);
                    }
                    System.out.println("Matriz transpuesta:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(trans[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    break;
                case 11:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Escoja otra opcion");
                    break;
            }
        } while (num != 11);
    }

    public static int suma() {
        System.out.println("Diga 5 números para sumarlos");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1) + ":");
            arr[i] = leer.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + arr[i];
        }
        return suma;
    }

    public static double prom() {
        System.out.println("Diga 8 números para sacar su promedio");
        Double[] arr = new Double[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Número " + (i + 1) + ":");
            arr[i] = leer.nextDouble();
        }
        double suma = 0;
        for (int i = 0; i < 8; i++) {
            suma = suma + arr[i];
        }
        return suma / 8;
    }
    public static void rotarDerecha(int[] arr) {
        if (arr.length == 0) return;
        int ultimo = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = ultimo;
    }

    public static void mostro(int[] arr) {
        for (int i=0;i<5;i++) {
            System.out.print(arr[i] + " - ");
        }
    }
    public static void mostrobur(int[] arr) {
        for (int i=0;i<7;i++) {
            System.out.print(arr[i] + ".");
        }
    }
    public static void burbuja(int[]arr){
     for(int i=0;i<6;i++) {
         for (int j=0;j<6;j++){
             if (arr[j]>arr[j+1]){
                 int aux=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=aux;
             }
         }
     }
    }
    public static void sumv(int[]vec1,int[]vec2){
     int[] res =new int[3];
     for (int i=0;i<3;i++){
         res[i]=vec1[i]+vec2[i];
     }
        System.out.println("El vector resultante es : ");
        System.out.println(res[0] + "x ," + res[1] + "y ," + res[2] +"z");

    }
    public static void buscnom(String[]nom,int n){
        System.out.println("Cual es el nombre que desea buscar?");
        String nombre = leer.nextLine();
        boolean encontrar = false;
        for (int i=0;i<n;i++){
            if (nom[i].equals(nombre)){
                System.out.println("El nombre " + nombre +"Si se encuentra en la lista");
                encontrar=true;
                break;
            }
            System.out.println("El nombre " + nombre + "no se encuentra en la lista");
        }

    }
    public static int may(int[] mayo){
        int mayor=mayo[0];
        for(int i=0;i<10;i++){
            if(mayo[i]>mayor){
                mayor=mayo[i];
            }
        }
        return mayor;
    }
    public static int men(int[] mayo){
        int menor=mayo[0];
        for(int i=0;i<10;i++){
            if(mayo[i]>menor){
                menor=mayo[i];
            }
        }
        return menor;
    }
    public static void duplicado(int[] arr) {
        System.out.println("Eliminando duplicados:");
        for (int i = 0; i < arr.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void mult(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
    }
    public static void trans(int [][]matriz,int[][]trans){
        trans[0][0]=matriz[0][0];
        trans[0][1]=matriz[1][0];
        trans[0][2]=matriz[2][0];
        trans[1][0]=matriz[0][1];
        trans[1][1]=matriz[1][1];
        trans[1][2]=matriz[2][1];
        trans[2][0]=matriz[0][2];
        trans[2][1]=matriz[1][2];
        trans[2][2]=matriz[2][2];
    }
}
