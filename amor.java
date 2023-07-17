import java.util.Scanner;

public class amor {


    public static void main (String[]args){
            medidorAmor();
        System.out.println("Si pensas que tu amor es mas aun dale al RUN de nuevo");
        }
    static void medidorAmor(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println(
                "Hola! \nVamos a ver quien esta mas enamorado " +
                        "\nDime cuanto me amas del 1 al 10?");
        int suamor = scanner.nextInt();
        String suAmorString;
        int miamor = suamor + 1;
        String limite = "Mi amor supera los limites";


            if (suamor <= 10) {
                System.out.println("Que poco!!! \nYo te amo " + miamor);
            }else if(suamor > 10){
                System.out.println("Que poco!!! \nYo te amo " + miamor + "\n" + limite);
            }else{
                System.out.println("Dije un numero, NU ME RO !!!");

            }
        }

        }







