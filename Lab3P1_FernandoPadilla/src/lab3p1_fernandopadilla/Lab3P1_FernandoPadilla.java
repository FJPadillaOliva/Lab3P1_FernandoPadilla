package lab3p1_fernandopadilla;

import java.util.Scanner;

public class Lab3P1_FernandoPadilla {
    //Fernando Jose Padilla Oliva 12141213

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char resp = 's';
        int opcion;

        while (resp == 's' || resp == 'S') {
            System.out.println("1.Triangulo");
            System.out.println("2.Calculando PI");
            System.out.println("3.Construyendo casas");
            System.out.println("4.Salida");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    char carac;
                    int tam;
                    System.out.println("Ingrese el tamaño de la figura: ");
                    tam = read.nextInt();
                    System.out.println("Ingrese el caracter para el triangulo superior: ");
                    carac = read.next().charAt(0);
                    int c = tam;
                    while (tam < 4 || tam > 16) {
                        System.out.println("Datos incorrectos. Ingrese un numero entre 4 y 16 ");
                        System.out.println("Ingrese el tamaño de la figura: ");
                        tam = read.nextInt();
                        System.out.println("Ingrese el caracter para el triangulo superior: ");
                        carac = read.next().charAt(0);
                        c = tam;
                    }//cierre validacion
                    for (int i = tam; i > 0; i--) {

                        for (int j = c; j < tam; j++) {
                            System.out.print(" ");
                        }
                        c--;
                        for (int k = i; k >= 1; k--) {
                            System.out.print(carac);
                        }//fin for interno
                        System.out.println();
                    }//fin for externo
                    break;
                case 2:
                    int k;
                    System.out.println("Ingrese el limite de la sumatoria: ");
                    k = read.nextInt();
                    float sumatoria = 0;
                    double numer = 1;
                    float denom = 0;
                    for (int n = 0; n <= k; n++) {
                        
                        numer = Math.pow(-1, n);
                        denom = (2 * n) + 1;

                        float expo = (float) numer;
                        sumatoria = sumatoria + (expo / denom);
                    }//fin for
                    float resultsuma = sumatoria;
                    resultsuma *= 4;
                    System.out.println("El resultado de la sumatoria es: " + resultsuma);
                    break;
                case 3:
                    System.out.println("Ingrese el tamaño de la figura: ");
                    int size = read.nextInt();
                    c = size;
                    while (size < 4){
                        System.out.println("Dato incorrecto. Debe ser mayor a 4");
                        System.out.println("Ingrese el tamaño de la figura: ");
                        size = read.nextInt();
                        c = size;
                    }//fin validacion
                    for (int i = 0;i < size; i++){
                        int l = (size*2)-1;
                        for (int j = 0; j < l; j++){
                            if (i+j >= l/2 && j-i <= l/2){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    for (int i = 1;i <= size; i++){
                        for (int j = 1; j <= size*2-1; j++){
                            System.out.print("+");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    resp = 'n';
                    break;
            }//fin switch
        }//fin while
    }//fin public static void

}//fin public class
